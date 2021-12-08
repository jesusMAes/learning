


public class trabajadorsueldo {
    public static void main(String[] args) {
        calculaSueldo antonio= new calculaSueldo();
        antonio.calculadora(30, 8);
        System.out.println("El sueldo de antonio es " +antonio.resultado+ " €/semana"); 
        calculaSueldo anastasia= new calculaSueldo();
        anastasia.calculadora(50, 8);
        System.out.println("El sueldo de anastasia es " +anastasia.total+ " €/semana"); 
    }
}
