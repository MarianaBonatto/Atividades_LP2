package lista0_lp2;

import java.util.Objects;

public class Jogador 
{
    private String nome;
    private Integer idade;
    private String email;

    public Jogador()
    {
        nome = "";
        idade = 0;
        email = "";
    }
    public Jogador(String nome, Integer idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Jogador{" + "Nome = " + nome + ", \n Idade = " + idade + ", \n Email = " + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.idade);
        hash = 79 * hash + Objects.hashCode(this.email);
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
        if(nome == null){
            if(other.nome != null)
                return false;
        }else if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if(email == null){
            if(other.email != null)
                return false;
        }else if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if(idade == null){
            if(other.idade != null)
                return false;
        } else if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        return true;
    }
    
    
}
