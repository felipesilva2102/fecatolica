(function () {
    'use strict';

    var STREAK_KEY = 'fecatolica_streak';

    function getStreakData() {
        try {
            var raw = localStorage.getItem(STREAK_KEY);
            return raw ? JSON.parse(raw) : { count: 0, lastDate: null, history: [] };
        } catch (e) {
            return { count: 0, lastDate: null, history: [] };
        }
    }

    function setStreakData(data) {
        try {
            localStorage.setItem(STREAK_KEY, JSON.stringify(data));
        } catch (e) { /* silently fail */ }
    }

    function getHojeStr() {
        return new Date().toISOString().slice(0, 10);
    }

    function registrarAtividade() {
        var hoje = getHojeStr();
        var data = getStreakData();

        if (data.lastDate === hoje) {
            return data;
        }

        var ontem = new Date();
        ontem.setDate(ontem.getDate() - 1);
        var ontemStr = ontem.toISOString().slice(0, 10);

        if (data.lastDate === ontemStr) {
            data.count++;
        } else {
            data.count = 1;
        }

        data.lastDate = hoje;
        if (!data.history) data.history = [];
        data.history.push(hoje);
        if (data.history.length > 365) {
            data.history = data.history.slice(-365);
        }

        setStreakData(data);
        return data;
    }

    function renderizarStreak() {
        var el = document.getElementById('streak-display');
        if (!el) return;

        var data = getStreakData();
        var hoje = getHojeStr();

        if (data.lastDate) {
            var ontem = new Date();
            ontem.setDate(ontem.getDate() - 1);
            var ontemStr = ontem.toISOString().slice(0, 10);

            if (data.lastDate !== hoje && data.lastDate !== ontemStr) {
                data.count = 0;
                setStreakData(data);
            }
        }

        var emoji = data.count >= 7 ? '\uD83D\uDD25\uD83D\uDD25' : (data.count >= 3 ? '\uD83D\uDD25' : '\u2728');
        el.innerHTML = emoji + ' ' + data.count + ' dia' + (data.count !== 1 ? 's' : '') + ' seguido' + (data.count !== 1 ? 's' : '');

        if (data.count >= 30) {
            el.innerHTML += ' \uD83C\uDFC6';
        } else if (data.count >= 7) {
            el.innerHTML += ' \u2B50';
        }
    }

    window.FeStreaks = {
        registrarAtividade: registrarAtividade,
        getStreakData: getStreakData,
        renderizarStreak: renderizarStreak
    };

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', renderizarStreak);
    } else {
        renderizarStreak();
    }
})();
