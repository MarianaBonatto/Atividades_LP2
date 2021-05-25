package aula.pkg01.lp2;
public class ExemploEquals2 
{
    public static void main (String[]args)
    {
        Carro c1 = new Carro("Palio");
        Carro c2 = new Carro("Palio");
        Carro c3 = new Carro(null);
        Integer a1 = new Integer(55);
        Carro c4 = new Carro(null);
        
        System.out.println(c3.equals(c4));
        
    }
}
