package Atividade08;
public class Conteudo 
{
    private String assunto;
    private String mensagem;

    //Métodos construtores
    public Conteudo()
    {
        this.assunto = "";
        this.mensagem = "";
    }
    
    public Conteudo(String assunto, String mensagem) 
    {
        this.assunto = assunto;
        this.mensagem = mensagem;
    }
   
    //Getters e setters
    public String getAssunto() 
    {
        return assunto;
    }

    public void setAssunto(String assunto) 
    {
        this.assunto = assunto;
    }

    public String getMensagem() 
    {
        return mensagem;
    }

    public void setMensagem(String mensagem) 
    {
        this.mensagem = mensagem;
    }

    //toString
    @Override
    public String toString() 
    {
        return "Conteudo { " + " Assunto = " + assunto + ", Mensagem = " + mensagem + '}';
    }
}
