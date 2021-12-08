
import java.util.Scanner;




public class mayormenorymediano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, C;
        A=0;
        B=0;
        C=0;
//--------------------------RECOGER NÚMEROS --------------------------------        
        System.out.println("Introduce un número A");
        try {
            A = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("eso no es un número");
        }
        System.out.println("Introduce segundo número B");
        try {
            B = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("eso no es un número");
        }
        System.out.println("Introduce tercer número C");
        try {
            C = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("eso no es un número");
        }
//--------------------------BUSCAR EL MAYOR -------------------------------- 
        if(A>B && A>C){
            System.out.println("A es el mayor");
            if(B>C){
                System.out.println("B el mediano");
                System.out.println("Y C el menor");
            }else  if(C>B){
                System.out.println("C el mediano");
                System.out.println("Y B el menor");
            }
        }else if(B>A && B>C){
            System.out.println("B es el mayor");
            if(A>C){
                System.out.println("A el mediano");
                System.out.println("Y C el menor");
            }else  if(C>A){
                System.out.println("C el mediano");
                System.out.println("Y A el menor");
            }
        }else if(C>A && C > B){
            System.out.println("C es el mayor");
            if(A>B){
                System.out.println("A el mediano");
                System.out.println("Y B el menor");
            }else  if(B>A){
                System.out.println("B el mediano");
                System.out.println("Y A el menor");
            }
        }
        

    }
}