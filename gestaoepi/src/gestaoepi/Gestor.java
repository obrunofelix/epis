package gestaoepi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gestor extends Funcionario {
    private List<Operario> operarios;

    public Gestor(String nome, int matricula) {
        super(nome, matricula);
        operarios = new ArrayList<>();
    }

    public void adicionarOperario(Operario operario) {
        operarios.add(operario);
        System.out.println("Operário " + operario.nome + " adicionado com sucesso.");
    }

    public void removerOperario(int matricula) {
        Operario encontrado = null;
        for (Operario op : operarios) {
            if (op.matricula == matricula) {
                encontrado = op;
                break;
            }
        }
        if (encontrado != null) {
            operarios.remove(encontrado);
            System.out.println("Operário " + encontrado.nome + " removido com sucesso.");
        } else {
            System.out.println("Operário com matrícula " + matricula + " não encontrado.");
        }
    }

    public void listarOperariosPorTurno(Turno turno) {
        System.out.println("Operários do turno " + turno + ":");
        boolean encontrou = false;
        for (Operario op : operarios) {
            if (op.getTurno() == turno) {
                System.out.println("- " + op.nome + " (Matrícula: " + op.matricula + ")");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum operário encontrado para esse turno.");
        }
    }

    public void relatorioGeral() {
        System.out.println("=== Relatório Geral de Operários e EPIs ===");
        for (Operario op : operarios) {
            System.out.println("Operário: " + op.nome + " (Matrícula: " + op.matricula + ") - Turno: " + op.getTurno());
            if (op.listaEpi.isEmpty()) {
                System.out.println("  Nenhum EPI registrado.");
            } else {
                for (Epi epi : op.listaEpi) {
                    String status = epi.getData().isBefore(LocalDate.now()) ? "VENCIDO" : "VÁLIDO";
                    System.out.println("  - " + epi.getNome() + " | Código: " + epi.getCodigo() + " | Validade: " + epi.getData() + " (" + status + ")");
                }
            }
            System.out.println();
        }
    }

    public void listarEpisVencidos() {
        System.out.println("=== EPIs Vencidos ===");
        boolean encontrou = false;
        for (Operario op : operarios) {
            for (Epi epi : op.listaEpi) {
                if (epi.getData().isBefore(LocalDate.now())) {
                    System.out.println("- " + epi.getNome() + " (Código: " + epi.getCodigo() + ") do Operário " + op.nome);
                    encontrou = true;
                }
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum EPI vencido encontrado.");
        }
    }
}
