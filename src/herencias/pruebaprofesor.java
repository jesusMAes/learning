package herencias;


public class pruebaprofesor {
    public static void main(String[] args) {
        Profesor prof1 =new Profesor("Juan", 2000);
        System.out.println("soy el profesor "+prof1.getNombre());
        System.out.println("cobro "+ prof1.getSueldo());
        
        Rector rec1 =new Rector("manu", 2000);
        System.out.println("soy el rector "+rec1.getNombre());
        System.out.println("cobro "+ rec1.getSueldo());
    }

}
