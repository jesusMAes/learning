import java.util.Scanner;


public class TabladeMultiplicar {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Introduce el número del que deseas obtener la tabla");
        try{
            numero=entrada.nextInt();
        }catch(Exception e){
            System.out.println("eso no es un número");
        }
        
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " X " + i +" = "+ numero*i);
        }
    }
}
