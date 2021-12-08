package herencias;


public class PruebasFigura {
    public static void main(String[] args) {
        circulo cir = new circulo(3);
        System.out.println(" mi radio es: " +cir.getRadio());
        System.out.println(" mi area es: " +cir.getArea());
        System.out.println(" mi color es: " +cir.getColor());
        System.out.println(" mi perimetro es: " +cir.getPerimetro());
        System.out.println("");
        
        rectangulo rec = new rectangulo(5, 10);
        System.out.println(" mi area es "+ rec.getArea());
        System.out.println(" mi perimetro es "+ rec.getPerimetro());
        System.out.println("");
        
        cuadrado cuac=new cuadrado(5);
        System.out.println(" mi area es "+ cuac.getArea());
        System.out.println(" mi perimetro es "+ cuac.getPerimetro());
        System.out.println(cuac.toString());
        
        
        
        
    }

}
