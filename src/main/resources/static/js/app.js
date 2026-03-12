/* ===== FeCatolica - app.js ===== */
$(function () {
    // 1. Carrega menu e footer via jQuery .load()
    var $menuPlaceholder = $('#menu-placeholder');
    var $footerPlaceholder = $('#footer-placeholder');

    if ($menuPlaceholder.length) {
        $menuPlaceholder.load('/includes/menu.html', function () {
            initDropdowns();
            initHamburgerMenu();
            // Highlight current page in navbar
            highlightCurrentPage();
        });
    }
    if ($footerPlaceholder.length) {
        $footerPlaceholder.load('/includes/footer.html');
    }

    // 2. Carrega cores litúrgicas
    $.getJSON('/api/tempo-liturgico', function (data) {
        if (data && data.cssVariaveis) {
            $('<style>').text(data.cssVariaveis).appendTo('head');
        }
    }).fail(function() {
        // Fallback silencioso se API offline
    });

    // 3. Inicializa accordions
    initAccordions();

    // 4. Scroll-to-top button
    initScrollToTop();

    // 5. Fade-in animation on scroll (Intersection Observer)
    initScrollAnimations();

    // 6. Reading progress bar (content pages only)
    initReadingProgress();

    // 7. Keyboard shortcuts
    initKeyboardShortcuts();

    // 8. Favorites system
    initFavorites();

    // 9. Estimated reading time
    initReadingTime();

    // 10. Card hover tilt effect on home grid
    initCardMicroInteractions();
});

/* ===== Highlight current page ===== */
function highlightCurrentPage() {
    var path = window.location.pathname;
    $('.navbar a').each(function() {
        var href = $(this).attr('href');
        if (href && path === href) {
            $(this).css({
                'background': 'var(--cor-primaria)',
                'color': '#fff',
                'border-radius': '6px'
            });
        }
    });
}

/* ===== Dropdowns ===== */
function initDropdowns() {
    $(document).on('click', '.dropdown > .dropdown-toggle', function (e) {
        e.preventDefault();
        e.stopPropagation();
        var $parent = $(this).parent('.dropdown');
        $parent.toggleClass('open');
        $parent.siblings('.dropdown').removeClass('open');
    });

    $(document).on('click', function (e) {
        if (!$(e.target).closest('.dropdown').length) {
            $('.dropdown').removeClass('open');
        }
    });
}

/* ===== Hamburger Menu ===== */
function initHamburgerMenu() {
    var $btn = $('#hamburger-btn');
    var $nav = $('#main-navbar');
    if (!$btn.length || !$nav.length) return;

    $btn.on('click', function (e) {
        e.stopPropagation();
        var isOpen = $nav.hasClass('open');
        $nav.toggleClass('open');
        $btn.attr('aria-expanded', !isOpen);
        $btn.html(isOpen ? '☰' : '✕');
    });

    // Close menu when clicking a non-dropdown link (mobile)
    $nav.on('click', 'a:not(.dropdown-toggle)', function () {
        if (window.innerWidth <= 768) {
            $nav.removeClass('open');
            $btn.attr('aria-expanded', 'false');
            $btn.html('☰');
        }
    });

    // Close on outside click
    $(document).on('click', function (e) {
        if (window.innerWidth <= 768 && !$(e.target).closest('#main-navbar, #hamburger-btn').length) {
            $nav.removeClass('open');
            $btn.attr('aria-expanded', 'false');
            $btn.html('☰');
        }
    });

    // Close on resize to desktop
    $(window).on('resize', function () {
        if (window.innerWidth > 768) {
            $nav.removeClass('open');
            $btn.attr('aria-expanded', 'false');
            $btn.html('☰');
        }
    });
}

/* ===== Accordion ===== */
function initAccordions() {
    $(document).on('click', '.accordion-header', function () {
        var $header = $(this);
        var $content = $header.next('.accordion-content');
        $header.toggleClass('active');
        $content.slideToggle(200);
    });
}

/* ===== Scroll to Top ===== */
function initScrollToTop() {
    var btn = document.createElement('button');
    btn.className = 'btn-scroll-top';
    btn.innerHTML = '↑';
    btn.setAttribute('aria-label', 'Voltar ao topo');
    btn.setAttribute('title', 'Voltar ao topo');
    document.body.appendChild(btn);

    window.addEventListener('scroll', function() {
        if (window.scrollY > 300) {
            btn.classList.add('visible');
        } else {
            btn.classList.remove('visible');
        }
    }, {passive: true});

    btn.addEventListener('click', function() {
        window.scrollTo({top: 0, behavior: 'smooth'});
    });
}

