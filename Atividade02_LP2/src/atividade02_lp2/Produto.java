package atividade02_lp2;
public class Produto 
{
    private String nome;
    private Integer codigo;
    private Double preco;

    public  Produto()
    {
        this.nome = "";
        this.codigo = 0;
        this.preco = 0.0;
    }
    public Produto(String nome, Integer codigo, Double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Produto{" + " Nome = " + nome + ", Código = " + codigo + ", Preço = " + preco + '}';
    }
    
    
}
