import java.util.Scanner;


public class ruleta {
    
    public static void main(String[] args) {
    int numeroRuleta;
    int colorRuleta;
    int numeroUsuario;
    int colorUsuario;
    String color="";
    int saldo= 2000;
    int apuesta;
    int ganancia;
    int decision;
    Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a la ruleta tienes "+saldo+ " €");
        System.out.println("¿quieres jugar? pulsa 1 para jugar, 2 para salir");
        decision=entrada.nextInt();
        while (decision==1) {
            System.out.println("elige tu apuesta");
            apuesta=entrada.nextInt();
//-------------------------------EVITA QUE APUESTE MÁS DE LO QUE TIENE----------            
            if(apuesta<=saldo){
                saldo-= apuesta;
            System.out.println("elige 0 para rojo, 1 para negro");
            colorUsuario= entrada.nextInt();
 //----------------------------LA RULETA ELIGE COLOR Y LE DA NOMBRE-------------           
            colorRuleta=(int)Math.round(Math.random()*2);
                if (colorRuleta==0) {
                    color="Rojo";
                }else if(colorRuleta==1){
                    color= "negro";
                }
//--------------------------------ELIGE NUMERO PARA RESULTADO-------------------                
            System.out.println("elige un número del 0 al 40");
            numeroUsuario=entrada.nextInt();
            numeroRuleta=(int)Math.round(Math.random()*40);
            if(numeroUsuario==numeroRuleta && colorUsuario==colorRuleta){
                ganancia = apuesta*10;
                saldo+= ganancia;
                System.out.println("Enhorabuena ha salido tu numero" + numeroRuleta+ "color "+ color
                        + " has ganado "+ ganancia+ " tienes "+ saldo+ "€" );
                System.out.println("pulsa 1 para volver a jugar, 2 para salir");
                decision=entrada.nextInt();
                
            }else{
                System.out.println("Ha salido: "+ numeroRuleta+ " color "+ color);
                System.out.println("No has ganado, te queda "+saldo+ " € ¿quieres volver a jugar?");
                System.out.println("pulsa 1 para volver a jugar, 2 para salir");
                decision=entrada.nextInt();
            }
            
            
            }else{
                System.out.println("no tienes ese dinero");
            }
        }
    }

}