/* ===== Scroll Animations (Intersection Observer) ===== */
function initScrollAnimations() {
    if (!('IntersectionObserver' in window)) return;

    // Observe cards and sections that should animate on scroll
    var observer = new IntersectionObserver(function(entries) {
        entries.forEach(function(entry) {
            if (entry.isIntersecting) {
                entry.target.classList.add('fade-in');
                observer.unobserve(entry.target);
            }
        });
    }, {threshold: 0.08, rootMargin: '0px 0px -30px 0px'});

    // Observe elements with data-animate attribute
    setTimeout(function() {
        document.querySelectorAll('.card:not(.hero-card), .accordion-tab, .intencao-card-modern, .home-card').forEach(function(el) {
            if (!el.classList.contains('fade-in')) {
                el.style.opacity = '0';
                el.style.transform = 'translateY(12px)';
                observer.observe(el);
            }
        });
    }, 100);
}

/* ===== Helper: Cria accordion HTML a partir de um array de seções ===== */
function buildAccordion(sections, containerId) {
    var $container = $(containerId);
    $container.empty();

    var $panel = $('<div class="accordion-panel"></div>');

    $.each(sections, function (i, section) {
        if (!section.content) return;

        var $tab = $('<div class="accordion-tab"></div>');
        var $header = $('<div class="accordion-header"></div>').text(section.title);
        var $content = $('<div class="accordion-content"></div>');

        if (section.html) {
            $content.html(section.content);
        } else {
            $content.append($('<pre>').text(section.content));
        }

        $tab.append($header).append($content);
        $panel.append($tab);
    });

    $container.append($panel);
}

/* ===== Global Toast ===== */
function showToast(msg, duration) {
    var existing = document.querySelector('.toast-notification');
    if (existing) existing.remove();

    var toast = document.createElement('div');
    toast.className = 'toast-notification';
    toast.textContent = msg;
    document.body.appendChild(toast);

    setTimeout(function() { toast.classList.add('show'); }, 10);
    setTimeout(function() {
        toast.classList.remove('show');
        setTimeout(function() { if (toast.parentNode) toast.remove(); }, 400);
    }, duration || 3000);
}

/* ===== Reading Progress Bar ===== */
function initReadingProgress() {
    var path = window.location.pathname;
    if (path === '/' || path === '/index.html') return;

    var bar = document.createElement('div');
    bar.className = 'reading-progress-bar';
    document.body.appendChild(bar);

    window.addEventListener('scroll', function() {
        var scrollTop = window.scrollY;
        var docHeight = document.documentElement.scrollHeight - window.innerHeight;
        var progress = docHeight > 0 ? (scrollTop / docHeight) * 100 : 0;
        bar.style.width = Math.min(progress, 100) + '%';
    }, {passive: true});
}

/* ===== Keyboard Shortcuts ===== */
function initKeyboardShortcuts() {
    document.addEventListener('keydown', function(e) {
        // Ctrl+K or Cmd+K → open search
        if ((e.ctrlKey || e.metaKey) && e.key === 'k') {
            e.preventDefault();
            window.location.href = '/ferramentas/busca.html';
        }
        // Ctrl+Home → go to home page
        if (e.key === 'Home' && e.ctrlKey && !e.target.closest('input, textarea')) {
            if (window.location.pathname !== '/' && window.location.pathname !== '/index.html') {
                e.preventDefault();
                window.location.href = '/';
            }
        }
    });
}

/* ===== Estimated Reading Time ===== */
function initReadingTime() {
    var path = window.location.pathname;
    if (path === '/' || path === '/index.html') return;

    var $content = $('.container');
    if (!$content.length) return;

    var text = $content.text();
    var words = text.trim().split(/\s+/).length;
    var minutes = Math.max(1, Math.round(words / 200));

    var $badge = $('<div>')
        .css({textAlign:'center', margin:'8px 0', fontSize:'0.85rem', color:'#888'})
        .text('📖 Leitura estimada: ~' + minutes + ' min');

    var $firstCard = $content.find('.card').first();
    if ($firstCard.length) {
        $firstCard.after($badge);
    }
}

