
import java.util.Scanner;

public class NumSecreto {

    public static void main(String[] args) {
        int secreto;
        int numero;
        int intentos;
        boolean resuelto = false;
        Scanner entrada = new Scanner(System.in);
        secreto = (int)Math.round(Math.random() * 100);
        System.out.println("Introduce un número");
        
        numero=entrada.nextInt();
        intentos=1;
        while(resuelto==false){
        if(numero < secreto){
            System.out.println("tu numero es menor que el mío, introduce otro");
            numero=entrada.nextInt();
            intentos++;
        }
        if(numero > secreto){
            System.out.println("tu numero es mayor que el mío, introduce otro");
            numero=entrada.nextInt();
            intentos++;
        }
        if(numero == secreto){
            resuelto=true;
            System.out.println("felicidades, has encontrado el número, has necesitado "+ intentos+ " intentos");
        }
        }
    }

}
