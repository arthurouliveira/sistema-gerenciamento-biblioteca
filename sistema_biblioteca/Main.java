package sistema_biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolhaUser;

        List<Livro> livrosCadastrados = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Emprestimo> historicoEmprestimos = new ArrayList<>();

        do {
            System.out.println("==== Sistema de Biblioteca ====");
            System.out.println("1- Cadastrar Livro");
            System.out.println("2- Cadastrar Cliente");
            System.out.println("3- Cadastrar Funcionário");
            System.out.println("4- Realizar Empréstimo");
            System.out.println("5- Devolução de Livro");
            System.out.println("6- Gerenciar Reservas");
            System.out.println("7- Aplicar Multa");
            System.out.println("8- Realizar Pagamento");
            System.out.println("9- Relatórios");
            System.out.println("10- Sair");

            System.out.print("Escolha uma opção: ");
            escolhaUser = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaUser) {

                case 1:
                    System.out.printf("Título do livro: ");
                    String tituloLivro = scanner.nextLine();

                    System.out.printf("Nome do autor: ");
                    String autorLivro = scanner.nextLine();

                    System.out.printf("ISNB: ");
                    int isnbLivro = scanner.nextInt();

                    System.out.printf("Ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();

                    System.out.printf("Quantidade no estoque: ");
                    int qtdEstoque = scanner.nextInt();
                    scanner.nextLine();

                    System.out.printf("Categoria: ");
                    String categoriaLivro = scanner.nextLine();

                    System.out.printf("Status: ");
                    String statusLivro = scanner.nextLine();

                    Livro livroCadastrado = new Livro(tituloLivro, autorLivro, isnbLivro, anoPublicacao,
                            qtdEstoque, categoriaLivro, statusLivro);

                    livrosCadastrados.add(livroCadastrado);

                    System.out.println("---LIVRO CADASTRADO---");
                    System.out.println(livrosCadastrados);
                    break;

                case 2:
                    System.out.printf("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.printf("CPF: ");
                    int cpfCliente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.printf("Cidade: ");
                    String cidadeCliente = scanner.nextLine();

                    System.out.printf("Telefone: ");
                    String telefoneCliente = scanner.nextLine();

                    System.out.printf("Email: ");
                    String emailCliente = scanner.nextLine();

                    System.out.printf("Data de nascimento: ");
                    String nascimentoCliente = scanner.nextLine();

                    System.out.printf("É cliente novo? (s/n) ");
                    String isNew = scanner.nextLine();
                    boolean clienteNovo;

                    if (isNew.equalsIgnoreCase("s")){
                        clienteNovo = true;
                    } else {
                        clienteNovo = false;
                    }

                    Cliente dadosCliente = new Cliente(nomeCliente, cpfCliente, cidadeCliente,
                            telefoneCliente, emailCliente, nascimentoCliente, clienteNovo);

                    clientes.add(dadosCliente);

                    System.out.println("---CLIENTE CADASTRADO---");
                    System.out.println(clientes);
                    break;

                case 3:
                    System.out.printf("Nome do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();

                    System.out.printf("CPF: ");
                    int cpfFuncionario = scanner.nextInt();
                    scanner.nextLine();

                    System.out.printf("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.printf("Email: ");
                    String emailFuncionario = scanner.nextLine();

                    System.out.printf("Telefone: ");
                    String telefoneFuncionario = scanner.nextLine();

                    System.out.printf("Data de contratação: ");
                    String dataContratacao = scanner.nextLine();

                    System.out.printf("Turno de trabalho: ");
                    String turnoTrabalho = scanner.nextLine();

                    Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cpfFuncionario, cargo, emailFuncionario,
                            telefoneFuncionario, dataContratacao, turnoTrabalho);

                    funcionarios.add(novoFuncionario);

                    System.out.println("---FUNCIONÁRIO CADASTRADO---");
                    System.out.println(funcionarios);
                    break;

                case 4:
                    System.out.println("--REALIZAR EMPRÉSTIMO--");

                    if (clientes.isEmpty()) {
                        System.out.println("Ainda não há nenhum cliente cadastrado. Cadastre um para realizar o empréstimo!");
                        continue;
                    } else if (livrosCadastrados.isEmpty()) {
                        System.out.println("Ainda não há nenhum livro cadastrado. Cadastre um para realizar o empréstimo!");
                        continue;
                    } else if (funcionarios.isEmpty()) {
                        System.out.println("Ainda não há nenhum funcionário cadastrado. Cadastre um para realizar o empréstimo!");
                    }

                    else {
                        exibirLivros(livrosCadastrados);
                        System.out.print("Digite o ID do livro: ");
                        int idLivro = scanner.nextInt();
                        scanner.nextLine();
                        Livro livroEmprestimo = livrosCadastrados.get(idLivro - 1);
                        int disponibilidadeLivro = livroEmprestimo.getQtdEstoque();

                        if (disponibilidadeLivro == 0) {
                            System.out.println("Livro indisponível. Tente novamente!");
                            continue;
                        } else {
                            livroEmprestimo.setQtdEstoque(livroEmprestimo.getQtdEstoque()-1);

                            exibirClientes(clientes);
                            System.out.printf("Qual cliente deseja conceder o empréstimo? ID: ");
                            int idCliente = scanner.nextInt();
                            scanner.nextLine();
                            Cliente clienteEmprestimo = clientes.get(idCliente - 1);

                            exibirFuncionarios(funcionarios);
                            System.out.print("Digite o ID do funcionário responsável: ");
                            int idFuncionario = scanner.nextInt();
                            scanner.nextLine();
                            Funcionario funcionarioEmprestimo = funcionarios.get(idFuncionario - 1);

                            System.out.printf("Data do empréstimo (dd/mm/aa): ");
                            String dataEmprestimo = scanner.nextLine();

                            System.out.printf("Data da devolução (dd/mm/aa): ");
                            String dataDevolucao = scanner.nextLine();

                            System.out.printf("Status do empréstimo: ");
                            String statusEmprestimo = scanner.nextLine();

                            double multa = 0.0;

                            Emprestimo novoEmprestimo = new Emprestimo(clienteEmprestimo, livroEmprestimo, dataEmprestimo,
                                    dataDevolucao, statusEmprestimo, multa, funcionarioEmprestimo);

                            historicoEmprestimos.add(novoEmprestimo);

                            System.out.println("--EMPRÉSTIMO REALIZADO--");
                            System.out.println(historicoEmprestimos);
                        }
                    }

                    break;

                case 5:

            }

        } while (escolhaUser != 10);
    }

    public static void exibirClientes(List<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("ID: " + (i+1) + clientes.get(i));
        }
    }

    public static void exibirFuncionarios(List<Funcionario> funcionarios) {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("ID: " + (i+1) + funcionarios.get(i));
        }
    }

    public static void exibirLivros(List<Livro> livros) {
        for (int i = 0; i < livros.size(); i++) {
            System.out.println("ID: " + (i+1) + livros.get(i));
        }
    }

}
