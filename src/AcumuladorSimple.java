


public class AcumuladorSimple {
    public static void main(String[] args) {
        int par = 0;
        int siguiente=0;
        int suma=0;
        System.out.println("Suma de todos los números pares entre 1 y 1000");
        for (int i = 0; i < 500; i++) {
           if(i%2==0){
               siguiente= i+2;
           }else{
               siguiente=i+3;
           }
           par = par + siguiente ;
           
        }
        System.out.println("el resultado es: " +par);
        
        acum acumulador= new acum();
        suma= acumulador.calcularSuma();
        System.out.println(suma);
    }

}
