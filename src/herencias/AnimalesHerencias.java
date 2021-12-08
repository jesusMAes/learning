package herencias;


public class AnimalesHerencias {
    public static void main(String[] args) {
        perro estre=new perro("estrella", 15, "pastor aleman");
        gato flur= new gato("flurflis", 5);
        
        System.out.println("el perro se llama "+ estre.getNombre()+ " tiene " + estre.getEdad()+ " años y es de raza "+estre.getRaza());
        
        System.out.println("el gato se llama "+ flur.getNombre()+ " tiene " + flur.getEdad()+ " años y "+flur.getVidas()+ " vidas");
        flur.restarVidas();
        
        System.out.println("el gato se llama "+ flur.getNombre()+ " tiene " + flur.getEdad()+ " años y "+flur.getVidas()+ " vidas");

    }

}
