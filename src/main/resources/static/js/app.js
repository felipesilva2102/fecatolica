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
    });

    // 3. Inicializa accordions
    initAccordions();

    // 4. Scroll-to-top button
    initScrollToTop();

    // 5. Fade-in animation on scroll (Intersection Observer)
    initScrollAnimations();
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