/* ===== Card Micro-Interactions ===== */
function initCardMicroInteractions() {
    if (window.matchMedia('(hover: none)').matches) return;

    $(document).on('mouseenter', '.home-card', function() {
        $(this).css({transform:'translateY(-4px) scale(1.02)', transition:'all 0.25s ease'});
    }).on('mouseleave', '.home-card', function() {
        $(this).css({transform:'translateY(0) scale(1)', transition:'all 0.25s ease'});
    });
}

/* ===== Favorites System ===== */
function initFavorites() {
    var FAVS_KEY = 'fecatolica-favorites';
    var path = window.location.pathname;

    // Only show on content pages
    if (path === '/' || path === '/index.html' || path === '/ferramentas/busca.html') return;

    var favs = [];
    try { favs = JSON.parse(localStorage.getItem(FAVS_KEY) || '[]'); } catch(e) {}

    var isFav = favs.indexOf(path) !== -1;

    var btn = document.createElement('button');
    btn.className = 'btn-favorite' + (isFav ? ' is-favorite' : '');
    btn.innerHTML = isFav ? '★' : '☆';
    btn.setAttribute('aria-label', isFav ? 'Remover dos favoritos' : 'Adicionar aos favoritos');
    btn.setAttribute('title', 'Favoritar esta página (atalho: F)');
    document.body.appendChild(btn);

    btn.addEventListener('click', function() {
        try {
            favs = JSON.parse(localStorage.getItem(FAVS_KEY) || '[]');
        } catch(e) { favs = []; }
        var idx = favs.indexOf(path);
        if (idx !== -1) {
            favs.splice(idx, 1);
            btn.classList.remove('is-favorite');
            btn.innerHTML = '☆';
            btn.setAttribute('aria-label', 'Adicionar aos favoritos');
            showToast('Removido dos favoritos');
        } else {
            favs.push(path);
            btn.classList.add('is-favorite');
            btn.innerHTML = '★';
            btn.setAttribute('aria-label', 'Remover dos favoritos');
            showToast('Adicionado aos favoritos ★');
        }
        localStorage.setItem(FAVS_KEY, JSON.stringify(favs));
    });

    // Keyboard shortcut: F to toggle favorite
    document.addEventListener('keydown', function(e) {
        if (e.key === 'f' && !e.ctrlKey && !e.metaKey && !e.target.closest('input, textarea, [contenteditable]')) {
            btn.click();
        }
    });
}

