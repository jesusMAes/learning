


public class calculaSueldo {
    int horas;
    int precio;
    int resultado;
    int plus;
    int total;
    public int calculadora(int horas, int precio){
        this.horas=horas;
        this.precio=precio;
        if (horas<=40){
            resultado=horas*precio;
        return resultado;
        }else{
            resultado=horas*precio;
            plus= (horas-40)*(precio*15);
            total=resultado+plus;
        return total;
            
        }
    }

}
