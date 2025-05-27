package sistema_biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int ISBN;
    private int anoPublicacao;
    private int qtdEstoque;
    private String categoria;
    private String status;

    public Livro(String titulo, String autor, int ISBN, int anoPublicacao,
                 int qtdEstoque, String categoria, String status) {

        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.anoPublicacao = anoPublicacao;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
        this.status = status;

    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return " | Título: " + this.titulo + " | Autor: " + this.autor + " | ISBN: " + this.ISBN+
                " | Ano de Publicação: " + this.anoPublicacao + " | Quantidade no estoque: " + this.qtdEstoque+
                " | Categoria: " + this.categoria + " | Status: " + this.status;
    }
}
