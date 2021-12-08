package herencias;

import java.util.ArrayList;


public class pruebaColor {
    public static void main(String[] args) {
        Color col1 =new Color();
        col1.PintaBlanco();
        col1.PintaNegro();
        ArrayList<Integer> miArray = new ArrayList<Integer>();
// Este bucle inicializa el array
for(int i = 0; i < 1000; i++) {
miArray.add((int)(Math.random()*500));
}
// Este bucle muestra el contenido del array en consola
for(int i = 0; i<miArray.size(); i++){
System.out.println(miArray.get(i));
}

    }

}
