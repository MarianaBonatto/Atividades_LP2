package lista03_lp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("DIGITE UMA FRASE:");
        String resposta = teclado.nextLine();
        
        try(
                FileWriter out = new FileWriter("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Lista03_LP2\\src\\lista03_lp2\\texto.txt")
            ){
            for (Integer i = 0; i<resposta.length(); i++)
            {
                char caracter = resposta.charAt(i);
                out.write(caracter);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
