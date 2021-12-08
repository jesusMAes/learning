
import java.util.Scanner;

public class CalculaRaiz {
    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número y te diré la raiz cuadrada");
        numero = entrada.nextInt();
        if(numero > 0){
        System.out.println("La raiz cuadrada es : "+ Math.sqrt(numero));
        } else if(numero <0){
            System.out.println("no se pueden hacer raíces con negativos");
        } else{
            System.out.println("dato inválido");
        }
    }

}
