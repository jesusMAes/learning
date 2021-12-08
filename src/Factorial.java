import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int factorial=0;
        System.out.println("introduce un número");
        numero=entrada.nextInt();
        for (int i = 1; i < numero-1; i++) {
            int acumulador=numero-1;
            factorial+= numero*acumulador;
            numero--;
        }
        System.out.println("El factorial es: " + factorial);
    }

}
