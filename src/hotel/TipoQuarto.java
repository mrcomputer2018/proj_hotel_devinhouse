package hotel;

public enum TipoQuarto {

    LUXO("luxo"),
    SIMPLES("Simples");

    // Atributo
    private String descricao;

    // Construtor
    TipoQuarto(String descricao) {}

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
