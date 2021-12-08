package herencias;


public class gato extends animal {
    int vidas =7;
    public gato(String nom, int ed) {
        super(nom, ed);
    }
    public int getVidas(){
        return vidas;
    }
    public int restarVidas(){
        vidas--;
        return vidas;
    }
    

}
