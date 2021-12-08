package herencias;


public class rectangulo extends figura{
    private double alto;
    private double ancho;
    private double area;
    private double perimetro;
    
    public rectangulo(){
        
    }
    public rectangulo(double alto, double ancho){
        this.alto=alto;
        this.ancho=ancho;
    }
    public rectangulo(double alto, double ancho, String color, boolean relleno){
       this.alto=alto;
       this.ancho=ancho;
       super.color= color;
       super.relleno=relleno;
       
    }
    
    public double getAncho(){
        return ancho;
    }
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    public double getAlto(){
        return alto;
    }
    public void setAlto(double alto){
        this.alto=alto;
    }
    
    public double getArea(){
        area= alto * ancho;
        return area;
    }
    public double getPerimetro(){
        perimetro= (2*alto) + (2*ancho);
        return perimetro;
    }
     public String toString(){
        return "soy un rectangulo con alto: "+ alto+ " y ancho "+ ancho+ 
               " esta es mi superclase "+ super.toString();
    }

}
