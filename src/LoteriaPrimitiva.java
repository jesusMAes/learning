
import java.util.Random;




public class LoteriaPrimitiva {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la lotería");
        int numero;
        System.out.println("tu número es: ");
        for (int i = 0; i < 6; i++) {
            Random numeroRandom = new Random();
            numero= (int) numeroRandom.nextInt(50);
            System.out.print(numero+ " ");
        }
    }

}
