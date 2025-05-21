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
}
