package gestaoepi;
import java.util.Date;
public class Gestaoepi {
    public static void main(String[] args) {
        Epi capacete = new Epi("Capacete de segurança", "EPI001", new Date());
        Epi luvas = new Epi("Luvas Anticorte", "EPI002", new Date());
        Epi oculos = new Epi ("Oculos de proteçao", "EPI003", new Date());
    }
    
    Operario operario1 = new Operario("Igor", "OP123", "MANHA");
    operario1.adicionarEpi(capacete);
    operario1.adicionarEpi(luvas);
    
}
