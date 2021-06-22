package lista01_lp2;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio05
{
    public static void main (String [] args)
    {
         ArrayList<Aluno> diario = new ArrayList<Aluno>();
         
         diario.add(new Aluno(" Rhys", "rhysinho@gmail.com", "SP1951017"));
         diario.add(new Aluno(" Az", "az@gmail.com", "SP1951019"));
         diario.add(new Aluno(" Cassian", "cassiano@gmail.com", "SP1951011"));
         
         Collections.sort(diario);
         
         for(Aluno a : diario)
             System.out.println(a);
         
         Collections.sort(diario, new OrdemProntuario());
         
         System.out.println();
         for(Aluno a : diario)
             System.out.println(a);
    }
}
