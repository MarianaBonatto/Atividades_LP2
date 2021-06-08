package aula03;
public class Aluno implements Comparable<Aluno>
{
    private String nome;
    private Integer idade;

    public Aluno() 
    {
    this.nome = "";
    this.idade = 0;
    }
    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public String toString() {
        return "Aluno{" + "Nome = " + nome + ", Idade = " + idade + '}';
    }

    @Override
    public int compareTo(Aluno t) {
        return this.nome.compareTo(t.nome);
    }
    
    
}
