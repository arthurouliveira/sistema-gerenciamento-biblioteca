package sistema_biblioteca;

public class Multa {

    private Cliente cliente;
    private double valor;
    private String motivo;
    private String dataAplicacao;
    private String status;
    private Livro livroAssociado;
    private String formaPagamento;

    public Multa(Cliente cliente, double valor, String motivo, String dataAplicacao,
                 String status, Livro livroAssociado, String formaPagamento) {

        this.cliente = cliente;
        this.valor = valor;
        this.motivo = motivo;
        this.dataAplicacao = dataAplicacao;
        this.status = status;
        this.livroAssociado = livroAssociado;
        this.formaPagamento = formaPagamento;

    }
}
