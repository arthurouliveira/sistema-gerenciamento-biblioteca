// ARQUIVO: Relatorio.java
// Comentários detalhados foram adicionados para fins de documentação didática.

// === Início do arquivo Relatorio.java ===
// package sistema_biblioteca;

// import java.util.List;

public class Relatorio {

// Lista com o histórico de todos os empréstimos já realizados.
    private List<HistoricoEmprestimos> emprestimosCadastrados;
// Lista com os empréstimos que ainda não foram finalizados.
    private List<Emprestimo> emprestimosAtivos;
// Lista que armazenará todos os livros cadastrados no sistema.
    private List<Livro> livrosCadastrados;
// Lista contendo multas aplicadas a clientes por atraso na devolução de livros.
    private List<Multa> multasCadastradas;
    private double valorTotalMultas;
// Lista que armazenará os clientes cadastrados na biblioteca.
    private List<Cliente> clientesCadastrados;
// Lista para manter os registros dos funcionários da biblioteca.
    private List<Funcionario> funcionariosCadastrados;
// Lista que contém os livros reservados por clientes.
    private List<Reserva> reservasAtivas;

// Lista que armazenará todos os livros cadastrados no sistema.
    public Relatorio(List<HistoricoEmprestimos> emprestimosCadastrados, List<Emprestimo> emprestimosAtivos, List<Livro> livrosCadastrados, List<Multa> multasCadastradas,
// Lista que armazenará os clientes cadastrados na biblioteca.
                     double valorTotalMultas, List<Cliente> clientesCadastrados, List<Funcionario> funcionariosCadastrados, List<Reserva> reservasAtivas) {

        this.emprestimosCadastrados = emprestimosCadastrados;
        this.emprestimosAtivos = emprestimosAtivos;
        this.livrosCadastrados = livrosCadastrados;
        this.multasCadastradas = multasCadastradas;
        this.valorTotalMultas = valorTotalMultas;
        this.clientesCadastrados = clientesCadastrados;
        this.funcionariosCadastrados = funcionariosCadastrados;
        this.reservasAtivas = reservasAtivas;

    }

// Lista com o histórico de todos os empréstimos já realizados.
    public List<HistoricoEmprestimos> getEmprestimosCadastrados() {
        return emprestimosCadastrados;
    }

// Lista com os empréstimos que ainda não foram finalizados.
    public List<Emprestimo> getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

// Lista que armazenará todos os livros cadastrados no sistema.
    public List<Livro> getLivrosCadastrados() {
        return livrosCadastrados;
    }

// Lista contendo multas aplicadas a clientes por atraso na devolução de livros.
    public List<Multa> getMultasCadastradas() {
        return multasCadastradas;
    }

    public double getValorTotalMultas() {
        return valorTotalMultas;
    }

// Lista que armazenará os clientes cadastrados na biblioteca.
    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }

// Lista para manter os registros dos funcionários da biblioteca.
    public List<Funcionario> getFuncionariosCadastrados() {
        return funcionariosCadastrados;
    }

// Lista que contém os livros reservados por clientes.
    public List<Reserva> getReservasAtivas() {
        return reservasAtivas;
    }

    @Override
    public String toString() {
        return "Empréstimos cadastrados: " + getLivrosCadastrados() + "\n" +
                "Empréstimos Ativos: " + getEmprestimosAtivos() + "\n" +
                "Livros cadastrados: " + getLivrosCadastrados() + "\n" +
                "Multas aplicadas: " + getMultasCadastradas() + "\n" +
                "Valor total em multas: R$" + getValorTotalMultas() + "\n" +
                "Clientes cadastrados: " + getClientesCadastrados() + "\n" +
                "Reservas ativas: " + getReservasAtivas();
    }

}
// === Fim do arquivo Relatorio.java ===