/* ===== Visitados Recentemente ===== */
(function() {
    var MAX_RECENT = 8;
    var STORAGE_KEY = 'fecatolica-recent';
    var path = window.location.pathname;

    // Page titles map (only content pages)
    var pageTitles = {
        '/tercos/santo-terco.html': '📿 Santo Terço',
        '/tercos/santo-rosario.html': '🌹 Santo Rosário',
        '/tercos/terco-misericordia.html': '🙏 Terço da Misericórdia',
        '/tercos/terco-sagrado-coracao.html': '❤️‍🔥 Terço do Sagrado Coração',
        '/tercos/terco-sao-jose.html': '🌿 Terço de São José',
        '/tercos/coroa-franciscana.html': '🌸 Coroa Franciscana',
        '/tercos/coroa-sete-dores.html': '💔 Coroa das 7 Dores',
        '/tercos/terco-dos-anjos.html': '✨ Terço dos Anjos',
        '/tercos/terco-das-almas.html': '🕯️ Terço das Almas',
        '/ladainhas/ladainha-loreto.html': '🌹 Ladainha de Loreto',
        '/ladainhas/ladainha-sagrado-coracao.html': '❤️‍🔥 Lad. Sagrado Coração',
        '/ladainhas/ladainha-dos-santos.html': '✨ Ladainha dos Santos',
        '/oracoes/oracoes.html': '🙏 Orações Diárias',
        '/oracoes/via-sacra.html': '✝️ Via-Sacra',
        '/oracoes/hora-santa.html': '🕯️ Hora Santa',
        '/oracoes/lectio-divina.html': '📖 Lectio Divina',
        '/oracoes/via-lucis.html': '☀️ Via Lucis',
        '/oracoes/consagracoes.html': '🕊️ Consagrações',
        '/oracoes/salmos.html': '📜 Salmos',
        '/oracoes/ato-contricao.html': '💧 Ato de Contrição',
        '/ferramentas/meditacao.html': '🧘 Meditação Guiada',
        '/ferramentas/timer-oracao.html': '⏱️ Timer de Oração',
        '/ferramentas/modo-retiro.html': '🕯️ Modo Retiro',
        '/vida-espiritual/exame-consciencia.html': '🔍 Exame de Consciência',
        '/vida-espiritual/diario.html': '📓 Diário Espiritual',
        '/vida-espiritual/santos-padroeiros.html': '⛪ Santos Padroeiros',
        '/vida-espiritual/plano-leitura-biblica.html': '📕 Plano Bíblico',
        '/vida-espiritual/mini-catecismo.html': '📚 Mini Catecismo',
        '/vida-espiritual/glossario-catolico.html': '📖 Glossário Católico',
        '/vida-espiritual/liturgia-das-horas.html': '🕐 Liturgia das Horas',
        '/vida-espiritual/sacramentos.html': '⛪ Sacramentos',
        '/vida-espiritual/exame-diario.html': '🕯️ Exame Diário',
        '/vida-espiritual/promessas-jesus.html': '❤️‍🔥 Promessas de Jesus',
        '/vida-espiritual/virtudes-dons.html': '🔥 Virtudes e Dons',
        '/oracoes/angelus.html': '🔔 Angelus',
        '/oracoes/oracoes-anjos.html': '👼 Orações aos Anjos',
        '/oracoes/devocoes-marianas.html': '🌹 Devoções Marianas',
        '/oracoes/oracoes-santos.html': '✨ Orações aos Santos',
        '/oracoes/guia-confissao.html': '🕊️ Guia de Confissão',
        '/oracoes/oracoes-latim.html': '🏛️ Orações em Latim',
        '/oracoes/sagrada-familia.html': '👨‍👩‍👦 Sagrada Família',
        '/vida-espiritual/doutrina-social.html': '⚖️ Doutrina Social',
        '/vida-espiritual/mandamentos-preceitos.html': '📜 Mandamentos e Preceitos',
        '/ferramentas/quiz-formacao.html': '📝 Quiz de Formação',
        '/oracoes/bem-aventurancas.html': '⛰️ Bem-aventuranças',
        '/oracoes/obras-misericordia.html': '🤲 Obras de Misericórdia',
        '/oracoes/oracoes-eucaristicas.html': '🕯️ Orações Eucarísticas',
        '/oracoes/te-deum-hinos.html': '🎵 Te Deum e Hinos',
        '/vida-espiritual/credo-explicado.html': '✝️ Credo Explicado',
        '/vida-espiritual/partes-da-missa.html': '⛪ Partes da Missa',
        '/vida-espiritual/doutores-igreja.html': '📚 Doutores da Igreja',
        '/vida-espiritual/pecados-capitais.html': '⚔️ Pecados Capitais e Virtudes',
        '/vida-espiritual/parabolas-jesus.html': '📖 Parábolas de Jesus',
        '/vida-espiritual/milagres-jesus.html': '✨ Milagres de Jesus',
        '/vida-espiritual/santos-brasileiros.html': '🇧🇷 Santos Brasileiros',
        '/vida-espiritual/concilios-ecumenicos.html': '🏛️ Concílios Ecumênicos',
        '/vida-espiritual/ordens-religiosas.html': '🙇 Ordens Religiosas',
        '/vida-espiritual/aparicoes-marianas.html': '🌹 Aparições Marianas',
        '/vida-espiritual/novissimos.html': '⚖️ Novíssimos',
        '/vida-espiritual/simbolos-liturgicos.html': '⛪ Símbolos Litúrgicos',
        '/vida-espiritual/frases-santos.html': '✨ Frases dos Santos',
        '/vida-espiritual/tipos-oracao.html': '🙏 Tipos de Oração',
        '/vida-espiritual/maria-na-biblia.html': '🌹 Maria na Bíblia',
        '/oracoes/oracoes-defuntos.html': '🕯️ Orações pelos Defuntos',
        '/oracoes/oracoes-vocacionais.html': '🙏 Orações Vocacionais',
        '/oracoes/cantico-criaturas.html': '🎵 Cânticos de Louvor',
        '/oracoes/oracoes-cura.html': '💚 Orações de Cura',
        '/tercos/terco-do-combate.html': '⚔️ Terço do Combate',
        '/tercos/terco-da-providencia.html': '🙏 Terço da Providência',
        '/tercos/terco-da-libertacao.html': '🔓 Terço da Libertação',
        '/tercos/terco-lagrimas-de-sangue.html': '😢 Terço Lágrimas de Sangue',
        '/tercos/terco-imaculada-conceicao.html': '🌹 Terço Imaculada Conceição',
        '/tercos/coroa-espirito-santo.html': '🔥 Coroa do Espírito Santo',
        '/tercos/coroa-doze-estrelas.html': '⭐ Coroa das 12 Estrelas',
        '/oracoes/bencaos-do-lar.html': '🏠 Bênçãos do Lar',
        '/oracoes/oracoes-ocasiao.html': '🙏 Orações para Ocasiões',
        '/oracoes/oficio-imaculada-conceicao.html': '🌹 Ofício da Imaculada',
        '/oracoes/preces-sao-patricio.html': '☘️ Preces de São Patrício',
        '/oracoes/cinco-primeiros-sabados.html': '🌹 Cinco Primeiros Sábados',
        '/oracoes/hora-da-misericordia.html': '🕐 Hora da Misericórdia',
        '/ferramentas/intencoes-papa.html': '🙏 Intenções do Papa',
        '/ferramentas/santo-do-dia.html': '⛪ Santo do Dia',
        '/ferramentas/busca.html': '🔍 Busca',
        '/vida-espiritual/mural.html': '📌 Mural Espiritual',
        '/ladainhas/ladainha-sao-jose.html': '🌿 Ladainha de São José',
        '/ladainhas/ladainha-preciosissimo-sangue.html': '🩸 Lad. Preciosíssimo Sangue',
        '/ladainhas/ladainha-santo-nome-jesus.html': '✝️ Lad. Santo Nome de Jesus',
        '/ladainhas/ladainha-espirito-santo.html': '🔥 Lad. Espírito Santo',
        '/ladainhas/ladainha-da-humildade.html': '🕊️ Ladainha da Humildade',
        '/quaresmas/quaresma-liturgica.html': '⛪ Quaresma Litúrgica',
        '/quaresmas/quaresma-sao-miguel.html': '⚔️ Quaresma de São Miguel',
        '/quaresmas/quaresma-sao-jose.html': '🌿 Quaresma de São José',
        '/quaresmas/quaresma-santo-antonio.html': '🙏 Quaresma de Santo Antônio',
        '/quaresmas/quaresma-nossa-senhora-aparecida.html': '🌹 Quaresma de N. Sra. Aparecida',
        '/quaresmas/quaresma-espirito-santo.html': '🔥 Quaresma do Espírito Santo',
        '/quaresmas/quaresma-nossa-senhora-carmo.html': '🌹 Quaresma de N. Sra. do Carmo',
        '/quaresmas/quaresma-santa-teresinha.html': '🌸 Quaresma de Santa Teresinha',
        '/quaresmas/quaresma-sao-francisco.html': '🐦 Quaresma de São Francisco',
        '/quaresmas/quaresma-natal.html': '🎄 Quaresma do Natal'
    };

    // Save current page visit
    if (pageTitles[path]) {
        try {
            var recent = JSON.parse(localStorage.getItem(STORAGE_KEY) || '[]');
            recent = recent.filter(function(r) { return r.path !== path; });
            recent.unshift({path: path, title: pageTitles[path], ts: Date.now()});
            if (recent.length > MAX_RECENT) recent = recent.slice(0, MAX_RECENT);
            localStorage.setItem(STORAGE_KEY, JSON.stringify(recent));
        } catch(e) { /* ignore */ }
    }

    // Render on home page
    if (path === '/' || path === '/index.html') {
        $(function() {
            try {
                var recent = JSON.parse(localStorage.getItem(STORAGE_KEY) || '[]');
                if (recent.length > 0) {
                    var $container = $('#recentVisits');
                    var $card = $('#recentVisitsCard');
                    if ($container.length) {
                        $.each(recent, function(i, item) {
                            $container.append(
                                $('<a>').attr('href', item.path).addClass('recent-chip').text(item.title)
                            );
                        });
                        $card.show();
                    }
                }
            } catch(e) { /* ignore */ }

            // Render favorites on home page
            try {
                var favs = JSON.parse(localStorage.getItem('fecatolica-favorites') || '[]');
                if (favs.length > 0) {
                    var $favContainer = $('#favoritesContainer');
                    var $favCard = $('#favoritesCard');
                    if ($favContainer.length) {
                        $.each(favs, function(i, favPath) {
                            var title = pageTitles[favPath] || favPath.replace(/.*\//, '').replace('.html', '');
                            $favContainer.append(
                                $('<a>').attr('href', favPath).addClass('fav-chip').text('★ ' + title)
                            );
                        });
                        $favCard.show();
                    }
                }
            } catch(e) { /* ignore */ }
        });
    }
})();
