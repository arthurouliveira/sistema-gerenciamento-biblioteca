package sistema_biblioteca;

public class Emprestimo {

    private Cliente cliente;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String status;
    private double multaAplicada;
    private Funcionario funcionarioResponsavel;

    public Emprestimo(Cliente cliente, Livro livro, String dataEmprestimo,
                      String dataDevolucao, String status, double multaAplicada,
                      Funcionario funcionarioResponsavel) {

        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.multaAplicada = multaAplicada;
        this.funcionarioResponsavel = funcionarioResponsavel;

    }
}
