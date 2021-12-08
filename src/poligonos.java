import java.util.Scanner;


public class poligonos {
    
    public static void main(String[] args) {
        int lados;
        int longitud;
        int apotema;
        int area;
        int perimetro;
        String nombre="";
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce el número de lados");
        lados=entrada.nextInt();
//-----------------------------------DETERMINA TIPO POLÍGONO--------------------       
        if(lados==3){
            nombre="triangulo";
        }else if (lados==4){
            nombre="cuadrado";
        }else if (lados==5){
            nombre="pentagono";
        }else if (lados==6){
            nombre="hexagono";
        }else if (lados==7){
            nombre="heptagono";
        }else if (lados==8){
            nombre="octagono";
        }else if (lados==0){
            nombre="nonagono";
        }else if (lados==10){
            nombre="decagono";
        }
//-----------------------------------DETERMINA TIPO POLÍGONO--------------------

        System.out.println("introduce longitud del lado");
        longitud=entrada.nextInt();
        System.out.println("Introduce apotema");
        apotema=entrada.nextInt();
//-----------------------------------CALCULA EL AREA----------------------------        
        area= lados*longitud*apotema/2;
        System.out.println("el area de tu " + nombre+" es: " + area);
//-----------------------------------CALCULA EL PERIMETRO----------------------------        
        perimetro= lados*longitud;
        System.out.println("Y el perímetro de tu " + nombre+" es: " + perimetro);
    }

    
}
