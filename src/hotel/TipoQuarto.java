package hotel;

public enum TipoQuarto {

    LUXO("luxo"),
    SIMPLES("Simples");

    // Atributo
    private String tipo;

    // Construtor

    TipoQuarto(String tipo) {}

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
