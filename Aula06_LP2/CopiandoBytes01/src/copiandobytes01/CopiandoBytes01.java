 package copiandobytes01;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiandoBytes01
{
    public static void main(String[] args)
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\CopiandoBytes01\\src\\copiandobytes01\\entrada.txt");
            out = new FileOutputStream("C:\\Users\\carol\\OneDrive\\Documentos\\NetBeansProjects\\CopiandoBytes01\\src\\copiandobytes01\\saida.txt");
            
            int m;
            
            while((m = in.read()) != -1){
                out.write(m);
                }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
        finally {
            try{
                in.close();
                out.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
