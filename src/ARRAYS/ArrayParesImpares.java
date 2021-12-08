package ARRAYS;


public class ArrayParesImpares {
    public static void main(String[] args) {
        int contadorPares=2;
        int contadorImpares=1;
        int array_pares[]= new int[100];
        int array_Impares[]= new int[100];
        
        for (int i = 0; i < 100; i++) {
            array_pares[i]=contadorPares;
            contadorPares +=2;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(array_pares[i]);
        }
         for (int i = 0; i < 100; i++) {
            array_Impares[i]=contadorImpares;
            contadorImpares +=2;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(array_Impares[i]);
        }
    }

}
