package aula.pkg01.lp2;
public class ExemploHashCode1 
{
    public static void main(String [] args)
    {
        Integer i = 10;
        Integer j = 10;
        System.out.println("i : " + i.hashCode());
        System.out.println("j : " + j.hashCode());
        
        Carro c1 = new Carro("Gol");
        Carro c2 = new Carro("Gol");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
