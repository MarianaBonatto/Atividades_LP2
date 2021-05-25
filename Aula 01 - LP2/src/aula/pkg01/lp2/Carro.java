package aula.pkg01.lp2;

import java.util.Objects;

public class Carro 
{
    private String modelo;
    
    public Carro(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

     // Carro c1 = new Carro("Palio");
     // Carro c2 = new Carro("Gol");
     // System.out.println(c1.equals(c2));
    public boolean equals(Object obj)
    {
        //COMPARA SE O C1 É IGUAL À C1, SE SIM, ELE RETORNA VERDADE, 
        //SE NÃO VAI PARA O PRÓXIMO IF
        if(this == obj)
            return true;
        //COMPARA SE O C2 TEM O VALOR NULO, ELE RETORNARÁ FALSO PORQUE
        //ESTARÍAMOS COMPARANDO UM NULLO COM UM NÃO NULO
        if(obj == null)
            return false;
        //COMPARA SE A CLASSE DO C1 É DIFERENTE DA CLASSE DO C2, SE FOR, ELE 
        //RETORNA FALSO
        if(getClass() != obj.getClass())
            return false;
        //AQUI ELE CONVERTE O VALOR DO C2 PARA UM CARRO E ANALISA O QUE TEM
        //DENTRO DELE
        Carro other = (Carro) obj;
        //SE UM MODELO TIVER VALOR NULO, SERÁ VERIFICADO SE O OUTRO TAMBÉM
        //TEM O VALOR NULO, SE NÃO TIVWER, ELE RETORNA FALSO
        if(modelo == null){
            if(other.modelo != null)
                return false;
        }
        //SE OS MODELOS FOREM DIFERENTES, SERÁ COMPARADO O MODELO DO C1 COM O C2
        //SE IGUAL, RETORNA TRUE, SE NÃO, FALSE
        else if(!modelo.equals(other.modelo))
            return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.modelo);
        return hash;
    }
}
