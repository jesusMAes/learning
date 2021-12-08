import java.util.Scanner;


public class numerosImpares {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroA=0;
        int numeroB=0;
        System.out.println("Dame el primer número A");
        try{
           numeroA = entrada.nextInt();
        }catch(Exception e){
            System.out.println("eso no es un número");
        }
        System.out.println("Dame el número B");
        try{
            numeroB=entrada.nextInt();
        }catch(Exception e){
            System.out.println("eso no es un número");
        }
        
        if(numeroA<numeroB){
            int impar;
            impar=numeroA;
            while(impar<numeroB){
                if(impar%2!=0){
                    impar=impar+2;
                    System.out.println("El siguiente numero impar es " +impar);
                }else{
                    impar=impar+1;
                    System.out.println("el siguiente numero impar es "+impar);
                }
            }
        }else{
            int impar;
            impar=numeroB;
            while(impar<numeroA){
                if(impar%2!=0){
                    impar=impar+2;
                    System.out.println("El siguiente numero impar es " +impar);
                }else{
                    impar=impar+1;
                    System.out.println("el siguiente numero impar es "+impar);
                }
            }
        }
    }


}
