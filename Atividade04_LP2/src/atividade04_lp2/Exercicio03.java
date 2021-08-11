package atividade04_lp2;

import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.in;
import java.util.Arrays;
import java.util.List;

public class Exercicio03 
{
    public static void main(String [] args)
    {
        String vo[] = {"a", "e", "i", "o", "u"};
        List<String> lista_v = Arrays.asList(vo);
        
        String voM[] = {"A", "E", "I", "O", "U"};
        List<String> lista_vM = Arrays.asList(voM);
        
        String co[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        List<String> lista_c = Arrays.asList(co);
        
        String coM[] = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        List<String> lista_cM = Arrays.asList(coM);
        
        FileReader entrada = null;
        
        Integer vogal = 0, consoante = 0, caracteres = 0, espaco = 0;
        

        try
        {
            entrada = new FileReader("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Atividade04_LP2\\src\\atividade04_lp2\\entrada.txt");
            
            int m;
            
            while((m = entrada.read()) != -1){
                String caracter = String.valueOf((char)m);
                
                if((lista_v.contains(caracter)) || (lista_vM.contains(caracter))){
                    vogal++;
                }
                else if ((lista_c.contains(caracter))|| (lista_cM.contains(caracter))){
                    consoante++;
                }
                else{
                    espaco++;
                }
            
            caracteres++;
            }
        
        System.out.println("Total de vogais : " + vogal);
        System.out.println("Total consoantes : " + consoante);
        System.out.println("Total de espaços : " + espaco);
        System.out.println("Total caracteres : " + caracteres);
        }
        catch(IOException e){
        e.printStackTrace();
    }
        finally {
            try{
                in.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
}
    }
    
}
