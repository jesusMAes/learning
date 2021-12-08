import java.util.Scanner;

public class PrediceTiempo {
    public static void main(String[] args) {
        String presion="";
        String humedad="";
        String lluvia="";
        String sol="";
        String frio="";
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce la presion de tu zona");
        presion=entrada.nextLine();
        System.out.println("Introduce la humedad de tu zona");
        humedad=entrada.nextLine();
        
//--------------------Probabilidad de Lluvia------------------------------------
    if(presion.equals("baja") && humedad.equals("alta")){
        lluvia="probabilidades de lluvia muy altas";
        System.out.println(lluvia);
    }else if(presion.equals("baja") && humedad.equals("media")){
        lluvia="probabilidades de lluvia altas";
        System.out.println(lluvia);
    }else if(presion.equals("baja") && humedad.equals("baja")){
        lluvia="probabilidades de lluvia medias";
        System.out.println(lluvia);
    }else if(presion.equals("media") && humedad.equals("media")){
        lluvia="probabilidades de lluvia medias";
        System.out.println(lluvia);
    }else{
        lluvia="probabilidades de lluvia bajas";
        System.out.println(lluvia);
    }
    //--------------------Probabilidad de sol------------------------------------
    if(presion.equals("baja") && humedad.equals("alta")){
        sol="probabilidades de sol bajas";
        System.out.println(sol);
    }else if(presion.equals("baja") && humedad.equals("media")){
        sol="probabilidades de sol medias";
        System.out.println(sol);
    }else if(presion.equals("baja") && humedad.equals("baja")){
        sol="probabilidades de sol medias";
        System.out.println(sol);
    }else if(presion.equals("media") && humedad.equals("media")){
        sol="probabilidades de sol medias";
        System.out.println(sol);
    }else{
        sol="probabilidades de sol altas";
        System.out.println(sol);
    }
    //--------------------Probabilidad de que haga frío------------------------------------
    if(presion.equals("baja") && humedad.equals("alta")){
        frio="probabilidades de frio muy altas";
        System.out.println(frio);
    }else if(presion.equals("baja") && humedad.equals("media")){
        frio="probabilidades de frio altas";
        System.out.println(frio);
    }else if(presion.equals("media") && humedad.equals("alta")){
        frio="probabilidades de frio altas";
        System.out.println(frio);
    }else if(presion.equals("media") && humedad.equals("media")){
        frio="probabilidades de frio medias";
        System.out.println(frio);
    }else{
        frio="probabilidades de frio bajas";
        System.out.println(frio);
    }
    
    
    }

}
