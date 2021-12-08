import java.util.Scanner;


public class TPV {
    public static void main(String[] args) {
        double precio;
        double descuento;
        double total;
        Scanner entrada = new Scanner(System.in);
        calculaEdad cliente= new calculaEdad();
        System.out.println("¿cuanto cuesta el artículo?");
        precio=entrada.nextInt();
        cliente.calculaedadcliente();
        if(cliente.edad>=65){
            descuento=0.15* precio;
            total=precio-descuento;
            System.out.println("eres mayor de 65, tu descuento es del 15% y el precio "
                    + "final: "+total+ " €");
        }else if(cliente.edad<25){
            descuento=0.1*precio;
            total=precio-descuento;
            System.out.println("eres menor de 25, tu descuento es del 10% y el precio "
                    + "final es: "+total+" €");
        }else{
            System.out.println("No se te aplica descuento, el precio es: "+precio+" €");
        }
    }

}
