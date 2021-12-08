
import java.util.Scanner;

public class ParesONones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroA = 0;
        int numeroB = 0;
        System.out.println("Dame el primer número A");
        try {
            numeroA = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("eso no es un número");
        }
        System.out.println("Dame el número B");
        try {
            numeroB = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("eso no es un número");
        }
        System.out.println("deseas ver los números pares o impares, teclea 1 para pares, 2 para impares");
        if (entrada.nextInt() == 2) {
            if (numeroA < numeroB) {
                int impar;
                impar = numeroA;
                while (impar < numeroB) {
                    if (impar % 2 != 0) {
                        impar = impar + 2;
                        System.out.println("El siguiente numero impar es " + impar);
                    } else {
                        impar = impar + 1;
                        System.out.println("el siguiente numero impar es " + impar);
                    }
                }
            } else {
                int impar;
                impar = numeroB;
                while (impar < numeroA) {
                    if (impar % 2 != 0) {
                        impar = impar + 2;
                        System.out.println("El siguiente numero impar es " + impar);
                    } else {
                        impar = impar + 1;
                        System.out.println("el siguiente numero impar es " + impar);
                    }
                }
            }
        }else{
            if(numeroA<numeroB){
            int par;
            par=numeroA;
            while(par<numeroB){
                if(par%2==0){
                    par=par+2;
                    System.out.println("El siguiente numero par es " +par);
                }else{
                    par=par+1;
                    System.out.println("el siguiente numero par es "+par);
                }
            }
        }else{
            int par;
            par=numeroB;
            while(par<numeroA){
                if(par%2==0){
                    par=par+2;
                    System.out.println("El siguiente numero par es " +par);
                }else{
                    par=par+1;
                    System.out.println("el siguiente numero par es "+par);
                }
            
        }
        }
        }
    }
}
    


