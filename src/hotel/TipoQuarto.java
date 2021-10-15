package hotel;

public enum TipoQuarto {

    LUXO("luxo"),
    SIMPLES("Simples");

    // Atributo
    private String descricao;

    // Construtoor
    TipoQuarto(String tipo) {}

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
