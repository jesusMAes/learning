import java.util.Scanner;


public class ejercicioOrdenanumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x=0;
        int Y=0;
        int z=0;
        System.out.println("Introduce un primer número:");
        try{
            x= entrada.nextInt();
        }catch(Exception e){
            System.out.println("eso no es un numero");
        }
         System.out.println("Introduce un segundo número:");
        try{
            Y= entrada.nextInt();
        }catch(Exception e){
            System.out.println("eso no es un numero");
        }
         System.out.println("Introduce un tercer número:");
        try{
            z= entrada.nextInt();
        }catch(Exception e){
            System.out.println("eso no es un numero");
        }
        if(x<Y && Y<z){
            System.out.println("Los números están ordenados");
            if(x+1==Y && Y+1 == z ){
                System.out.println("Los números son consecutivos");
            }
        }else{
            System.out.println("Los números no están ordenados");
        }
        
    }

}
