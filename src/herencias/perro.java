package herencias;


public class perro extends animal {
    String raza;
    public perro(String nom, int ed, String raz) {
        super(nom, ed);
        raza=raz;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String s){
        raza=s;
    }

}
