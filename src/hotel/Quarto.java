package hotel;

public class Quarto {
    //Atributos
    private int numero;
    private boolean status;
    private double valor;
    private TipoQuarto tipoQuarto;

    // 90/140 baixa - 150/400 alta
    private static final double precoBaseQuartoSimples = 90.00;
    private static final double precoBaseQuartoLuxo = 140.00;

    //Metodos
   public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    public Quarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }
}
