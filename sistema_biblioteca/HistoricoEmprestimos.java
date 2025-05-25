package sistema_biblioteca;

import java.util.List;

public class HistoricoEmprestimos {

    private Cliente cliente;
    private List<Livro> livrosEmprestados;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String status;
    private double multaAplicada;
    private Funcionario funcionarioResponsavel;

    public HistoricoEmprestimos(Cliente cliente, List<Livro> livrosEmprestados,
                                String dataEmprestimo, String dataDevolucao, String status,
                                double multaAplicada, Funcionario funcionarioResponsavel) {

        this.cliente = cliente;
        this.livrosEmprestados = livrosEmprestados;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.multaAplicada = multaAplicada;
        this.funcionarioResponsavel = funcionarioResponsavel;

    }
}
