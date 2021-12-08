package herencias;


public class cuadrado extends rectangulo {
    private double lado;
    private double area;
    private double perimetro;
    
    
    public cuadrado(){
        
    }
    public cuadrado(double lado){
        this.lado= lado;
    }
    public cuadrado(double lado, String color, boolean relleno){
        super.color=color;
        super.relleno=relleno;
        this.lado=lado;
    }
    
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    @Override
    public double getArea(){
        area= lado*lado;
        return area;
    }
    @Override
    public double getPerimetro(){
        perimetro= lado*4;
        return perimetro;
    }
    

}
