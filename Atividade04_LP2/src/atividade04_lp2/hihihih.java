/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04_lp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class hihihih {
     public static void main (String [] args)
    {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("DIGITE UMA FRASE:");
        String resposta = teclado.nextLine();
        
        try(
                FileWriter out = new FileWriter("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Atividade04_LP2\\src\\atividade04_lp2\\consoante.txt")
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
