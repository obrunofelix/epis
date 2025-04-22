package gestaoepi;

import java.time.LocalDate;
public class Gestaoepi {
    public static void main(String[] args) {
        Operario operario = new Operario("Ostacio", 123, Turno.MANHA);

        Epi capacete = new Epi("Capacete", "EPI001", LocalDate.of(2026, 4, 15));
        Epi capaceteNovo = new Epi("Capacete Novo", "EPI002", LocalDate.of(2026, 5, 1));
        Epi botinaAntiga = new Epi("Botina", "EPI003", LocalDate.of(2023, 4, 15));
        Epi novaBotina = new Epi("Botina Nova", "EPI004", LocalDate.of(2026, 4, 15));
        
        operario.adicionarEpi(capacete);
        operario.listarEpi();

        operario.substituirEpi(capacete, capaceteNovo, MotivoTroca.VENCIDO);
        operario.substituirEpi(capacete, capaceteNovo, MotivoTroca.DANIFICADO);
           
        operario.substituirEpi(botinaAntiga, novaBotina, MotivoTroca.PERDEU);
        
        operario.adicionarEpi(botinaAntiga);
        operario.substituirEpi(botinaAntiga, novaBotina, MotivoTroca.VENCIDO);

        operario.listarEpi();
    }
}
