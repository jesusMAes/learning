//El funcionamiento de este es simple selecciona todos con la clase menutriger y los guarda en una constante, luego la itera y a cada uno le añade un eventlistener que le pasa la clase active

const triggers =document.querySelectorAll('.menu-trigger'), activeClass='active';

triggers.forEach((trigger) => {
    trigger.addEventListener('click' ,(e) =>{
        e.currentTarget.classList.toggle(activeClass);
    })
})

//vamos a explicar eso que queda raro, iteramos triggers a cada uno le pasamos una función en la cual a ese triger se le añade un event listener que se dispara con click, cuando se dispara sale un evento e lo que llama a otra función que mira el target de ese evento es decir cual lo produjo y usa toggle con active class, togle lo cambia es decir si ya tenia la clase se la quita si no la tenía se la pone