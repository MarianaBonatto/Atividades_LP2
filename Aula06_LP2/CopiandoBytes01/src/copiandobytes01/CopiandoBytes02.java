package copiandobytes01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiandoBytes02 
{
    public static void main(String[] args) throws IOException
    {   
        try (
                FileInputStream in = new FileInputStream("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\CopiandoBytes01\\src\\copiandobytes01\\entrada.txt");
                FileOutputStream out = new FileOutputStream("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\CopiandoBytes01\\src\\copiandobytes01\\saida.txt");
            )
        {
            int m;
            
            while((m = in.read()) != -1){
                out.write(m);
                }
        }  
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
