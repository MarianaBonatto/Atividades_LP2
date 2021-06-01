package lista0_lp2;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio05 
{
    public static void main (String[]args)
    {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        HashSet<String> set = new HashSet<String>();
        
        do
        {
        System.out.println("Digite palavras ou fim para encerrar : ");
        palavra = teclado.next();
        
        if(! palavra.equals("fim"))
          {
            set.add(palavra);
          }
        }
        while(! palavra.equals("fim"));
        
        do
        {
            System.out.println("Novamente, digite mais palavras ou fim para encerrar o programa : ");
            palavra = teclado.next();
            
            if(! palavra.equals("fim"))
            {
                if(set.contains(palavra))
                    System.out.println(palavra + " -" + " Localizado");
                else
                    System.out.println(palavra + " -" + " Não Localizado");
            }
        } 
        while(! palavra.equals("fim"));
        System.out.println("Progarama Encerrado");
    }
}
