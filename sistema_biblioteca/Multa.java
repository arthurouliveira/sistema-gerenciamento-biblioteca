package sistema_biblioteca;

public class Multa {

    private Cliente cliente;
    private String motivo;
    private String dataAplicacao;
    private int diasAtraso;
    private Livro livroAssociado;
    private String formaPagamento;
    private double valor = 10.0;

    public Multa(Cliente cliente, String motivo, String dataAplicacao,
                 int diasAtraso, Livro livroAssociado, String formaPagamento) {

        this.cliente = cliente;
        this.motivo = motivo;
        this.dataAplicacao = dataAplicacao;
        this.diasAtraso = diasAtraso;
        this.livroAssociado = livroAssociado;
        this.formaPagamento = formaPagamento;

    }

    public double calcularValorMulta() {
        return valor + (diasAtraso * 2);
    }

    @Override
    public String toString() {
        return " | Cliente: [" + this.cliente + "] | Motivo: [" + this.motivo + "] | Data da aplicação: " + this.dataAplicacao+
                " | Dias de atraso: " + this.diasAtraso + " | Livro associado: [" + this.livroAssociado+ "]" +
                " | Forma de pagamento: " + this.formaPagamento + " | Valor da multa: R$ " + this.calcularValorMulta();
    }
}
