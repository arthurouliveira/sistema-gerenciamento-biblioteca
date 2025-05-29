// ARQUIVO: Multa.java
// Comentários detalhados foram adicionados para fins de documentação didática.

// === Início do arquivo Multa.java ===
// package sistema_biblioteca;

// import java.util.List;

public class Multa {

    private HistoricoEmprestimos emprestimo;
    private String motivo;
    private String dataAplicacao;
    private Funcionario funcionarioAplicando;
    private int diasAtraso;
    private String formaPagamento;
    private double valor;

    public Multa(HistoricoEmprestimos emprestimo, String motivo, String dataAplicacao,
                 Funcionario funcionarioAplicando, int diasAtraso, String formaPagamento) {

        this.emprestimo = emprestimo;
        this.motivo = motivo;
        this.dataAplicacao = dataAplicacao;
        this.funcionarioAplicando = funcionarioAplicando;
        this.diasAtraso = diasAtraso;
        this.formaPagamento = formaPagamento;
        this.valor = calcularValorMulta();
    }

    public double calcularValorMulta() {
        return 10.0 + (diasAtraso * 2);
    }

    public double getValor() {
        return valor;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

// Lista contendo multas aplicadas a clientes por atraso na devolução de livros.
    public static double calcularValorTotalMultas(List<Multa> multas) {
        double total = 0.0;
        for (Multa multa : multas) {
            total += multa.getValor();
        }
        return total;
    }

// Lista contendo multas aplicadas a clientes por atraso na devolução de livros.
    public static void exibirMultas(List<Multa> multas) {
        for (int i = 0; i < multas.size(); i++) {
            System.out.println("ID: " + (i+1) + multas.get(i));
        }
    }

    @Override
    public String toString() {
        return " | Empréstimo: {" + this.emprestimo + "} | Motivo: {" + this.motivo + "} | Data da aplicação: " + this.dataAplicacao +
                " | Funcionário aplicando: " + this.funcionarioAplicando + " | Dias de atraso: " + this.diasAtraso +
                " | Forma de pagamento: " + this.formaPagamento + " | Valor da multa: R$ " + this.valor;
    }
}
// === Fim do arquivo Multa.java ===