//vale esta es la parte interesante porque es la que agrega el movimiento, as always vamos a escribir primero cómo lo hace y luego ya replicamos

//empezamos bien, lo hace todo en una sola función muy larga, esta función es el document.addEventListener y el evento se produce con domcontentloaded es decir una vez el navegador carga el dom lanza un evento, ese evento se pasa a la función flecha

//ya dentro de la función de primeras tenemos una variable llamada dragsrcel que es basicamente la fuente de movimiento.

//antes de continuar vamos a ir al final porque es donde hace algo interesante para poder aplicar las funciones estas

//crea una variable items y usa document query selector all para almacenar en ella todos los divs con la clase tadsk. 
//luego hace un for each y a cada item le añade el addeventlistener para handlear el drag en sus diversas variables que especifican las funciones


//volvemos arriba a las funciones

//la primera funcion es handle drag start que recibe un evento y le cambia la opacidad a la tarea del evento (con el this), almacena ese objeto en dragsrcrel y luego llama a metodos de datatransfer que gestionan los datos de operacciones de drag, en este caso efect allowed que le dice que es posible moverlo y set data al que le pasa el html del task que lanzó el evento

//la siguinte función es para dragover, es decir cuando arrastar por encima de otro elemento, en ese caso chequea si existe prevent default que cancela el evento si es cancelable y luego usa datatransfer dropeffect que lo que hace es cambiar el ratón para indicar que ahí lo puedes poner. Por ultimo hace un return false supongo que porque habrá que salir de la función

//la siguiente funcion es handledragenter, se activa cuando un elemento que estás arratrando entra encima de otro, y lo que hace es darle la clase de hover al otro para resaltarlo, handledragleave se la quita ojo que aquí el e no es el objeto que estás moviendo sino en el que entras que es el que dispara el evento


//QUE MAMONAZO handledrop es cuando lo sueltas primero llama a stoppropagation que si entiendo bien la documentación para la propagación es decir un evento puede desencadenar otro en otro sitio que desencadena otro y así, como cuando al mover un task lanzamos el evento de mover, al pasar por encima de otro lanza otro evento al seguir moviendo seguimos lanzando eventos, esto corta ese flujo y los para

//vale pero esto es lo guay cuando empezamos a arrastrar un task guardamos su html en una variable, ahora al soltar guardamos el html del elemento encima del cual lo hemos soltado en esa variable y basicamente intercambiamos el html interior es decir que no se están moviendo sino que están cambiando su contenido y dando la sensación de que los moviste


//drag end solo les devuelve la opacita y quita a todos los task el hover por si alguno quedó suelto


//FUNCION MÁXIMA

document.addEventListener('DOMContentLoaded', (event) => {

    var dragSrcEl =null;
    //aquí guardamos el html del elemento agarrado

    function handleDragStart(e){
        this.style.opacity = '0.1';
        this.style.border = '3px dashed #c4cad3';

        dragSrcEl =this;

        e.dataTransfer.effectAllowed= 'move';
        e.dataTransfer.setData('text/html', this.innerHTML);
        //le decimos que guarde el html del elemento en data
    }

    function handleDragOver(e) {
        if (e.preventDefault){
            e.preventDefault();
        }

        e.dataTransfer.dropEffect = 'move';

        return false;
    }

    function handleDragEnter (e) {
        this.classList.add('task-hover');
    }

    function handleDragLeave(e){
        this.classList.remove('task-hover');
    }

    function handleDrop (e){
        if (e.stopPropagation){
            e.stopPropagation();
        }

        if(dragSrcEl !=this){
            dragSrcEl.innerHTML =this.innerHTML;
            this.innerHTML = e.dataTransfer.getData('text/html');
            //importante que antes no guardamos el html en dragsrc sino en un objeto datatransfer por eso ahora podemos hacer un getter para meterselos a this que es donde dejamos caer y por eso podemos cambiarlo arriba el innerhtml de drag sin que cambie el datatransfer
        }

        return false;
    }

    function handleDragEnd (e){
        this.style.opacity='1';
        this.style.border ='0';
        
        DataTransferItemList.forEach(function (item) {
            item.classList.remove('task-hover');
        });
    }


    let items =document.querySelectorAll('.task');

    items.forEach(function(item) {
        item.addEventListener('dragstart', handleDragStart, false);
        item.addEventListener('dragenter', handleDragEnter, false);
        item.addEventListener('dragover', handleDragOver, false);
        item.addEventListener('dragleave', handleDragLeave,false);
        item.addEventListener('drop', handleDrop, false);
        item.addEventListener('dragend', handleDragEnd, false);
    });
});