package lista03_lp2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Exercicio03 
{
    public static void main (String [] args) throws IOException
    {
        String vo[] = {"a", "e", "i", "o", "u"};
        List<String> lista_v = Arrays.asList(vo);
        
        String co[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        List<String> lista_c = Arrays.asList(co);
        
        FileReader in = null;
        
        Integer vogal = 0, consoante = 0, caracteres =0;
        

        try
        {
            in = new FileReader("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Lista03_LP2\\src\\lista03_lp2\\entrada.txt");
            
            int m;
            
            while((m = in.read()) != -1){
                String caracter = String.valueOf((char)m);
                
                if(lista_v.contains(caracter)){
                    vogal++;}
                else if (lista_c.contains(caracter)){
                    consoante++;}
            
            caracteres++;
            }
        
        System.out.println("Total de vogais : " + vogal);
        System.out.println("Total consoantes : " + consoante);
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
