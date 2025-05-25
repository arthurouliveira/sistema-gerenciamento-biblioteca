package sistema_biblioteca;

import java.util.List;

public class Relatorio {

    private String data;
    private int totalLivrosEmprestados;
    private List<Livro> livrosMaisPopulares;
    private double valorTotalMultas;
    private int numeroClientes;
    private String resumoPorCategoria;
    private String resumoStatusReservas;

    public Relatorio(String data, int totalLivrosEmprestados, List<Livro> livrosMaisPopulares,
                     double valorTotalMultas, int numeroClientes, String resumoPorCategoria,
                     String resumoStatusReservas) {

        this.data = data;
        this.totalLivrosEmprestados = totalLivrosEmprestados;
        this.livrosMaisPopulares = livrosMaisPopulares;
        this.valorTotalMultas = valorTotalMultas;
        this.numeroClientes = numeroClientes;
        this.resumoPorCategoria = resumoPorCategoria;
        this.resumoStatusReservas = resumoStatusReservas;

    }
}
