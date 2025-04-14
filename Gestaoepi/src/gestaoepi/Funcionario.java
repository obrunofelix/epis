package gestaoepi;

import java.util.ArrayList;
import java.util.List;
        
public class Funcionario {
    protected String nome;
    protected int matricula;
    protected List<Epi> listaEpi;
    
    public Funcionario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.listaEpi = new ArrayList<>();
    }
    
    public void adicionarEPI(Epi epi){
        listaEpi.add(epi);
        System.out.printIn("Epi " + epi.getNome() + "adicionado ao funcionario" + epi.getNome());
    }
    
    public void listarEpis(){
        System.out.printIn("Epis do funcionario " + epi.getNome() + ":");
        for (Epi epi : listaEpi){
            System.out.PrintIn("- " + epi.getNome() + "(Codigo: " + epi.getCodigo() + ")");
        }
    }
    public int getMatricula(){
        return matricula;
    }
}