package herencias;


public class circulo extends figura {
    private double radio;
    private double area;
    private double perimetro;
    public circulo(){
        radio=1;
    }
    public circulo(double rad){
        this.radio=rad;
    }
    public circulo(double rad, String color, boolean rel){
        super(color, rel);
        radio=rad;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double rad){
        radio=rad;
    }
    
    public double getArea(){
        area= Math.PI * (radio*radio);
        return area;
    }
    public double getPerimetro(){
       perimetro= Math.PI* (radio*2);
       return perimetro;
    }
    
    public String toString(){
        return "soy un circulo con radio: "+ radio+ 
               " esta es mi superclase "+ super.toString();
    }
    

}
