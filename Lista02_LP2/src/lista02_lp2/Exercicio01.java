package lista02_lp2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercicio01 
{
    public static void main (String [] args)
    {
        try (
                FileInputStream in = new FileInputStream("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Lista02_LP2\\src\\lista02_lp2\\entrada.txt");
                FileOutputStream pares = new FileOutputStream("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Lista02_LP2\\src\\lista02_lp2\\pares.txt");
                FileOutputStream impares = new FileOutputStream("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\Lista02_LP2\\src\\lista02_lp2\\impares.txt");
                )
        {
            int m;
            
            while((m = in.read()) != -1)
            {
                if(m % 2 == 0)
                    pares.write(m);
                else
                    impares.write(m);
            }
        }  
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
