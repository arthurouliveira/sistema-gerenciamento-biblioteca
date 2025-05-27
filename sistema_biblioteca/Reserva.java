package sistema_biblioteca;

public class Reserva {

    private Cliente cliente;
    private Livro livro;
    private String dataReserva;
    private String status;
    private String dataExpiracao;
    private int numeroDiasParaRetirada;
    private String dataSolicitacao;

    public Reserva(Cliente cliente, Livro livro, String dataReserva, String status,
                   String dataExpiracao, int numeroDiasParaRetirada, String dataSolicitacao) {

        this.cliente = cliente;
        this.livro = livro;
        this.dataReserva = dataReserva;
        this.status = status;
        this.dataExpiracao = dataExpiracao;
        this.numeroDiasParaRetirada = numeroDiasParaRetirada;
        this.dataSolicitacao = dataSolicitacao;

    }

    @Override
    public String toString() {
        return " | Cliente: [" + this.cliente + "] | Livro: [" + this.livro + "] | Data da reserva: " + this.dataReserva+
                " | Status da reserva: " + this.status + " | Data de expiração: " + this.dataExpiracao+
                " | Dias para retirada: " + this.numeroDiasParaRetirada + " | Data da solicitação: " + this.dataSolicitacao;
    }

}

