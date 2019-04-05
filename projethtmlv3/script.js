var btn = document.querySelector('input');

btn.addEventListener('click', disableBtn);

function disableBtn() {
  btn.disabled = true;
  btn.value = 'Désactivé pour 2 secondes';
  window.setTimeout(function() {
    btn.disabled = false;
    btn.value = 'Activé';
  }, 2000);
}