package aula03;

import java.util.ArrayList;
import java.util.Collections;

public class Aula03 {
    public static void main(String[] args)
    {
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        
        lista.add(new Aluno ("Rhysand", 800));
        lista.add(new Aluno ("Azriel", 1200));
        lista.add(new Aluno ("Kallias", 900));
        
        Collections.sort(lista);
        
        for (Aluno a : lista)
            System.out.println(a);
    }
    
}
