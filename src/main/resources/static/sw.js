var CACHE_NAME = 'fecatolica-cache-v5';
var URLS_PRE_CACHE = [
    '/',
    '/santo-terco.html',
    '/santo-rosario.html',
    '/liturgia.html',
    '/novena.html',
    '/mural.html',
    '/oracoes.html',
    '/exame-consciencia.html',
    '/via-sacra.html',
    '/terco-misericordia.html',
    '/lectio-divina.html',
    '/diario.html',
    '/calendario.html',
    '/hora-santa.html',
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
