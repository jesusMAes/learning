package herencias;


public class Adivinanza {
    Adivinanza (int i)
{
this("Soy un enigma");
System.out.println("Mi número es " + i);
}
Adivinanza (String s)
{
System.out.println(s);
}
void saluda()
{
System.out.println("Hola.");
}
public static void main(String[] args)
{
new Adivinanza(8).saluda();
}

}
