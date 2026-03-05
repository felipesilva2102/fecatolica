var CACHE_NAME = 'fecatolica-cache-v7';
var URLS_PRE_CACHE = [
    '/',
    '/tercos/santo-terco.html',
    '/tercos/santo-rosario.html',
    '/tercos/terco-misericordia.html',
    '/tercos/terco-sagrado-coracao.html',
    '/tercos/terco-sao-jose.html',
    '/tercos/terco-das-almas.html',
    '/tercos/terco-dos-anjos.html',
    '/tercos/terco-do-combate.html',
    '/tercos/terco-da-providencia.html',
    '/tercos/coroa-franciscana.html',
    '/tercos/coroa-sete-dores.html',
    '/liturgia/liturgia.html',
    '/liturgia/calendario.html',
    '/novenas/novena.html',
    '/vida-espiritual/mural.html',
    '/vida-espiritual/exame-consciencia.html',
    '/vida-espiritual/diario.html',
    '/vida-espiritual/mini-catecismo.html',
    '/vida-espiritual/glossario-catolico.html',
    '/vida-espiritual/liturgia-das-horas.html',
    '/vida-espiritual/plano-leitura-biblica.html',
    '/oracoes/oracoes.html',
    '/oracoes/via-sacra.html',
    '/oracoes/lectio-divina.html',
    '/oracoes/hora-santa.html',
    '/oracoes/bencaos-do-lar.html',
    '/oracoes/consagracoes.html',
    '/oracoes/oracoes-ocasiao.html',
    '/oracoes/via-lucis.html',
    '/ferramentas/modo-retiro.html',
    '/ferramentas/timer-oracao.html',
    '/ferramentas/santo-do-dia.html',
    '/ferramentas/intencoes-papa.html',
    '/ladainhas/ladainha-dos-santos.html',
    '/ladainhas/ladainha-loreto.html',
    '/ladainhas/ladainha-sagrado-coracao.html',
    '/css/style.css',
    '/css/acessibilidade.css',
    '/css/terco-interativo.css',
    '/css/print.css',
    '/js/app.js',
    '/js/acessibilidade.js',
    '/js/terco-interativo.js',
    '/js/streaks.js',
    '/js/partilha.js',
    '/js/sw-register.js',
    '/includes/menu.html',
    '/includes/footer.html',
    '/manifest.json'
];

// Install - pre-cache dos recursos estaticos
self.addEventListener('install', function (event) {
    event.waitUntil(
        caches.open(CACHE_NAME).then(function (cache) {
            return cache.addAll(URLS_PRE_CACHE).catch(function (err) {
                console.warn('Pre-cache parcial:', err);
            });
        })
    );
    self.skipWaiting();
});

// Activate - limpar caches antigos
self.addEventListener('activate', function (event) {
    event.waitUntil(
        caches.keys().then(function (keys) {
            return Promise.all(
                keys.filter(function (key) {
                    return key !== CACHE_NAME;
                }).map(function (key) {
                    return caches.delete(key);
                })
            );
        })
    );
    self.clients.claim();
});

// Fetch - Stale-while-revalidate
self.addEventListener('fetch', function (event) {
    if (event.request.method !== 'GET') return;

    var url = new URL(event.request.url);

    // Nao cachear chamadas a API
    if (url.hostname === 'liturgia.up.railway.app' || url.pathname.startsWith('/api/')) {
        event.respondWith(
            fetch(event.request).catch(function () {
                return caches.match(event.request);
            })
        );
        return;
    }

    // Stale-while-revalidate para o resto
    event.respondWith(
        caches.open(CACHE_NAME).then(function (cache) {
            return cache.match(event.request).then(function (cachedResponse) {
                var fetchPromise = fetch(event.request).then(function (networkResponse) {
                    if (networkResponse && networkResponse.status === 200) {
                        cache.put(event.request, networkResponse.clone());
                    }
                    return networkResponse;
                }).catch(function () {
                    return cachedResponse;
                });

                return cachedResponse || fetchPromise;
            });
        })
    );
});
