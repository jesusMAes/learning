package herencias;


public class Profesor {
    private String nombre;
    double sueldo;
    
    public Profesor(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }

}