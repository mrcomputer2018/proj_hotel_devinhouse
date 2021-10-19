package hotel;

import java.time.LocalDate;

public abstract class Hospede {

    private String nome;
    private String telefone;
    private String documento;
    private LocalDate dataDeNascimento;
    private TipoHospede tipoHospede;
}
