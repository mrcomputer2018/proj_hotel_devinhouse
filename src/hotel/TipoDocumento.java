package hotel;

public enum TipoDocumento {
    CPF("CPF XXX.XXX.XXX-XX"),
    CNPJ("CNPPJ XX. XXX. XXX/0001-XX");

    private String numero;

    //Construtor
    TipoDocumento(String numero){}

    //Metodos
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
}
