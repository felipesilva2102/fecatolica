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
