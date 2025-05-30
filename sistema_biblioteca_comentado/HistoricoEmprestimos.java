// ARQUIVO: HistoricoEmprestimos.java
// Comentários detalhados foram adicionados para fins de documentação didática.

// === Início do arquivo HistoricoEmprestimos.java ===
// package sistema_biblioteca;

// import java.util.List;

public class HistoricoEmprestimos extends Emprestimo {

    public HistoricoEmprestimos(Cliente cliente, Livro livro, String dataEmprestimo, String dataDevolucao,
                                String status, double multaAplicada, Funcionario funcionarioResponsavel) {

        super(cliente, livro, dataEmprestimo, dataDevolucao, status, multaAplicada, funcionarioResponsavel);

    }

// Lista com o histórico de todos os empréstimos já realizados.
    public static void exibirLivrosEmprestados(List<HistoricoEmprestimos> livrosEmprestados) {
        for (int i = 0; i < livrosEmprestados.size(); i++) {
            System.out.println("ID: " + (i+1) + livrosEmprestados.get(i));
        }
    }

}
// === Fim do arquivo HistoricoEmprestimos.java ===