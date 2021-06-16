package aula05_lp2;

import java.util.HashMap;

public class Map01 
{
    public static void main (String [] args)
    {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        
        mapa.put(1, "Rhysand");
        mapa.put(2, "Kallias");
        mapa.put(3, "Cassian");
        
        System.out.println(mapa);
        
        mapa.put(3, "Azriel");
        
        System.out.println(mapa);
    }
    
}
