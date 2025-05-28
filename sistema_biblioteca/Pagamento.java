package sistema_biblioteca;

public class Pagamento {

    Multa multa;

    private Multa multaSelecionada;
    private double valor = multa.getValor();
    private String formaPagamento;
    private String statusPagamento;
    private String dataPagamento;
    private String multaAplicada = multa.getMotivo();
    private double valorTotal = multa.getValor();

    public Pagamento(Multa multaSelecionada, double valor, String formaPagamento, String statusPagamento,
                     String dataPagamento, String multaAplicada, double valorTotal) {

        this.multaSelecionada = multaSelecionada;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
        this.multaAplicada = multaAplicada;
        this.valorTotal = valorTotal;

    }

    @Override
    public String toString() {
        return " | Multa: {" + this.multaSelecionada + "} | Valor: R$" + this.valor + " | Forma de pagamento: " + this.formaPagamento+
                " | Status de pagamento: " + this.statusPagamento + " | Data de pagamento: " + this.dataPagamento+
                " | Motivo da multa: " + this.multaAplicada + " | Valor total: R$" + this.valorTotal;
    }

}
