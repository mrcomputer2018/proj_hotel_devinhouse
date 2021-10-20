package hotel;

public enum TipoHospede {
    ESPECIAL("Especial"),
    COMUM("Comum");

   // Atributo
    private String descricao;

    // Construtor
    TipoHospede(String descricao) {
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
