package atividade01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 
{
    public static void main( String [] args)
    {
        Scanner teclado = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Integer menor = new Integer(0);
        Integer numero = new Integer(0);  
        Integer maior = new Integer(0);
        do
        {
            System.out.println("Digite um número positivo inteiro : ");
            numero = teclado.nextInt();
            
            if(! numero.equals(0)){
                lista.add(numero);
            }
        }
        while(! numero.equals(0));
        
        System.out.println("Quantidade de números armazenados : " + lista.size());
        
        for(Integer k : lista)
        {
            if(k > maior)
                maior = k;
        } 
                System.out.println("O maior número digitado é : " + maior);
               
        for(Integer m : lista)
        {
            if( m < maior)
                maior = m;
                menor = maior;
        } 
            System.out.println("O menor número digitado é : " + menor);
    }   
}
