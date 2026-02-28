var CACHE_NAME = 'fecatolica-cache-v1';
var URLS_PRE_CACHE = [
    '/',
    '/santo_terco.xhtml',
    '/santo_rosario.xhtml',
    '/liturgia.xhtml',
    '/novena.xhtml',
    '/mural.xhtml',
    '/css/acessibilidade.css',
    '/css/terco-interativo.css',
    '/css/print.css',
    '/js/acessibilidade.js',
    '/js/terco-interativo.js',
    '/js/streaks.js',
    '/js/partilha.js',
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

    // Nao cachear chamadas a API de liturgia
    if (url.hostname === 'liturgia.up.railway.app') {
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
