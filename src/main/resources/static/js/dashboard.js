document.addEventListener('DOMContentLoaded', () => {
    const sidebar = document.getElementById('sidebar');
    const openBtn = document.getElementById('open_btn');
    const openBtnIcon = document.getElementById('open_btn_icon');

    openBtn.addEventListener('click', () => {
        sidebar.classList.toggle('collapsed');
        openBtnIcon.classList.toggle('fa-chevron-left');
        openBtnIcon.classList.toggle('fa-chevron-right');
    });

    // Fechar sidebar ao clicar fora em telas menores
    window.addEventListener('click', (e) => {
        if (window.innerWidth <= 768 && !sidebar.contains(e.target) && !openBtn.contains(e.target)) {
            sidebar.classList.remove('open');
        }
    });

    // Alternar sidebar em telas menores
    openBtn.addEventListener('click', () => {
        if (window.innerWidth <= 768) {
            sidebar.classList.toggle('open');
        }
    });
});

function toggleSubmenu(event, submenuId) {
    event.preventDefault(); // Evita o redirecionamento do link
    const submenu = document.getElementById(submenuId);
    submenu.style.display = submenu.style.display === 'block' ? 'none' : 'block';
}
