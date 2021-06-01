package atividade01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Jogador> lista = new ArrayList<Jogador>();
        String nome;
        Integer idade, numero;
        
        do
        {
        System.out.println("Digite o nome do Jogador :");
        nome = teclado.next();
        
        System.out.println("Digite a idade do Jogador :");
        idade = teclado.nextInt();
        
        System.out.println("Digite o número do Jogador :");
        numero = teclado.nextInt();
     
        lista.add(new Jogador(nome, idade, numero));
       
        }  while(!numero.equals(0));
        
        for(Jogador j : lista)
            System.out.println("\n" + j);
    }
}
