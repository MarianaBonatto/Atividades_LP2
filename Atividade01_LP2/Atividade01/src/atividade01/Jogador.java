package atividade01;

import java.util.Objects;

public class Jogador 
{
    private String nome;
    private Integer idade;
    private Integer numero;

    public Jogador()
    {
        nome = "";
        idade = 0;
        numero = 0;
    }
    public Jogador(String nome, Integer idade, Integer numero) {
        this.nome = nome;
        this.idade = idade;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jogador{" + "Nome = " + nome + ", Idade = " + idade + ", Número = " + numero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.idade);
        hash = 71 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Jogador other = (Jogador) obj;
        
        if (nome == null){
            if (other.nome != null)
                return false;
        } else if (!Objects.equals(this.nome, other.nome)) {
            return false;
        } 
        if (idade == null){
            if (other.idade != null)
                return false;
        } else if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (numero == null){
            if (other.numero != null)
                return false;
        } else if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
    
}
