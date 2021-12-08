
import java.util.Scanner;

public class PositivoNegativo  {
    
    public static void main(String[] args) {
        int numIntroducido;
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        try{
        numIntroducido = entrada.nextInt();
        if(numIntroducido >=0){
            System.out.println("El número es positivo");
        } else{
            System.out.println("el número es negativo");
        }}catch(Exception e){
            System.out.println("valor inválido");
        }
    }

}


