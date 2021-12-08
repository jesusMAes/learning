package herencias;

import java.util.logging.Level;
import java.util.logging.Logger;


public class pruebas {
    public static void main(String[] args) {
        animal perro= new animal("estrella", 15);
         animal gato= new animal("flurflis", 8);
         System.out.println("el perro se llama "+ perro.getNombre()+ " y tiene "+ perro.getEdad()+" años");
          System.out.println("el gato se llama "+ gato.getNombre()+ " y tiene "+ gato.getEdad()+" años");
         System.out.println("numero de animales creados "+ gato.getcontador());
         System.out.println("ahora usaremos un constructor copia pasandole como parámetros los datos de flurflis");
         
         animal clon= new animal(gato);
         System.out.println("el gato se llama "+ gato.getNombre()+ " y tiene "
                 + gato.getEdad()+" años, numero de animales creados: "+ clon.getcontador());
        
        }
    }


