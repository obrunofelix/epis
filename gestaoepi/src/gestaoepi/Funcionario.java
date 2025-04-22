package gestaoepi;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected List<Epi> listaEpi;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.listaEpi = new ArrayList<>();
    }

    public void adicionarEpi(Epi epi) {
        listaEpi.add(epi);
    }

    public void listarEpi() {
        if (listaEpi.isEmpty()) {
            System.out.println(nome + " não possui EPIs.");
            return;
        }

        System.out.println("EPIs de " + nome + ":");
        for (Epi epi : listaEpi) {
            System.out.println("- " + epi.getNome() + " | Código: " + epi.getCodigo() + " | Validade: " + epi.getData());
        }
    }

     public void substituirEpi(Epi antigo, Epi novo, MotivoTroca motivo) {
        if (!listaEpi.contains(antigo)) {
            System.out.println("Funcionário não possui esse EPI para substituição.");
            return;
        }

        if (motivo == MotivoTroca.VENCIDO && !antigo.getData().isBefore(java.time.LocalDate.now())) {
            System.out.println("O EPI ainda está válido, não pode ser substituído como 'Vencido'.");
            return;
        }

        listaEpi.remove(antigo);
        listaEpi.add(novo);
        System.out.println("EPI substituído com sucesso por motivo: " + motivo);
    }
}
