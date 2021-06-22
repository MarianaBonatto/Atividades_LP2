package atividade02_lp2;

import java.util.Collections;

public class Exercicio03 
{
    public static void main (String [] args)
    {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        //Inserindo Produtos
        Produto produto = new Produto("Os testamentos", 1, 23.9);
        carrinho.incluir(produto);
        
        Produto produto2 = new Produto("O acordo", 2, 31.9);
        carrinho.incluir(produto2);
        
        Produto produto3 = new Produto("Café da manhã dos campeões", 3, 39.9);
        carrinho.incluir(produto3);
        
        Produto produto4 = new Produto("Fahrenheit 451", 4, 22.7);
        carrinho.incluir(produto4);
        
        //Listando produtos
        System.out.println("Itens no carrinho : ");
        carrinho.listar();
        
        //Removendo produtos
        System.out.println();
        System.out.println("Carrinho atualizado : ");
        carrinho.remover(produto2);
        carrinho.remover(produto3);
       
        //Listando Produtos 
        carrinho.listar();
        
    }
}
