package atividade02_lp2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exercicio05 
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner (System.in);
        HashMap<String, LocalDate> mapa = new HashMap<String, LocalDate>();
        String nome;
        Integer dia, mes, ano;
        LocalDate data;
        
        do
        {
            System.out.println("Digite um nome ou fim para encerrar o programa : ");
            nome = teclado.next();
            
            if(nome.equals("fim"))
                break;
            
            System.out.println("Digite o dia do nascimento : ");
            dia = teclado.nextInt();
            
            System.out.println("Digite o mês do nascimento : ");
            mes = teclado.nextInt();
            
            System.out.println("Digite o ano do nascimento : ");
            ano = teclado.nextInt();
            
            data = LocalDate.of(ano, mes, dia);
            mapa.put(nome, data);
          
        }
        while(!nome.equals("fim"));
        
         System.out.println(mapa);
        
        
    }
}
