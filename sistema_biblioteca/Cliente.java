package sistema_biblioteca;

public class Cliente {

    private String nome;
    private int CPF;
    private String cidade;
    private String telefone;
    private String email;
    private String dataNascimento;
    private boolean clienteNovo;

    public Cliente(String nome, int CPF, String cidade, String telefone,
                   String email, String dataNascimento, boolean clienteNovo) {

        this.nome = nome;
        this.CPF = CPF;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.clienteNovo = clienteNovo;

    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | CPF: " + this.CPF + " | Cidade: " + this.cidade+
                " | Telefone: " + this.telefone + " | Email: " + this.email+
                " | Data de nascimento: " + this.dataNascimento + " | Cliente novo? " + this.clienteNovo;
    }
}
