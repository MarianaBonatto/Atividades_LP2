package lista02_lp2;

import java.util.Comparator;

public class OrdemProntuario implements Comparator<Aluno>
{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) 
    {
        return aluno1.getProntuario().compareTo(aluno2.getProntuario());
    }
    
}