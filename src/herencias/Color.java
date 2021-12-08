package herencias;


public class Color {
    
    
    public void PintaBlanco(){
        Blanco blanco1= new Blanco();
        
    }
    public void PintaNegro(){
        Negro negro1= new Negro();
        
    }
    
    
    
    class Blanco{
        public Blanco(){
            System.out.println("soy una clase de color blanco");
        }
        
    }
    class Negro{
        public Negro(){
            System.out.println("soy una clase de color negro");
        }
        
    }

}
