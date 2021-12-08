package ARRAYS;


public class iniciaArray {
    public static void main(String[] args) {
        int miArray[]= new int [100];
        
        for (int i = 0; i < 100; i++) {
            miArray[i]=i;
        }
        for(int i=0; i<100; i++){
            System.out.println(miArray[i]);
        }
    }

}
