import java.util.Scanner;


public class añoBisiesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int año =0; 
        try{
            System.out.println("introduce un año: ");
            año = entrada.nextInt();
        }catch(Exception e){
            System.out.println("debes introducir el año en cifras");
        }
     int  bisiesto=año%4;
     int bisiesto100= año%100;
     int bisiesto400= año%400;
        if(bisiesto==0){
            System.out.println("el año es bisiesto");
            if(bisiesto100==0){
              if(bisiesto400==0)  
                    System.out.println("El año es bisiesto");
            }
            System.out.println("el año no es bisiesto");
        } else {
            System.out.println("el año no es bisiesto");
                    
        }
    }
}
