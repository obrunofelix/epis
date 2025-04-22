package gestaoepi;
import java.time.LocalDateTime;

public class Operario extends Funcionario {
    private Turno turno;

    public Operario(String nome, int matricula, Turno turno) {
        super(nome, matricula);
        this.turno = turno;
    }

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto às " + LocalDateTime.now());
    }

    public Turno getTurno() {
        return turno;
    }
}
