
import java.util.Scanner;

public class notasDeClase {

    public static void main(String[] args) {
        int nota = 0;
        int aprobados = 0;
        int suspensos = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 31; i++) {
        System.out.println("Introduce la nota del alumno");
        try {
            nota = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("eso no es un número");
        }
        if(nota>=1 && nota <=10){
            if(nota<5){
                suspensos++;
            }else if(nota>=5){
                aprobados++;
            }
        }else {
            System.out.println("nota no válida");
        }
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Suspensos: " + suspensos);
    }
    }
}

