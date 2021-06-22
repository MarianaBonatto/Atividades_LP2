package lista01_lp2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import static javafx.scene.input.KeyCode.T;

public class Exercicio03 
{
    public static void main (String [] args)
    {
        HashMap<Integer, Aluno> mapa = new HashMap<Integer, Aluno>();
        
        mapa.put(1, new Aluno(" Rhysand", "rhysinho@gmail.com", "SP1951017"));
        mapa.put(2, new Aluno(" Kallias", "kallias@gmail.com", "SP1951018"));
        mapa.put(3, new Aluno(" Azriel", "az@gmail.com", "SP1951019"));
        
        Set<Integer> chaves = mapa.keySet();
        
        for(Integer m : chaves)
            System.out.println(m + " - " + mapa.get(m));
        
        mapa.remove(2);
        mapa.remove(3);
        
        System.out.println();
          for(Integer m : chaves)
            System.out.println(m + " - " + mapa.get(m));
          
        
    }
}
