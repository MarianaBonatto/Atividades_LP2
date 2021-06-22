package atividade02_lp2;

import java.util.Comparator;

public class CompararProduto implements Comparator<Produto>
{

    @Override
    public int compare(Produto t, Produto t1) {
        return t.getNome().compareTo(t1.getNome());
    }
    
}
