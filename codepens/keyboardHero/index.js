//recuerda, lo insertamos en el head en la etiqueta script y se ejecuta, que raro hacerlo desde aquí bueno a todo se aprende


//para empezar vamos a comentar todo lo que hace, de primeras pone un array con los tres puntos que permiten que hayan más y un abecedario

//luego declara una variable timestamp que es un array

//ahora usa el metodo unshift, que mete los primeros valores en timestamp y devuelve la longitud, voy a probar, los valores que mete en timestamp son los devueltos por una función llamada timestamp que llama a date now y lo divide por mil, tal como estoy entendiendo la idea es que cuando le des a la tecla correcta vuelve a llamar a esa función y mete el nuevo time en la posición cero, luego coge el time anterior y lo resta al nuevo, la diferencia es lo que tardas en pulsar una tecla


//declara una función get random number que acepta parametro de minimo y máximo, primero los redondea para que no salga algo raro y luego coge un numero al azar, también redondeado entre esos numeros, por lo general el minimo será 0 y el máximo el lengt del array de arriba, luego pues seleccionas la tecla que tenga el contenido de esa posición del array y yap pero paso a paso.

//la siguiente es una función llamada getRandomkey que te retorna el array keys en la posición que dé getrandomnumber

//la función target random key llama a getrandomkey y hace un getElementById con ese valor, lo almacena en una variable key y luego a ese elemento llama a class list y le añade la clase selected, también almacena en una variable start el tiempo actual pero no veo que lo use en ningún lado

//la función gettimestamp llama a date now, lo divide por 1000 supongo que porque eso te lo da en milisegundos y es un número tochisimo y luego lo redondea

//ahora viene el nucleo de la funcionalidad. Le añade un event listener al documento en general porque es con lo que interactuamos, event listener tiene dos parametros el primero el tipo de evento en este caso keyup, es decir, lanza un evento cuando soltamos una tecla, el segundo es el manejador del evento que podría ser una función ajena aunque aquí hace una función flecha y lo maneja todo ahí mismo

//dentro de esa función tenemos una variable keypressed que coge el keycode del evento y lo pasa a string para que podamos compararlo usarlo después, para eso crea una variable keyElement y usando ese keypressed lo usa para hacer un getElementById

//ahora usa documentqueryselector, que nos devuelve lo primero que coincida para guardar en una variable la tecla que contenga la clase selected, que se la dimos antes con targetrandomkey

//aquí hace algo interesante y es que a la tecla que lanzó el evento le añade la clase hit, que la resalta un momento y luego le añade un eventlistener y de primer parametro le pasa animation end, que lanza otro evento cuando acaba la animación de hit, y con una función flecha ahí le quita la clase hit, esto resalta las teclas pulsadas aunque no coincidan con la buena

//por ultimo tenemos un if que compara si la tecla que lanzó el evento coincide con la tecla que tiene la clase selected y en caso de ser así  vuelve a llamar a getTimeStamp y lo mete como elemento 0 del array de timestamps y ahora crea una variable llamada elapsedtime que compara el tiempo que había antes de pulsar la tecla con el actual, luego coge ese tiempo y divide 60 entre el y así saca el ritmo de teclas por minuto cosa que no me cuadra puta mates, a ver, si la primera tecla se activa en el segundo 0 de ahora y tardo tres segundos elapsed time será 3s luego 60 entre tres te dira que 20 porque estás pulsando una tecla cada tres segundos lo que en un minuto te da 20 teclas? creo, que puto asco

//y ya pues tan solo le quita el selected a esa tecla y vuelve a llamar a targetrandomkey para que seleccione otra

//fuera de esto también llama a targetrandomkey para que la primera vez que cargue se seleccione una tecla


//AL LIO ESTO YA ES CÓDIGO

const keys = [..."ABCDEFGHIJKLMNOPQRSTUVWXYZ"];

const marcasDeTiempo =[];

function getRandomNumber(min, max){
    min= Math.ceil(min);
    max= Math.floor(max);

    return Math.floor(Math.random() * (max-min +1) +min);
}

function getRandomKey(){
    //lo hace todo en un paso yo prefiero dos
    //asignamos un numero a tecla y devolvemos keys en esa posicion
    let tecla = getRandomNumber(0, keys.length-1);
    console.log(keys[tecla])
    return keys[tecla];
}

//this is the final function... ninonino... ninoninoni...the final function!!!
function targetRandomKey(){
    const key= document.getElementById(getRandomKey());
    key.classList.add("selected");
    let start= Date.now();
}

function getTimeStamp(){
    return (Date.now() / 1000);
}

document.addEventListener("keyup", event => {
    const keyPressed = String.fromCharCode(event.keyCode);
    console.log(keyPressed);//para probar y ver que keycode salta
    const keyElement = document.getElementById(keyPressed);
    
    const highlightedKey = document.querySelector(".selected");

    keyElement.classList.add("hit");
    keyElement.addEventListener("animationend", () => {
        keyElement.classList.remove("hit");
    })

    if(keyPressed === highlightedKey.innerHTML){
        marcasDeTiempo.unshift(getTimeStamp());
        const diferenciaTemporal = marcasDeTiempo[0]- marcasDeTiempo[1];
        const ritmo = Math.floor(60/ diferenciaTemporal);
        //da error si redondeas las marcas de tiempo en getTimeStamp porque dividiría por cero, por eso mejor redondear aquí
        console.log("ritmo: "+ ritmo + "caracteres/minuto");
        highlightedKey.classList.remove("selected");
        const velocidad = document.getElementById("ritmo");
        if(ritmo){
        velocidad.innerHTML= ritmo;}
        targetRandomKey();
    }
})

targetRandomKey();

