package sistema_biblioteca;

public class HistoricoEmprestimos extends Emprestimo {

    public HistoricoEmprestimos(Cliente cliente, Livro livro, String dataEmprestimo, String dataDevolucao,
                                String status, double multaAplicada, Funcionario funcionarioResponsavel) {

        super(cliente, livro, dataEmprestimo, dataDevolucao, status, multaAplicada, funcionarioResponsavel);

    }
}
