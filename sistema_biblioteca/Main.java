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

            }

        } while (escolhaUser != 10);
    }
}
