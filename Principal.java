import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) 
    {
        int opcao = menu();
        java.util.List<colaborador> colaboradores = new java.util.ArrayList<>();

        while (opcao != 0) 
        {
            switch (opcao) 
            {
                case 1 -> CadastraColaborador(colaboradores, 1);
                case 2 -> CadastraColaborador(colaboradores, 2);
                case 3 -> CadastraColaborador(colaboradores, 3);
                case 4 -> gerarFolhaPagamento(colaboradores);
                case 5 -> exibirResumoFolhaPagamento(colaboradores);
                case 6 -> listarColaboradores(colaboradores);
                case 0 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opcao invalida.");
            }
            opcao = menu(); // Solicita a próxima opção
        }   
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Colaborador Padrao");
            System.out.println("2 - Cadastrar Colaborador Comissionado");
            System.out.println("3 - Cadastrar Colaborador Producao");
            System.out.println("4 - Gerar folha de pagamento");
            System.out.println("5 - Exibir resumo da folha de pagamento");
            System.out.println("6 - Lista cadastro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            if (opcao >= 0 && opcao <= 6) 
            {
                break; // Sai do loop se a opção for válida
            }
            else 
            {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }
        return opcao;
    }

    private static void CadastraColaborador(List<colaborador> colaboradores, int opcao) {
        Scanner scanner = new Scanner(System.in);
        int matricula;
        String nome;
        double salarioBase;

        System.out.println("Cadastro de Colaborador:");
        
        while (true) {
            System.out.print("Digite a matricula do colaborador: ");
            matricula = scanner.nextInt();
            if (matricula > 0) {
                break; // Sai do loop se a entrada for um inteiro válido
            } else {
                System.out.println("Entrada invalida. Por favor, digite um numero inteiro positivo para a matricula.");
                scanner.next(); // Limpa a entrada invalida
            }
        }
        while (true) {
            System.out.print("Digite o nome do colaborador: ");
            nome = scanner.nextLine();
            if (!nome.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Nome invalido. Por favor, digite um nome nao vazio.");
            }
        }
        while (true) {
            System.out.print("Digite o salario base do colaborador: ");
            if (scanner.hasNextDouble()) {
                salarioBase = scanner.nextDouble();
                if (salarioBase >= 0) {
                    break; // Sai do loop se a entrada for um numero válido
                } else {
                    System.out.println("Entrada invalida. Por favor, digite um numero nao negativo para o salario base.");
                }
            } else {
                System.out.println("Entrada invalida. Por favor, digite um numero valido para o salario base.");
                scanner.next(); // Limpa a entrada invalida
            }
        }    

        switch (opcao) {
            case 1 -> colaboradores.add(new ColaboradorPadrao(matricula, nome, salarioBase));
            case 2 -> {
                double valorVendas;
                double percentualComissao;

                while(true) {
                    System.out.print("Digite o valor das vendas do colaborador: ");
                    if (scanner.hasNextDouble()) {
                        valorVendas = scanner.nextDouble();
                        if (valorVendas >= 0) {
                            break; // Sai do loop se a entrada for um numero válido
                        } else {
                            System.out.println("Entrada invalida. Por favor, digite um numero nao negativo para o valor das vendas.");
                        }
                    } else {
                        System.out.println("Entrada invalida. Por favor, digite um numero valido para o valor das vendas.");
                        scanner.next(); // Limpa a entrada invalida
                    }
                }
                while(true) {
                    System.out.print("Digite o percentual de comissao do colaborador: ");
                    if (scanner.hasNextDouble()) {
                        percentualComissao = scanner.nextDouble();
                        if (percentualComissao >= 0) {
                            break; // Sai do loop se a entrada for um numero válido
                        } else {
                            System.out.println("Entrada invalida. Por favor, digite um numero nao negativo para o percentual de comissão.");
                        }
                    } else {
                        System.out.println("Entrada invalida. Por favor, digite um numero valido para o percentual de comissão.");
                        scanner.next(); // Limpa a entrada invalida
                    }
                }
                colaboradores.add(new ColaboradorComissionado(matricula, nome, salarioBase, valorVendas, percentualComissao));
            }
            case 3 -> {
                int pecasProduzidas;
                double valorPorPeca;

                while (true) {
                    System.out.print("Digite o numero de pecas produzidas pelo colaborador: ");
                    if (scanner.hasNextInt()) {
                        pecasProduzidas = scanner.nextInt();
                        if (pecasProduzidas >= 0) {
                            break; // Sai do loop se a entrada for um numero válido
                        } else {
                            System.out.println("Entrada invalida. Por favor, digite um numero inteiro nao negativo para a quantidade de pecas produzidas.");
                        }
                    } else {
                        System.out.println("Entrada invalida. Por favor, digite um numero inteiro valido para a quantidade de pecas produzidas.");
                        scanner.next(); // Limpa a entrada invalida
                    }
                }
                while (true) {
                    System.out.print("Digite o valor por peca produzida: ");
                    if (scanner.hasNextDouble()) {
                        valorPorPeca = scanner.nextDouble();
                        if (valorPorPeca >= 0) {
                            break; // Sai do loop se a entrada for um numero válido
                        } else {
                            System.out.println("Entrada invalida. Por favor, digite um numero nao negativo para o valor por peca.");
                        }
                    } else {
                        System.out.println("Entrada invalida. Por favor, digite um numero valido para o valor por peca.");
                        scanner.next(); // Limpa a entrada invalida
                    }
                }
                colaboradores.add(new ColaboradorProducao(matricula, nome, salarioBase, pecasProduzidas, valorPorPeca));
            }
            default -> throw new AssertionError();
        }
    }

    private static void exibirResumoFolhaPagamento(List<colaborador> colaboradores) {
        System.out.println("Resumo da Folha de Pagamento");
        
        double totalSalarios = 0.0;

        for (colaborador c : colaboradores) {
            totalSalarios += c.calcularSalarioFinal();
        }
        System.out.println("Total de salarios: R$ " + totalSalarios);
    }

    private static void gerarFolhaPagamento(List<colaborador> colaboradores) {
        System.out.println("Folha de Pagamento:");
        
        double totalSalarios = 0.0;

        for (colaborador c : colaboradores) {
            System.out.println("Matricula: " + c.getMatricula() + ", Nome: " + c.getNome() + ", Salario Final: R$ " + c.calcularSalarioFinal());
            totalSalarios += c.calcularSalarioFinal();
        }
        System.out.println("------------------------");
        System.out.println("Total de salarios: R$ " + totalSalarios);
    }   

    private static void listarColaboradores(List<colaborador> colaboradores) {
        System.out.println("Lista de Colaboradores:");
        for (colaborador c : colaboradores) {
            c.exibirDados();
            System.out.println("------------------------");
        }
    }
}