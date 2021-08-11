package atividade04_lp2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 
{
    public static void main(String[] args) throws IOException
    {
        Scanner teclado = new Scanner(System.in);
        String vo[] = {"a", "e", "i", "o", "u"};
        List<String> lista_v = Arrays.asList(vo);
        
        String voM[] = {"A", "E", "I", "O", "U"};
        List<String> lista_vM = Arrays.asList(voM);
        
        String co[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        List<String> lista_c = Arrays.asList(co);
        
        String coM[] = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        List<String> lista_cM = Arrays.asList(coM);

         System.out.println("DIGITE UMA FRASE :");
         String frase = teclado.next();
            
        try
            (
                 FileWriter vogal = new FileWriter("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Atividade04_LP2\\src\\atividade04_lp2\\vogal.txt");
                 FileWriter consoante = new FileWriter("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Atividade04_LP2\\src\\atividade04_lp2\\consoante.txt")
                )
        {
            
            for(Integer i = 0; i < frase.length(); i++)
            {
              char caracter = frase.charAt(i);
              String caracteres = String.valueOf((char)caracter);
               
                
                if((lista_v.contains(caracteres)) || (lista_vM.contains(caracteres))){
                    vogal.write(caracteres);
                } 
                else if ((lista_c.contains(caracteres))|| (lista_cM.contains(caracteres))){
                    consoante.write(caracteres);
                   }
                }
            
          }
        catch(IOException e){
        e.printStackTrace();
    }
        teclado.close();
    }
}

