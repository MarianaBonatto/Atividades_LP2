package atividade03_lp2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercicio02 
{
     public static void main (String [] args)
    {  
         try (
                FileInputStream in = new FileInputStream("entrada.txt");
                FileOutputStream maior = new FileOutputStream("maior.txt");
                FileOutputStream menor = new FileOutputStream("menor.txt");
                )
        {
            Integer m = new Integer(0);
            
            while((m = in.read()) != -1)
            {
                if(m > 128)
                    maior.write(m);
                else
                    menor.write(m);
            }
        }  
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
