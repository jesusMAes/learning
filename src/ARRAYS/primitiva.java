package ARRAYS;


public class primitiva {
    public static void main(String[] args) {
    int arrayprimitiva[] = new int[6];
    
    for(int i=0; i<6; i++){
        arrayprimitiva[i]=(int)Math.round(Math.random()*49);
    }
    for(int i=0; i<6; i++){
        System.out.println(arrayprimitiva[i]);
    }
    
}

}
