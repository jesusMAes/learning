//oki a ver como entiendo esto. Para empezar está usando jquery que lo he usado un par de veces pero aún no tengo práctica así que irá más lento
//en jquery se pueden seleccionar elementos del html usando $('') y luego si es clase le pones punto si es id # como si fuese css. La primera linea coge los figure y llama al metodo on que lo que hace es asociar un handle de eventos a uno o más eventos en este caso cuando se produce el evento mouseenter y o mouseleave llama a la funcion hoverdirection

//la funcion hoverdirection me dio ganas de llorar vamos paso a paso, recibe un event y declara una variable overlay, vale, lo que me lió es que crea un porrón de variables separadas por comas, he probado a cambiarle el código por puntos y coma y va igual

//ENTONCES, la variable overlay almacena el figcaption del que ha disparado el evento.
//la variable side almacena el resultado de un metodo llamado getmousedirection, que lo define luego.

//la variable animateTo no almacena nada al principio, la usa para operar

//la variable positionIN almacena un objeto con estilos 
//la variable position out coge el resultado de side que te dice la direccción del mouse y usa un switch para en función de una cosa u otra dar un estilo u otro

//después de declarar variables usa un if para ver si el tipo del evento disparado corresponde a que el ratón entró o salió de la imagen, si es que entró le dice que la animación es igual a position in es decir top 0 left 0 y le da al overlay es decir al caption la posición de position out, si entiendo bien esto lo coloca fuera y cuando entras la animación cambia el css para que esté dentro, si sales el css está como que es dentro y lo cambia para ponerlo fuera

//por ultimo usa overlay, llama al metodo stop el cual para la animación que haya en marcha si es que hay una, luego llama al método animate que segun la documentación crea una animación con los parametros que le pases, el primer parámetro son las propiedades css de la animación, en este caso animateTo es decir la posición final del overllay, el segundo es la duración y el último el tipo esto de linear, ease y tal


//vale, el metodo getMouseDirection que me ha hecho llorar de verdad, es el qu te dice adonde está yendo el ratón, vi que hay una librería para hacerlo fácil pero bueno, este metodo es el que devuelve el side que se usa para determinar el positionout basicamente adonde se moverá el overlay

//comienza declarando una variable item que es el target que lanzó el objeto, luego declara una variable offset llamando al metodo offset sobre item, offset lo que te da es la posición en la que se encuentra ese elemento

//luego crea una variable w con el outerWidth que es el ancho total de ese elemento y otra llamada H con el alto total

//ahora viene el lio, la variable x llama a event pagex una función de jquery que te da la posición del mouse en el documento, le resta el left del item y la mitad del ancho y luego lo multiplica usando un if, si el ancho es mayor que el alto lo multiplica por h/w si no lo hace por uno. Luego hace lo mismo con la y llamando a pagey y usando el top como propiedad

//por ultimo la variable direction llama a math.atan2 que da el angulo theta de los dos argumentos, no lo entiendo pero me gustaría verlas lo multiplica por 180 entre pi, le suma 180/90 partido 4 y luego hace el return la verdad imposible entender esto pero bueno si alguna vez lo necesito ya veré como lo hago

$('figure').on('mouseenter mouseleave', hoverDirection);

function hoverDirection(event) {
   var $overlay = $(this).find('figcaption');
   var side = getMouseDirection(event);
   var animateTo;
   var positionIn = {
    top: '0%',
    left: '0%'
   };
   var positionOut = (function () {
    switch(side) {
        case 0: return {top: '-100%', left: '0%'};
        break;
        case 1: return {top: '0%', left: '100%'};
        break;
        case 2: return {top: '100%', left: '0%'};
        break;
        default: return {top: '0%', left: '-100%'};
        break;
    }
   })();//esos dos ultimos parentesis ejecutan la función, si no tan solo almacenariamos en position out el código de la funcion

   if (event.type === 'mouseenter') {
    animateTo = positionIn;
    $overlay.css(positionOut);
   } else {
    animateTo = positionOut;
   }

   $overlay.stop(true).animate(animateTo, 200, 'linear');
}

function getMouseDirection(event) {
    var $item = $(event.currentTarget),
        offset = $item.offset(),
        w = $item.outerWidth(),
        h = $item.outerHeight(),
        x = (event.pageX - offset.left - w / 2) * ((w > h) ? h / w: 1),
        y = (event.pageY - offset.top - h / 2) * ((h > w) ? w / h: 1),
        direction = Math.round((Math.atan2(y, x) * (180 / Math.PI) + 180) / 90  + 3) % 4;
    return direction;
  }