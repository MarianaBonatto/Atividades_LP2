package aula05_lp2;

import java.util.HashMap;
import java.util.Set;

public class Map02 
{
    public static void main (String [] args)
    {
        HashMap<String, String> mapa = new HashMap<String, String>();
        
        mapa.put("1", "Rhysand");
        mapa.put("2", "Maxon");
        mapa.put("3", "Draco");
        
        Set<String> chaves = mapa.keySet();
        
        for(String h : chaves)
            System.out.println("Chave: " + h + " || Valor: " + mapa.get(h));
    }
    
}
