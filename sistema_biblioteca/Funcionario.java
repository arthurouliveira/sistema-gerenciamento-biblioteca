package sistema_biblioteca;

public class Funcionario {

    private String nome;
    private int CPF;
    private String cargo;
    private String email;
    private int telefone;
    private String dataContratacao;
    private String turnoTrabalho;

    public Funcionario(String nome, int CPF, String cargo, String email,
                       int telefone, String dataContratacao, String turnoTrabalho) {

        this.nome = nome;
        this.CPF = CPF;
        this.cargo = cargo;
        this.email = email;
        this.telefone = telefone;
        this.dataContratacao = dataContratacao;
        this.turnoTrabalho = turnoTrabalho;

    }
}
