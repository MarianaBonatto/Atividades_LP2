package aula02.lp2;

import java.util.ArrayList;

public class Exemplo02 
{
    public static void main (String [] args)
    {
        ArrayList<String> lista2 = new ArrayList<String>();
        
        lista2.add("Rhysand");
        lista2.add("Kallias");
        lista2.add("Azriel");
        lista2.add("Rhysand");
        
        //Imprimindo um elemento específico da lista
        String x = lista2.get(0);
        System.out.println(x);
        
        //Descobrindo a posição de um elemento espeífico
        Integer k = lista2.indexOf("Kallias");
        System.out.println(k);
        
        //Confirmando se o elemento 2 é o que pedimos anteriormente mesmo
        String h = lista2.get(1);
        System.out.println(h);
        
        //Substituindo o elemento dois por outro e imprimindo para confirmar
        lista2.set(2, "Cassian");
        String u = lista2.get(2);
        System.out.println(u);
        
        //Removendo um elemento da lista e depois exibindo a lista
        lista2.remove("Cassian");
        for(String p : lista2)
            System.out.println(p);
        
    }
}
