package herencias;

public class animal {

    private String nombre;
    private int edad;
    private static int contador;

    public animal(String nom, int ed) {
        nombre = nom;
        edad = ed;
        contador++;
    }
    public animal(animal ani){
        nombre=ani.getNombre();
        edad=ani.getEdad();
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) {
        edad = ed;
    }
     public int getcontador() {
        return contador;
    }

}
