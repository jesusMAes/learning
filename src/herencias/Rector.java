package herencias;


public class Rector extends Profesor {

    public Rector(String nombre, double sueldo) {
        super(nombre, sueldo);
    }
    
     @Override
     public double getSueldo(){
        return sueldo * 1.25;
    }

}
