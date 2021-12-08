import java.util.Scanner;


public class Primo {
    public static void main(String[] args) {
        int numero=0;
        int contador=1;
        boolean primo= true;
        Scanner entrada= new Scanner(System.in);
        System.out.println("introduce un número");
        numero=entrada.nextInt();
       while(primo==true && contador !=numero){
           if (numero%contador ==0) {
               primo= false;
               contador++;
           }
           
           if (primo == false){
               System.out.println("el numero es primo");
           }else{
               System.out.println("el numero no es primo");
           }
       }
    }

}
