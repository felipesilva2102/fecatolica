(function () {
    'use strict';

    // === Selecao automatica de Misterio por dia da semana ===
    var MISTERIOS_POR_DIA = {
        0: 'Gloriosos',
        1: 'Gozosos',
        2: 'Dolorosos',
        3: 'Gloriosos',
        4: 'Luminosos',
        5: 'Dolorosos',
        6: 'Gozosos'
    };

    function getMisterioHoje() {
        return MISTERIOS_POR_DIA[new Date().getDay()];
    }

    // === Haptic Feedback ===
    function vibrar(ms) {
        if (typeof navigator !== 'undefined' && navigator.vibrate) {
            try {
                navigator.vibrate(ms || 50);
            } catch (e) { /* dispositivo nao suporta */ }
        }
    }

    // === Memoria de Estado (localStorage) ===
    var STORAGE_KEY = 'fecatolica_terco_estado';

    function getEstado() {
        try {
            var raw = localStorage.getItem(STORAGE_KEY);
            return raw ? JSON.parse(raw) : null;
        } catch (e) {
            return null;
        }
    }

    function setEstado(estado) {
        try {
            localStorage.setItem(STORAGE_KEY, JSON.stringify(estado));
        } catch (e) { /* silently fail */ }
    }

    function limparEstado() {
        try {
            localStorage.removeItem(STORAGE_KEY);
        } catch (e) { /* silently fail */ }
    }

    // === Integracao com a pagina ===
    function inicializarTerco() {
        var misterioHoje = getMisterioHoje();
        var elMisterio = document.getElementById('misterio-do-dia');
        if (elMisterio) {
            elMisterio.textContent = 'Misterios de Hoje: ' + misterioHoje;
        }

        var containers = document.querySelectorAll('[data-misterio-auto]');
        for (var i = 0; i < containers.length; i++) {
            containers[i].setAttribute('data-misterio-sugerido', misterioHoje);
        }

        // Adicionar vibracao nas contas do terco existentes
        var botoes = document.querySelectorAll('.bead');
        for (var j = 0; j < botoes.length; j++) {
            (function(btn) {
                var originalClick = btn.onclick;
                btn.onclick = function(e) {
                    vibrar(30);
                    if (originalClick) originalClick.call(btn, e);
                };
            })(botoes[j]);
        }
    }

    // Expor para uso externo
    window.FeTerco = {
        getMisterioHoje: getMisterioHoje,
        vibrar: vibrar,
        getEstado: getEstado,
        limparEstado: limparEstado
    };

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', inicializarTerco);
    } else {
        inicializarTerco();
    }
})();

