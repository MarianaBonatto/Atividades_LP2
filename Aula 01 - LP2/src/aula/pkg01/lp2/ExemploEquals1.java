package aula.pkg01.lp2;
public class ExemploEquals1 
{
    public static void main (String[]args)
    {
        Integer m = 20;
        Integer n = 50;
        
        //COMPARANDO SE O M TEM O MESMO VALOR QUE N E RETORNANDO FALSE
        System.out.println(m.equals(n));
        
        String x = "x";
        String l = "x";
        
        //COMPARANDO SE X TEM O MESMO VALOR QUE L E RETORNANDO TRUE
        System.out.println(x.equals(l));
    }
}
