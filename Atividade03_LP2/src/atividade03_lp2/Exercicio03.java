package atividade03_lp2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio03 
{
    public static void main (String [] args)
    {
        Random random = new Random();
        List numeros = new ArrayList<>();
        
         try (
                FileOutputStream par = new FileOutputStream("pares.txt");
                FileOutputStream impar = new FileOutputStream("impares.txt");
                ){
             
            for(int a = 0; a < 10; a++){
                int num = random.nextInt(100);
                numeros.add(num);
                
                if(num % 2 == 0)
                {
                    par.write(num);
                }
                else
                {
                    impar.write(num);
                }
                
            }
            Collections.sort(numeros);
            System.out.println(numeros);
        }  
        catch (IOException e){
            e.printStackTrace();
        }
    }
}