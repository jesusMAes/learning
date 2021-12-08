import java.util.Scanner;


public class AcumuladorInteractivo {
    public static void main(String[] args) {
        int numero=1;
        int acumulador=0;
        int i=0;
        int media;
        Scanner entrada= new Scanner(System.in);
    
        do {  
            System.out.println("introduce un número cuando quieras parar pon un negativo");
            numero=entrada.nextInt();
            acumulador += numero;
            i++;
            media= acumulador/i;
            System.out.println("valor: " + acumulador);
            System.out.println("media: "+ media);
            
        } while (numero>0);
  
        }
        

}
