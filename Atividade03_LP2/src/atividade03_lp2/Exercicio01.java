package atividade03_lp2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
         
         FileInputStream in = null;
         
         do
         {
             try
             {
                 System.out.println("DIGITE O NOME DO ARQUIVO : ");
                 String arquivo = teclado.nextLine();
                 
                 in = new FileInputStream(arquivo);
                 
                 Integer m;
                 
                 while((m = in.read()) != -1)
                 {
                     System.out.println(m);
                 }
             }
             catch(FileNotFoundException e)
             {
                 in = null;
             }
             catch(IOException f)
             {
                 f.printStackTrace();
             }
             finally
             {
                 try
                 {
                     in.close();
                 }
                 catch(IOException g)
                 {
                     g.printStackTrace();
                 }
             }
         }
         while(in == null);
    }
}
