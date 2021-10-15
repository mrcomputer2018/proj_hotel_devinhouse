package hotel;

public enum TipoCliente {
    COMUM("comum"),
    ESPECIAL("especial");

    //Atributos
    private String tipo;

    // Construtor
    TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    //Getters e Setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
