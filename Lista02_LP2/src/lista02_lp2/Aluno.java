 package lista02_lp2;
 
public class Aluno implements Comparable<Aluno>
{
    private String nome;
    private String email;
    private String prontuario;

    public Aluno()
    {
        this.nome = "";
        this.email = "";
        this.prontuario = "";
    }
    public Aluno(String nome, String email, String prontuario) {
        this.nome = nome;
        this.email = email;
        this.prontuario = prontuario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome = " + nome + ", Email = " + email + ", Prontuario = " + prontuario + '}';
    }
    @Override
    public int compareTo(Aluno t) {
        return this.nome.compareTo(t.nome);
    }
    
}