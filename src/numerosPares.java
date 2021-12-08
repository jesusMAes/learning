import java.util.Scanner;


public class numerosPares {
    
    
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
            int par;
            par=numeroA;
            while(par<numeroB){
                if(par%2==0){
                    par=par+2;
                    System.out.println("El siguiente numero par es " +par);
                }else{
                    par=par+1;
                    System.out.println("el siguiente numero par es "+par);
                }
            }
        }else{
            System.out.println("El número A debe ser menor que B");
        }
    }

}
