import java.util.Random;


public class Quiniela {
    public static void main(String[] args) {
        System.out.println("bienvenido al servicio de quinielas");
        int numeroaleatorio;
        Random numeroRandom = new Random();
       
        
        for (int i = 0; i < 13; i++) {
            numeroaleatorio=numeroRandom.nextInt(3);
            if (numeroaleatorio==0) {
            System.out.print("1-");
        }else if(numeroaleatorio==1){
            System.out.print("X-");
        }else if(numeroaleatorio==2){
            System.out.print("2-");
        }
        }
          for (int j = 0; j < 1; j++) {
                numeroaleatorio=numeroRandom.nextInt(3);
               if (numeroaleatorio==0) {
            System.out.print("1 ");
        }else if(numeroaleatorio==1){
            System.out.print("X ");
        }else if(numeroaleatorio==2){
            System.out.print("2 ");
        } 
            }
        
    }

}
