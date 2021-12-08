
import java.util.Scanner;

public class contarcifras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero = "";
        System.out.println("Introduce un número");
        try {
            numero = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("eso no es un número");
        }
        if(numero.length()<=5){
        System.out.println("La longitud del numero es: "+ numero.length());

    } else{
            System.out.println("numero demasiado largo");
}
}
}