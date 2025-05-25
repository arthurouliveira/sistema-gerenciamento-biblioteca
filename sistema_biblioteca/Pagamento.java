package sistema_biblioteca;

public class Pagamento {

    private Cliente cliente;
    private double valor;
    private String formaPagamento;
    private String statusPagamento;
    private String dataPagamento;
    private double multaAplicada;
    private double valorTotal;

    public Pagamento(Cliente cliente, double valor, String formaPagamento, String statusPagamento,
                     String dataPagamento, double multaAplicada, double valorTotal) {

        this.cliente = cliente;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
        this.multaAplicada = multaAplicada;
        this.valorTotal = valorTotal;

    }
}
