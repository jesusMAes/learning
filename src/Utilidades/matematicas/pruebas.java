package Utilidades.matematicas;


public class pruebas {
    public static void main(String[] args) {
        sumar sum = new sumar();
        System.out.println(sum.suma(5, 10));
        System.out.println("El otro metodo sobrecargado " + sum.suma(5.5, 10.5));
        
        potenciar pot = new potenciar();
        System.out.println(pot.potencia(2, 3));
        System.out.println("Otra potencia sobrecargada"+ pot.potencia(2.5, 2));
        
    }

}
