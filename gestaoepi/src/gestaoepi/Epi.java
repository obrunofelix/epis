package gestaoepi;

import java.time.LocalDate;

public class Epi {
    private String nome;
    private String codigo;
    private LocalDate data;

    public Epi(String nome, String codigo, LocalDate data) {
        this.nome = nome;
        this.codigo = codigo;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }
}