// === Contas Interativas Compartilhadas ===
window.FeBeads = {
    build: function (config) {
        var THEME = config.themeColor || '#1a4f89';
        var decades = config.decades || [];
        var aveCount = config.aveCount !== undefined ? config.aveCount : 10;
        var hasPN = config.hasPN !== false;
        var hasGloria = config.hasGloria !== false;
        var hasJac = config.hasJaculatoria !== false;
        var totalBeads = 0, clickedBeads = 0;

        var container = document.getElementById('decadesContainer');
        if (!container) return;

        /* ---------- monta card wrapper ---------- */
        var card = document.createElement('div');
        card.className = 'card beads-card';

        var hdr = document.createElement('div');
        hdr.className = 'beads-header';
        hdr.innerHTML = '<h2>\ud83d\udcbf Contas Interativas</h2><p class="muted">Toque em cada conta conforme reza. Acompanhe seu progresso.</p>';
        card.appendChild(hdr);

        var leg = document.createElement('div');
        leg.className = 'beads-legend';
        if (hasPN) leg.innerHTML += '<span class="legend-item"><span class="legend-dot" style="background:' + THEME + ';"></span> Pai-Nosso</span>';
        leg.innerHTML += '<span class="legend-item"><span class="legend-dot" style="background:#2196F3;"></span> Ave-Maria</span>';
        if (hasGloria) leg.innerHTML += '<span class="legend-item"><span class="legend-dot" style="background:#FF9800;"></span> Gl\u00f3ria</span>';
        if (hasJac) leg.innerHTML += '<span class="legend-item"><span class="legend-dot" style="background:#9C27B0;"></span> Jaculat\u00f3ria</span>';
        card.appendChild(leg);

        container.parentNode.insertBefore(card, container);
        card.appendChild(container);

        card.insertAdjacentHTML('beforeend',
            '<div id="progressBar" class="beads-progress-area" style="display:none;">' +
            '<div class="progress-ring-wrap">' +
            '<svg class="progress-ring" width="90" height="90" viewBox="0 0 90 90">' +
            '<circle class="progress-ring-bg" cx="45" cy="45" r="38"/>' +
            '<circle class="progress-ring-fill" id="progressRing" cx="45" cy="45" r="38" style="stroke:' + THEME + ';"/>' +
            '</svg><span class="progress-ring-text" id="progressPct">0%</span></div>' +
            '<div class="progress-details">' +
            '<p id="progressText" class="progress-count">0 de 0 ora\u00e7\u00f5es</p>' +
            '<div class="progress-bar-linear"><div class="progress-bar-track"><div class="progress-bar-fill" id="progressFill"></div></div></div>' +
            '<button class="btn btn-reset" id="btnResetBeads" style="display:none;">\u21ba Recome\u00e7ar contagem</button>' +
            '</div></div>'
        );

        /* ---------- funcoes internas ---------- */
        function makeBead(text, tip, size, color) {
            var el = document.createElement('div');
            el.className = 'rosary-bead';
            el.innerText = text;
            el.title = String(tip || '').replace(/<[^>]+>/g, '');
            el.style.width = size + 'px';
            el.style.height = size + 'px';
            el.style.lineHeight = size + 'px';
            el.onclick = function (e) {
                if (e) { 
                    e.stopPropagation(); 
                    e.preventDefault();
                }
                if (!el.classList.contains('clicked')) {
                    el.classList.add('clicked');
                    el.style.backgroundColor = color;
                    el.style.color = 'white';
                    el.style.borderColor = color;
                    el.style.animation = 'beadPop 0.35s ease';
                    clickedBeads++;
                    updateProgress();
                    if (window.FeTerco && window.FeTerco.vibrar) window.FeTerco.vibrar(30);
                }
                return false;
            };
            return el;
        }

        function updateProgress() {
            if (totalBeads === 0) return;
            var pct = Math.round(clickedBeads / totalBeads * 100);
            var fill = document.getElementById('progressFill');
            if (fill) fill.style.width = pct + '%';
            var ring = document.getElementById('progressRing');
            if (ring) {
                var c = 2 * Math.PI * 38;
                ring.style.strokeDasharray = c;
                ring.style.strokeDashoffset = c - (c * pct / 100);
            }
            var pe = document.getElementById('progressPct');
            if (pe) pe.textContent = pct + '%';
            var te = document.getElementById('progressText');
            if (te) te.textContent = clickedBeads + ' de ' + totalBeads + ' ora\u00e7\u00f5es';
            if (clickedBeads >= totalBeads) {
                if (te) te.innerHTML = '<strong>\ud83c\udf89 Ter\u00e7o completo! Deus te aben\u00e7oe!</strong>';
                if (pe) pe.textContent = '\u2713';
                if (window.FeStreaks) window.FeStreaks.registrarAtividade();
                if (typeof config.onComplete === 'function') config.onComplete();
            }
        }

        function buildBeads() {
            container.innerHTML = '';
            totalBeads = 0;
            clickedBeads = 0;

            decades.forEach(function (d) {
                var wrap = document.createElement('div');
                wrap.className = 'decade-section';

                var t = document.createElement('div');
                t.className = 'decade-title';
                t.textContent = d.title || d.titulo || '';
                wrap.appendChild(t);

                var med = d.meditation || d.intencao || '';
                if (med) {
                    var mv = document.createElement('div');
                    mv.className = 'decade-virtue';
                    mv.style.cursor = 'pointer';
                    mv.innerHTML = '\ud83d\udcad <em>Toque para meditar</em>';
                    var md = document.createElement('div');
                    md.style.display = 'none';
                    md.style.marginTop = '8px';
                    md.style.fontSize = '0.95em';
                    md.style.lineHeight = '1.6';
                    md.innerHTML = '<p>' + med + '</p>';
                    mv.onclick = function () {
                        var show = md.style.display === 'none';
                        md.style.display = show ? 'block' : 'none';
                        mv.innerHTML = show ? '\ud83d\udcad <em>Ocultar medita\u00e7\u00e3o</em>' : '\ud83d\udcad <em>Toque para meditar</em>';
                    };
                    wrap.appendChild(mv);
                    wrap.appendChild(md);
                }

                var row = document.createElement('div');
                row.className = 'beads-row';
                if (hasPN) { row.appendChild(makeBead('PN', 'Pai-Nosso', 44, THEME)); totalBeads++; }
                for (var j = 1; j <= aveCount; j++) { row.appendChild(makeBead(j, 'Ave-Maria ' + j, 38, '#2196F3')); totalBeads++; }
                if (hasGloria) { row.appendChild(makeBead('G', 'Gl\u00f3ria ao Pai', 44, '#FF9800')); totalBeads++; }
                if (hasJac) { row.appendChild(makeBead('J', d.jaculatoria || 'Jaculat\u00f3ria', 44, '#9C27B0')); totalBeads++; }
                wrap.appendChild(row);
                container.appendChild(wrap);
            });

            document.getElementById('progressBar').style.removeProperty('display');
            document.getElementById('btnResetBeads').style.removeProperty('display');
            updateProgress();
        }

        buildBeads();
        document.getElementById('btnResetBeads').addEventListener('click', buildBeads);
    }
};
