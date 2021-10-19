package hotel;

import java.time.LocalDate;

public abstract class Hospede {
    // Atributos
    private String nome;
    private String telefone;
    private TipoDocumento tipoDocumento;
    private LocalDate dataDeNascimento;
    private TipoHospede tipoHospede;

    //Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
