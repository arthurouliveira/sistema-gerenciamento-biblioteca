package sistema_biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int ISNB;
    private int anoPublicacao;
    private int qtdEstoque;
    private String categoria;
    private String status;

    public Livro(String titulo, String autor, int ISNB, int anoPublicacao,
                 int qtdEstoque, String categoria, String status) {

        this.titulo = titulo;
        this.autor = autor;
        this.ISNB = ISNB;
        this.anoPublicacao = anoPublicacao;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
        this.status = status;

    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + " | Autor: " + this.autor + " | ISNB: " + this.ISNB+
                " | Ano de Publicação: " + this.anoPublicacao + " | Quantidade no estoque: " + this.qtdEstoque+
                " | Categoria: " + this.categoria + " | Status: " + this.status;
    }
}
