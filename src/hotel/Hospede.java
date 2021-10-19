package hotel;

import java.time.LocalDate;

public abstract class Hospede {

    private String nome;
    private String telefone;
    private TipoDocumento tipoDocumento;
    private LocalDate dataDeNascimento;
    private TipoHospede tipoHospede;
}
