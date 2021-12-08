import java.util.Scanner;

public class calculaEdad {
    public static void main(String[] args) {
        int diaNac=0;
        int mesNac=0;
        int anoNac=0;
        int diaActual=5;
        int mesActual=12;
        int anoActual=2021;
        int edad=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("di el dia que naciste");
        diaNac=entrada.nextInt();
        System.out.println("di el mes que naciste");
        mesNac=entrada.nextInt();
        System.out.println("di el año que naciste");
        anoNac=entrada.nextInt();
        
        
        
        if(mesActual>mesNac ){
            
            edad= (anoActual-anoNac) ;
        }else if(mesActual==mesNac){
            if (diaActual>=diaNac) {
                edad= (anoActual-anoNac) ;
            }else{
                edad= (anoActual-anoNac)-1 ;
            }
        }else if(mesActual<mesNac){
            edad= (anoActual-anoNac)-1 ;
        }
        System.out.println("Tu edad es "+edad);
    }
    public void calculaedadcliente(){
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("di el dia que naciste");
        diaNac=entrada.nextInt();
        System.out.println("di el mes que naciste");
        mesNac=entrada.nextInt();
        System.out.println("di el año que naciste");
        anoNac=entrada.nextInt();
        
        if(mesActual>mesNac ){
            
            edad= (anoActual-anoNac) ;
        }else if(mesActual==mesNac){
            if (diaActual>=diaNac) {
                edad= (anoActual-anoNac) ;
            }else{
                edad= (anoActual-anoNac)-1 ;
            }
        }else if(mesActual<mesNac){
            edad= (anoActual-anoNac)-1 ;
        }
        System.out.println("Tu edad es "+edad);
        
    }
int diaNac=0;
        int mesNac=0;
        int anoNac=0;
        int diaActual=5;
        int mesActual=12;
        int anoActual=2021;
        int edad=0;
}
