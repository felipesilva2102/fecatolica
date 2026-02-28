(function () {
    'use strict';
    if ('serviceWorker' in navigator) {
        window.addEventListener('load', function () {
            navigator.serviceWorker.register('/sw.js').then(function (reg) {
                console.log('Service Worker registrado:', reg.scope);
            }).catch(function (err) {
                console.warn('SW register falhou:', err);
            });
        });
    }
})();
