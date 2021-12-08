
import java.util.Scanner;

public class dados {

    public static void main(String[] args) {
        int dado1, dado2, dado3;
        int dinero;
        int apuesta;
        int bandera= 1;
        int ganancia;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al juego de los dados ¿cuanto tienes?");
        dinero = entrada.nextInt();
    while(bandera==1 && dinero!=0){//bucle para repetir el juego mientras no cambie el valor de bandera
        System.out.println("¿cuanto quieres apostar?");
        apuesta = entrada.nextInt();
   
        if (apuesta <= dinero) {
            dinero -= apuesta;
            System.out.println("has apostado " + apuesta + " €, te queda " + dinero + " €");
//---------------------------------------------Da valor a los dados------------           
            dado1 = (int) Math.round(Math.random() * 6) + 1;
            dado2 = (int) Math.round(Math.random() * 6) + 1;
            dado3 = (int) Math.round(Math.random() * 6) + 1;

            System.out.println("El dado 1 ha sacado un " + dado1 + " , el dado 2 ha "
                    + "sacado un " + dado2 + " y el dado 3 ha sacado un " + dado3);
  //---------------------------------------------reglas de juego ---------------           
            if (dado1 == dado2 && dado1 == dado3 && dado1 == 6) {
                ganancia = apuesta * 5;
                dinero += ganancia;
                System.out.println("Han salido tres seises, ganas " + ganancia + " tienes " + dinero);
                System.out.println("pulsa 1 para continuar, 2 para salir");
                bandera=entrada.nextInt();
            } else if (dado1 == dado2 && dado1 == dado3) {
                ganancia = apuesta * 3;
                dinero += ganancia;
                System.out.println("Han salido tres iguales, ganas " + ganancia + " tienes " + dinero);
                System.out.println("pulsa 1 para continuar, 2 para salir");
                bandera=entrada.nextInt();
            } else if (dado1 == dado2 || dado1 == dado3 || dado3 == dado2) {
                ganancia = apuesta * 2;
                dinero += ganancia;
                System.out.println("Han salido dos iguales, ganas " + ganancia + " tienes " + dinero);
                System.out.println("pulsa 1 para continuar, 2 para salir");
                bandera=entrada.nextInt();
            }else{
                System.out.println("no has ganado ¿volver a jugar?");
                System.out.println("pulsa 1 para continuar, 2 para salir");
                bandera=entrada.nextInt();
            }

        } else {
            System.out.println("no tienes ese dinero");
        }
    }}

}
