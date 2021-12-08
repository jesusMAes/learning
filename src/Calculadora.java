
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operador;
        int numA = 1;
        int numB = 1;
        int resultado;
        while (numA > 0 && numB > 0) {
            System.out.println("Introduzca un operador");
            operador = entrada.next();
            System.out.println("Introducza un número");
            numA = entrada.nextInt();
            System.out.println("Introduzca otro numero");
            numB = entrada.nextInt();
            

            if (operador.equals("+")) {
                resultado = numA + numB;
                System.out.println("el resultado de su operación " + numA
                        + " " + operador + " " + numB + " es: " + resultado);
            } else if (operador.equals("-")) {
                resultado = numA - numB;
                System.out.println("el resultado de su operación " + numA
                        + " " + operador + " " + numB + " es: " + resultado);
            } else if (operador.equals("*")) {
                resultado = numA * numB;
                System.out.println("el resultado de su operación " + numA
                        + " " + operador + " " + numB + " es: " + resultado);
            } else if (operador.equals("/")) {
                resultado = numA / numB;
                System.out.println("el resultado de su operación " + numA
                        + " " + operador + " " + numB + " es: " + resultado);
            }

        }

    }
}
