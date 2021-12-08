import java.util.Scanner;


public class resta {
    public static void main(String[] args) {
        int A =0;
        int B=0;
        Scanner entrada = new Scanner(System.in);
        try{
        System.out.println("Dame el primer número");
        A= entrada.nextInt();
        System.out.println("Dame el segundo número");
        B= entrada.nextInt();
        } catch(Exception e){
            System.out.println("lo que has introducido no es un número");
        }
        if(A<=B){
            int solucion=B-A;
            System.out.println("El resultado de la resta es: "+ solucion);
        }else if(B<=A){
            int solucion=A-B;
            System.out.println("el resultado de la resta es: "+ solucion);
        }
                
        
        
    }
}
