package aula02.lp2;

import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) 
    {
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("Rhysand");
        lista.add("Kallias");
        lista.add("Azriel");
        
        for(String y : lista)
            System.out.println(y);
    }
    
}
