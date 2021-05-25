package aula02.lp2;

import java.util.HashSet;

public class Set2 
{
    public static void main (String [] args)
    {
        HashSet<String> set2 = new HashSet<String>();
        
        set2.add("Rhysand");
        set2.add("Kallias");
        set2.add("Azriel");
        set2.add("Cassian");
        
        //Cmparar se o elemento digitado existe na lista e retorn true ou false
        Boolean k = set2.contains("Maxon");
        System.out.println(k);
        
        //Ele vai analisar se o eleemnto existe e se sim, apagar retornando true
        Boolean j = set2.remove("Cassian");
        System.out.println(j);
        
        //Mostrando todos os elementos da lista
        for (String q : set2)
            System.out.println(q);
    }
}
