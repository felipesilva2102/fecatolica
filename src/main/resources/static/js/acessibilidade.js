(function () {
    'use strict';

    // === Tamanho de Fonte ===
    var MIN_FONT = 0.8;
    var MAX_FONT = 1.6;
    var STEP = 0.1;

    function getFontSize() {
        try {
            var saved = localStorage.getItem('fecatolica_fontsize');
            return saved ? parseFloat(saved) : 1.0;
        } catch (e) {
            return 1.0;
        }
    }

    function setFontSize(size) {
        document.documentElement.style.fontSize = size + 'rem';
        try {
            localStorage.setItem('fecatolica_fontsize', size.toString());
        } catch (e) { /* silently fail */ }
    }

    function aumentarFonte() {
        var current = getFontSize();
        var novo = Math.min(current + STEP, MAX_FONT);
        setFontSize(novo);
    }

    function diminuirFonte() {
        var current = getFontSize();
        var novo = Math.max(current - STEP, MIN_FONT);
        setFontSize(novo);
    }

    // === Dark Mode ===
    function isDarkMode() {
        try {
            return localStorage.getItem('fecatolica_darkmode') === 'true';
        } catch (e) {
            return false;
        }
    }

    function setDarkMode(ativo) {
        if (ativo) {
            document.documentElement.classList.add('dark-mode');
        } else {
            document.documentElement.classList.remove('dark-mode');
        }
        try {
            localStorage.setItem('fecatolica_darkmode', ativo.toString());
        } catch (e) { /* silently fail */ }
    }

    function toggleDarkMode() {
        setDarkMode(!isDarkMode());
    }

    // === Vela Virtual (24h) ===
    var VELA_DURACAO_MS = 24 * 60 * 60 * 1000;
    var velaInterval = null;

    function getVelaTimestamp() {
        try {
            var ts = localStorage.getItem('fecatolica_vela_ts');
            return ts ? parseInt(ts, 10) : null;
        } catch (e) {
            return null;
        }
    }

    function setVelaTimestamp(ts) {
        try {
            if (ts === null) {
                localStorage.removeItem('fecatolica_vela_ts');
            } else {
                localStorage.setItem('fecatolica_vela_ts', ts.toString());
            }
        } catch (e) { /* silently fail */ }
    }

    function isVelaAcesa() {
        var ts = getVelaTimestamp();
        if (!ts) return false;
        return (Date.now() - ts) < VELA_DURACAO_MS;
    }

    function tempoRestanteVela() {
        var ts = getVelaTimestamp();
        if (!ts) return 0;
        var restante = VELA_DURACAO_MS - (Date.now() - ts);
        return restante > 0 ? restante : 0;
    }

    function formatarTempo(ms) {
        var totalSeg = Math.floor(ms / 1000);
        var h = Math.floor(totalSeg / 3600);
        var m = Math.floor((totalSeg % 3600) / 60);
        var s = totalSeg % 60;
        return h + 'h ' + (m < 10 ? '0' : '') + m + 'm ' + (s < 10 ? '0' : '') + s + 's';
    }

    function atualizarVelaUI() {
        var chama = document.querySelector('.vela-chama');
        var brilho = document.querySelector('.vela-brilho');
        var timer = document.querySelector('.vela-timer');
        if (!chama || !timer) return;

        if (isVelaAcesa()) {
            chama.classList.remove('apagada');
            if (brilho) brilho.classList.remove('apagada');
            timer.textContent = formatarTempo(tempoRestanteVela());
        } else {
            chama.classList.add('apagada');
            if (brilho) brilho.classList.add('apagada');
            timer.textContent = 'Toque para acender';
            setVelaTimestamp(null);
            if (velaInterval) {
                clearInterval(velaInterval);
                velaInterval = null;
            }
        }
    }

    function toggleVela() {
        if (isVelaAcesa()) {
            setVelaTimestamp(null);
            if (velaInterval) {
                clearInterval(velaInterval);
                velaInterval = null;
            }
        } else {
            setVelaTimestamp(Date.now());
            velaInterval = setInterval(atualizarVelaUI, 1000);
        }
        atualizarVelaUI();
    }

    // === Lembrete de Oração (Notification API) ===
    var REMINDER_KEY = 'fecatolica_reminder';

    function isReminderEnabled() {
        try { return localStorage.getItem(REMINDER_KEY) === 'true'; } catch(e) { return false; }
    }

    function setReminderEnabled(enabled) {
        try { localStorage.setItem(REMINDER_KEY, enabled.toString()); } catch(e) {}
    }

    function requestNotificationPermission() {
        if (!('Notification' in window)) return;
        if (Notification.permission === 'granted') {
            setReminderEnabled(true);
            scheduleReminder();
            if (btnReminder) {
                btnReminder.innerHTML = '🔕';
                btnReminder.title = 'Desativar lembretes de oração';
            }
        } else if (Notification.permission !== 'denied') {
            Notification.requestPermission().then(function(perm) {
                if (perm === 'granted') {
                    setReminderEnabled(true);
                    scheduleReminder();
                    if (btnReminder) {
                        btnReminder.innerHTML = '🔕';
                        btnReminder.title = 'Desativar lembretes de oração';
                    }
                } else {
                    if (btnReminder) {
                        btnReminder.innerHTML = '🔔';
                        btnReminder.title = 'Ativar lembretes de oração';
                    }
                }
            });
        }
    }

    var reminderIntervalId = null;

    function scheduleReminder() {
        // Check every minute if it's prayer time (6h, 12h, 18h, 21h)
        if (!isReminderEnabled() || Notification.permission !== 'granted') return;

        if (reminderIntervalId) {
            clearInterval(reminderIntervalId);
            reminderIntervalId = null;
        }

        var prayerMessages = [
            {hour: 6, msg: '🌅 Bom dia! É hora do Angelus da manhã. Reze conosco!'},
            {hour: 12, msg: '☀️ Meio-dia! Hora do Angelus. "O Anjo do Senhor anunciou a Maria..."'},
            {hour: 18, msg: '🌆 Boa tarde! Angelus das 18h. Um momento para agradecer o dia.'},
            {hour: 21, msg: '🌙 Boa noite! Hora de fazer o Exame de Consciência e rezar.'}
        ];

        var lastNotifKey = 'fecatolica_last_notif';
        reminderIntervalId = setInterval(function() {
            if (!isReminderEnabled()) return;
            var now = new Date();
            var h = now.getHours();
            var m = now.getMinutes();
            var today = now.toISOString().split('T')[0];

            prayerMessages.forEach(function(pm) {
                if (h === pm.hour && m === 0) {
                    var key = today + '_' + pm.hour;
                    try {
                        if (localStorage.getItem(lastNotifKey) !== key) {
                            localStorage.setItem(lastNotifKey, key);
                            new Notification('FeCatolica', {
                                body: pm.msg,
                                icon: '/imagens/logo3.png',
                                tag: 'fecatolica-reminder-' + pm.hour
                            });
                        }
                    } catch(e) {}
                }
            });
        }, 60000);
    }

    function toggleReminder() {
        if (isReminderEnabled()) {
            setReminderEnabled(false);
            if (reminderIntervalId) {
                clearInterval(reminderIntervalId);
                reminderIntervalId = null;
            }
            btnReminder.innerHTML = '🔔';
            btnReminder.title = 'Ativar lembretes de oração';
        } else {
            requestNotificationPermission();
        }
    }

    // === Inicializacao ===
    var btnReminder;

    function criarBarraAcessibilidade() {
        if (document.querySelector('.barra-acessibilidade')) return;

        var barra = document.createElement('div');
        barra.className = 'barra-acessibilidade';

        var btnMais = document.createElement('button');
        btnMais.innerHTML = 'A+';
        btnMais.title = 'Aumentar fonte';
        btnMais.setAttribute('aria-label', 'Aumentar tamanho da fonte');
        btnMais.setAttribute('type', 'button');
        btnMais.onclick = function(e) { e.preventDefault(); aumentarFonte(); };

        var btnMenos = document.createElement('button');
        btnMenos.innerHTML = 'A-';
        btnMenos.title = 'Diminuir fonte';
        btnMenos.setAttribute('aria-label', 'Diminuir tamanho da fonte');
        btnMenos.setAttribute('type', 'button');
        btnMenos.onclick = function(e) { e.preventDefault(); diminuirFonte(); };

        var btnDark = document.createElement('button');
        btnDark.innerHTML = '\uD83C\uDF19';
        btnDark.title = 'Alternar modo escuro';
        btnDark.setAttribute('aria-label', 'Alternar modo escuro');
        btnDark.setAttribute('type', 'button');
        btnDark.onclick = function(e) { e.preventDefault(); toggleDarkMode(); };

        barra.appendChild(btnMais);
        barra.appendChild(btnMenos);
        barra.appendChild(btnDark);

        // Botão de lembrete
        if ('Notification' in window) {
            btnReminder = document.createElement('button');
            btnReminder.innerHTML = isReminderEnabled() ? '\uD83D\uDD15' : '\uD83D\uDD14';
            btnReminder.title = isReminderEnabled() ? 'Desativar lembretes de oração' : 'Ativar lembretes de oração';
            btnReminder.setAttribute('aria-label', 'Lembrete de oração');
            btnReminder.setAttribute('type', 'button');
            btnReminder.onclick = function(e) { e.preventDefault(); toggleReminder(); };
            barra.appendChild(btnReminder);
        }

        document.body.appendChild(barra);
    }

    function criarVelaVirtual() {
        if (document.querySelector('.vela-container')) return;

        var container = document.createElement('div');
        container.className = 'vela-container';
        container.title = 'Vela Virtual - clique para acender/apagar';
        container.setAttribute('aria-label', 'Vela virtual de oracao');
        container.onclick = toggleVela;

        container.innerHTML =
            '<div class="vela-corpo">' +
            '  <div class="vela-pavio"></div>' +
            '  <div class="vela-chama apagada"></div>' +
            '  <div class="vela-brilho apagada"></div>' +
            '</div>' +
            '<div class="vela-timer">Toque para acender</div>';

        document.body.appendChild(container);
    }

    function inicializar() {
        setFontSize(getFontSize());
        setDarkMode(isDarkMode());

        criarBarraAcessibilidade();
        criarVelaVirtual();

        if (isVelaAcesa()) {
            velaInterval = setInterval(atualizarVelaUI, 1000);
        }
        atualizarVelaUI();

        // Inicia lembretes se estiverem ativos
        if (isReminderEnabled()) {
            scheduleReminder();
        }
    }

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', inicializar);
    } else {
        inicializar();
    }
})();
