package gestaoepi;

public class Operario extends Funcionario {
    private string turno;
    
    public Operario(String nome, String matricula, String turno){
        super(nome, matricula);
        this.turno = turno;
    }
    
    public String getTurno() {
        return turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void baterPonto() {
        System.out.println(getNome() + " bateu o ponto no turno: " + turno);
        
    }
}
