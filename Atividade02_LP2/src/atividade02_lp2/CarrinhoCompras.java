package atividade02_lp2;

import java.util.ArrayList;

public class CarrinhoCompras 
{
    private ArrayList<Produto> lista;

    public CarrinhoCompras()
    {
        this.lista = new ArrayList<Produto>();
    }
    public CarrinhoCompras(ArrayList<Produto> lista) 
    {
        this.lista = new ArrayList<Produto>();
    }
    public void incluir(Produto m) {
        this.lista.add(m);
    }

    public void remover(Produto m) {
        this.lista.remove(m);
    }

    public void listar() {
        Double total = 0.00; 
        
            for (Produto p : lista) {
                System.out.println(p.toString());
                total = total + p.getPreco();
            }
            System.out.println("Total: " + total);
        }

    }