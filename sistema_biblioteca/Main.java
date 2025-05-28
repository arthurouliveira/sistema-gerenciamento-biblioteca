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
        List<Emprestimo> emprestimosAtivos = new ArrayList<>();
        List<HistoricoEmprestimos> historicoEmprestimos = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        List<Multa> multasAplicadas = new ArrayList<>();

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

                    System.out.printf("ISBN: ");
                    int isbnLivro = scanner.nextInt();

                    System.out.printf("Ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();

                    System.out.printf("Quantidade no estoque: ");
                    int qtdEstoque = scanner.nextInt();
                    scanner.nextLine();

                    System.out.printf("Categoria: ");
                    String categoriaLivro = scanner.nextLine();

                    System.out.printf("Status: ");
                    String statusLivro = scanner.nextLine();

                    Livro livroCadastrado = new Livro(tituloLivro, autorLivro, isbnLivro, anoPublicacao,
                            qtdEstoque, categoriaLivro, statusLivro);

                    livrosCadastrados.add(livroCadastrado);

                    System.out.println("---LIVRO CADASTRADO---");
                    System.out.println(livrosCadastrados);
                    break;

                case 2:
                    System.out.printf("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.printf("CPF: ");
                    String cpfCliente = scanner.nextLine();

                    System.out.printf("Cidade: ");
                    String cidadeCliente = scanner.nextLine();

                    System.out.printf("Telefone: ");
                    String telefoneCliente = scanner.nextLine();

                    System.out.printf("Email: ");
                    String emailCliente = scanner.nextLine();

                    System.out.printf("Data de nascimento (dd/mm/aa): ");
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
                    String cpfFuncionario = scanner.nextLine();

                    System.out.printf("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.printf("Email: ");
                    String emailFuncionario = scanner.nextLine();

                    System.out.printf("Telefone: ");
                    String telefoneFuncionario = scanner.nextLine();

                    System.out.printf("Data de contratação (dd/mm/aa): ");
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
                        continue;
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

                            System.out.printf("Ativar o empréstimo (s/n)? ");
                            String statusEmprestimo = scanner.nextLine();

                            double multa = 0.0;

                            if (statusEmprestimo.equalsIgnoreCase("s")) {
                                Emprestimo novoEmprestimo = new Emprestimo(clienteEmprestimo, livroEmprestimo, dataEmprestimo,
                                        dataDevolucao, statusEmprestimo, multa, funcionarioEmprestimo);
                                emprestimosAtivos.add(novoEmprestimo);
                            }

                            HistoricoEmprestimos emprestimo = new HistoricoEmprestimos(clienteEmprestimo, livroEmprestimo, dataEmprestimo,
                                    dataDevolucao, statusEmprestimo, multa, funcionarioEmprestimo);

                            historicoEmprestimos.add(emprestimo);

                            System.out.println("--EMPRÉSTIMO REALIZADO--");
                            System.out.println(historicoEmprestimos);
                        }
                    }

                    break;

                case 5:
                    System.out.println("--DEVOLUÇÃO DE LIVRO--");

                    if (historicoEmprestimos.size() == 0) {
                        System.out.println("Não nenhum livro emprestado!");
                    } else {
                        exibirLivrosEmprestados(historicoEmprestimos);
                        System.out.printf("Digite o ID do livro que deseja devolver: ");
                        int idEmprestado = scanner.nextInt();
                        scanner.nextLine();

                        historicoEmprestimos.remove(idEmprestado - 1);
                        Livro livroDevolucao = livrosCadastrados.get(idEmprestado - 1);
                        int estoque = livroDevolucao.getQtdEstoque();
                        livroDevolucao.setQtdEstoque(estoque + 1);

                        System.out.println("--DEVOLUÇÃO CONCEDIDA!--");
                    }

                    break;

                case 6:
                    System.out.println("--GERENCIAR RESERVAS--");

                    if (clientes.isEmpty()) {
                        System.out.println("Ainda não há nenhum cliente cadastrado. Cadastre um para realizar o empréstimo!");
                        continue;
                    } else if (livrosCadastrados.isEmpty()) {
                        System.out.println("Ainda não há nenhum livro cadastrado. Cadastre um para realizar o empréstimo!");
                        continue;
                    } else if (funcionarios.isEmpty()) {
                        System.out.println("Ainda não há nenhum funcionário cadastrado. Cadastre um para realizar o empréstimo!");
                        continue;
                    }

                    else {
                        System.out.println("---------------------------");
                        System.out.println("O que deseja fazer?");
                        System.out.println("1- Criar reserva");
                        System.out.println("2- Cancelar reserva");
                        System.out.println("3- Ver reservas ativas");
                        System.out.printf("Sua escolha: ");
                        int escolha = scanner.nextInt();

                        if (escolha == 1) {
                            exibirClientes(clientes);
                            System.out.printf("Digite o ID do Cliente: ");
                            int idCliente = scanner.nextInt();
                            Cliente clienteReserva = clientes.get(idCliente - 1);

                            exibirLivros(livrosCadastrados);
                            System.out.printf("Digite o ID do Livro: ");
                            int idLivro = scanner.nextInt();
                            Livro livroReserva = livrosCadastrados.get(idLivro - 1);
                            scanner.nextLine();

                            System.out.printf("Data da reserva (dd/mm/aa): ");
                            String dataReserva = scanner.nextLine();

                            System.out.printf("Status da reserva: ");
                            String statusReserva = scanner.nextLine();

                            System.out.printf("Data de expiração (dd/mm/aa): ");
                            String dataExpiracao = scanner.nextLine();

                            System.out.printf("Número de dias para a retirada: ");
                            int numeroDiasRetirada = scanner.nextInt();
                            scanner.nextLine();

                            System.out.printf("Data da solicitação (dd/mm/aa): ");
                            String dataSolicitacao = scanner.nextLine();

                            Reserva novaReserva = new Reserva(clienteReserva, livroReserva, dataReserva, statusReserva,
                                    dataExpiracao, numeroDiasRetirada, dataSolicitacao);

                            reservas.add(novaReserva);
                            System.out.println("--RESERVA CRIADA!--");
                            System.out.println(novaReserva);

                        } else if (escolha == 2) {
                            if (reservas.isEmpty()) {
                                System.out.println("Não há nenhuma reserva cadastrada. Tente novamente!");
                            } else {
                                exibirReservas(reservas);
                                System.out.printf("Selecione o ID da reserva que deseja cancelar: ");
                                int idReserva = scanner.nextInt();
                                scanner.nextLine();
                                reservas.remove(idReserva - 1);
                                System.out.println("--RESERVA CANCELADA!--");
                            }

                        } else if (escolha == 3) {
                            if (reservas.isEmpty()) {
                                System.out.println("Não há nenhuma reserva cadastrada. Tente novamente!");
                            } else {
                                System.out.println("--RESERVAS ATIVAS--");
                                exibirReservas(reservas);
                            }
                        }

                    }

                    break;

                case 7:
                    System.out.println("--APLICAR MULTA--");

                    if (clientes.isEmpty()) {
                        System.out.println("Ainda não há nenhum cliente cadastrado. Cadastre um para aplicar a multa!");
                        continue;
                    } else if (livrosCadastrados.isEmpty()) {
                        System.out.println("Ainda não há nenhum livro cadastrado. Cadastre um para aplicar a multa!");
                        continue;
                    } else if (funcionarios.isEmpty()) {
                        System.out.println("Ainda não há nenhum funcionário cadastrado. Cadastre um para aplicar a multa!");
                        continue;
                    } else if (historicoEmprestimos.isEmpty()) {
                        System.out.println("Ainda não há nenhum empréstimo cadastrado. Cadastre um para aplicar a multa!");
                        continue;
                    }

                    else {
                        exibirLivrosEmprestados(historicoEmprestimos);
                        System.out.printf("ID do Empréstimo: ");
                        int idEmprestimo = scanner.nextInt();
                        scanner.nextLine();
                        HistoricoEmprestimos multaEmprestimo = historicoEmprestimos.get(idEmprestimo - 1);

                        System.out.printf("Motivo da multa: ");
                        String motivoMulta = scanner.nextLine();

                        System.out.printf("Data de aplicação da multa (dd/mm/aa): ");
                        String dataAplicacao = scanner.nextLine();

                        exibirFuncionarios(funcionarios);
                        System.out.printf("ID do Funcionário que está aplicando a multa: ");
                        int idFuncionario = scanner.nextInt();
                        Funcionario funcionarioAplicando = funcionarios.get(idFuncionario - 1);

                        System.out.printf("Dias de atraso na devolução: ");
                        int diasAtraso = scanner.nextInt();
                        scanner.nextLine();

                        System.out.printf("Forma de pagamento: ");
                        String formaPagamento = scanner.nextLine();

                        Multa multa = new Multa(multaEmprestimo, motivoMulta, dataAplicacao, funcionarioAplicando, diasAtraso, formaPagamento, 10);
                        multasAplicadas.add(multa);
                        System.out.println("--MULTA APLICADA!--");
                        System.out.println(multa);
                    }

                    break;

                case 8:
                    System.out.println("--REALIZAR PAGAMENTO--");

                    if (multasAplicadas.isEmpty()) {
                        System.out.println("Não há nenhuma multa cadastrada.");
                    } else {
                        exibirMultas(multasAplicadas);
                        System.out.printf("ID da multa para pagamento: ");
                        int idMulta = scanner.nextInt();
                        scanner.nextLine();
                        Multa multaPagamento = multasAplicadas.get(idMulta - 1);

                        System.out.println("Valor: R$" + multaPagamento.getValor());
                        double valorMulta = multaPagamento.getValor();

                        System.out.printf("Forma de pagamento: ");
                        String formaPagamento = scanner.nextLine();

                        System.out.printf("Status do pagamento: ");
                        String statusPagamento = scanner.nextLine();

                        System.out.printf("Data do pagamento (dd/mm/aa): ");
                        String dataPagamento = scanner.nextLine();

                        System.out.println("Motivo da multa: " + multaPagamento.getMotivo());
                        System.out.println("Valor total: R$" + multaPagamento.getValor());
                        String motivoMulta = scanner.nextLine();

                        Pagamento pagamento = new Pagamento(multaPagamento, valorMulta, formaPagamento, statusPagamento, dataPagamento,
                                motivoMulta, valorMulta);

                        System.out.println("--PAGAMENTO FEITO!--");
                        System.out.println(pagamento);
                    }

                    break;

                case 9:
                    System.out.println("--RELATÓRIOS--");
                    System.out.println("1- Ver clientes cadastrados");
                    System.out.println("2- Ver livros emprestados");
                    System.out.println("3- Ver funcionários cadastrados");
                    System.out.println("4- Ver multas cadastradas");

                    System.out.printf("Sua escolha: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha) {
                        case 1:
                            if (clientes.isEmpty()) {
                                System.out.println("Ainda não há nenhum cliente cadastrado");
                            } else {
                                System.out.println("--CLIENTE(s) CADASTRADO(s)--");
                                exibirClientes(clientes);
                            }
                            break;
                        case 2:
                            if (livrosCadastrados.isEmpty()) {
                                System.out.println("Ainda não há nenhum livro cadastrado");
                            } else {
                                System.out.println("--LIVRO(s) CADASTRADO(s)--");
                                exibirLivros(livrosCadastrados);
                            }
                            break;
                        case 3:
                            if (funcionarios.isEmpty()) {
                                System.out.println("Ainda não há nenhum funcionário cadastrado");
                            } else {
                                System.out.println("--FUNCIONÁRIO(s) CADASTRADO(s)--");
                                exibirFuncionarios(funcionarios);
                            }
                            break;
                        case 4:
                            if (multasAplicadas.isEmpty()) {
                                System.out.println("Ainda não há nenhuma multa cadastrada");
                            } else {
                                System.out.println("--MULTA(s) CADASTRADA(s)--");
                                exibirMultas(multasAplicadas);
                            }
                            break;
                        default:
                            System.out.println("--OPCÃO INVÁLIDA--");
                            continue;
                    }

                    break;

                case 10:
                    System.out.println("--FIM DO PROGRAMA--");
                    break;

                default:
                    System.out.println("--SELECIONE UMA OPÇÃO VÁLIDA!--");
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

    public static void exibirLivrosEmprestados(List<HistoricoEmprestimos> livrosEmprestados) {
        for (int i = 0; i < livrosEmprestados.size(); i++) {
            System.out.println("ID: " + (i+1) + livrosEmprestados.get(i));
        }
    }

    public static void exibirReservas(List<Reserva> reservas) {
        for (int i = 0; i < reservas.size(); i++) {
            System.out.println("ID: " + (i+1) + reservas.get(i));
        }
    }

    public static void exibirMultas(List<Multa> multas) {
        for (int i = 0; i < multas.size(); i++) {
            System.out.println("ID: " + (i+1) + multas.get(i));
        }
    }

}

