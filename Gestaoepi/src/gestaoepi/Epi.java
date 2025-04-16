package gestaoepi;
import java.util.Date;
public class Epi {
    private String nome;
    private String codigo;
    private Date dataValidade;
    
    public Epi(String nome,String codigo,Date dataValidade){
        this.nome = nome;
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public Date getdataValidade() {
        return dataValidade;
    }
}
