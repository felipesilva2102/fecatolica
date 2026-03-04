(function () {
    'use strict';

    function partilhar(titulo, texto, url) {
        var shareData = {
            title: titulo || 'FeCatolica',
            text: texto || 'Descubra oracoes e novenas no FeCatolica!',
            url: url || window.location.href
        };

        if (navigator.share) {
            navigator.share(shareData).catch(function (err) {
                if (err.name !== 'AbortError') {
                    copiarParaClipboard(shareData.url);
                }
            });
        } else {
            copiarParaClipboard(shareData.url);
        }
    }

    function copiarParaClipboard(texto) {
        if (navigator.clipboard && navigator.clipboard.writeText) {
            navigator.clipboard.writeText(texto).then(function () {
                mostrarNotificacao('Link copiado!');
            }).catch(function () {
                fallbackCopiar(texto);
            });
        } else {
            fallbackCopiar(texto);
        }
    }

    function fallbackCopiar(texto) {
        var ta = document.createElement('textarea');
        ta.value = texto;
        ta.style.position = 'fixed';
        ta.style.left = '-9999px';
        document.body.appendChild(ta);
        ta.select();
        try {
            document.execCommand('copy');
            mostrarNotificacao('Link copiado!');
        } catch (e) {
            mostrarNotificacao('Nao foi possivel copiar.');
        }
        document.body.removeChild(ta);
    }

    function mostrarNotificacao(msg) {
        var notif = document.createElement('div');
        notif.textContent = msg;
        notif.style.cssText = 'position:fixed;top:20px;left:50%;transform:translateX(-50%);' +
            'background:#28a745;color:#fff;padding:10px 24px;border-radius:8px;z-index:99999;' +
            'font-size:0.95rem;box-shadow:0 4px 12px rgba(0,0,0,0.2);transition:opacity 0.5s;';
        document.body.appendChild(notif);
        setTimeout(function () {
            notif.style.opacity = '0';
            setTimeout(function () {
                if (notif.parentNode) notif.parentNode.removeChild(notif);
            }, 500);
        }, 2500);
    }

    function inicializar() {
        var botoes = document.querySelectorAll('[data-partilhar]');
        for (var i = 0; i < botoes.length; i++) {
            (function(btn) {
                btn.addEventListener('click', function (e) {
                    e.preventDefault();
                    var titulo = btn.getAttribute('data-partilhar-titulo') || document.title;
                    var texto = btn.getAttribute('data-partilhar-texto') || '';
                    var url = btn.getAttribute('data-partilhar-url') || window.location.href;
                    partilhar(titulo, texto, url);
                });
            })(botoes[i]);
        }
    }

    window.FePartilha = { partilhar: partilhar };

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', inicializar);
    } else {
        inicializar();
    }
})();
