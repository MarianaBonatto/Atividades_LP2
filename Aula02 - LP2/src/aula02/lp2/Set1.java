package aula02.lp2;

import java.util.HashSet;

public class Set1 
{
    public static void main (String[]args)
    {
        HashSet<String> set1 = new HashSet<String>();
        
        set1.add("Rhysand");
        set1.add("Kallias");
        set1.add("Azriel");
        set1.add("Cassian");
        set1.add("Azriel");
        set1.add("Kallias");
        
        //Quando rodamos, os elementos repitidos ficam de fora
        for(String g : set1)
            System.out.println(g);
    }
}
