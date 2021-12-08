package herencias;


public class figura {
    String color= "rojo";
    boolean relleno= true;
    public figura(){
        
    }
    public figura(String color, boolean relleno){
        this.color=color;
        this.relleno=relleno;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String col){
        color=col;
    }
    public boolean getRelleno(){
        return relleno;
    }
    public void setRelleno(boolean rel){
        relleno=rel;
    }
    
    @Override
    public String toString(){
        return "soy una figura de color "+ color+ "con relleno "+ relleno;
    }

}
