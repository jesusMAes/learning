import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        int numero=0;
        int fibo=1;
        int previo=0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("introduce un numero: ");
        numero=entrada.nextInt();
        
        for (int i = 0; i < numero; i++) {
            
            fibo=fibo+previo;
            previo=fibo;
            System.out.println(fibo);
        }
    }

}
