package lista01_lp2;

import java.util.HashMap;

public class Exercicio04 
{
    public static void main (String [] args)
    {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        
        mapa.put("Santos".length(), "Santos");
        mapa.put("Fortaleza".length(), "Fortaleza");
        mapa.put("Campinas".length(), "Campinas");
        
        System.out.println(mapa);
    }
}
