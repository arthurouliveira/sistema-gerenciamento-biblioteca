package sistema_biblioteca;

import java.util.List;

public class Multa {

    private HistoricoEmprestimos emprestimo;
    private String motivo;
    private String dataAplicacao;
    private Funcionario funcionarioAplicando;
    private int diasAtraso;
    private String formaPagamento;
    private double valor = 10.0;

    public Multa(HistoricoEmprestimos emprestimo, String motivo, String dataAplicacao,
                 Funcionario funcionarioAplicando, int diasAtraso, String formaPagamento, double valor) {

        this.emprestimo = emprestimo;
        this.motivo = motivo;
        this.dataAplicacao = dataAplicacao;
        this.funcionarioAplicando = funcionarioAplicando;
        this.diasAtraso = diasAtraso;
        this.formaPagamento = formaPagamento;
        this.valor = calcularValorMulta();

    }

    public double calcularValorMulta() {
        return valor + (diasAtraso * 2);
    }

    public double getValor() {
        return valor;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public String toString() {
        return " | Empréstimo: [" + this.emprestimo + "] | Motivo: [" + this.motivo + "] | Data da aplicação: " + this.dataAplicacao+
                " | Funcionário aplicando: " + this.funcionarioAplicando + " | Dias de atraso: " + this.diasAtraso +
                " | Forma de pagamento: " + this.formaPagamento + " | Valor da multa: R$ " + this.calcularValorMulta();
    }

}
