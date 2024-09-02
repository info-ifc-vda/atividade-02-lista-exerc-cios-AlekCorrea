/*. Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:
• Efetuar depósito
• Efetuar saque
• Consultar o ativo bancário (soma de todos os saldos)
• Finalizar programa
Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
para o saque */

import java.util.Scanner;

public class ATT4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração dos vetores
        int[] codigos = new int[10];
        double[] saldos = new double[10];

        // Leitura dos códigos e saldos
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            codigos[i] = scanner.nextInt();

            System.out.print("Digite o saldo da conta " + codigos[i] + ": ");
            saldos[i] = scanner.nextDouble();
        }

        int opcao;
        do {
            // Exibição do menu
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancário");
            System.out.println("4. Finalizar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Depósito
                    System.out.print("Digite o código da conta para depósito: ");
                    int codigoDeposito = scanner.nextInt();
                    int indexDeposito = buscarConta(codigos, codigoDeposito);
                    if (indexDeposito != -1) {
                        System.out.print("Digite o valor do depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        saldos[indexDeposito] += valorDeposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 2: // Saque
                    System.out.print("Digite o código da conta para saque: ");
                    int codigoSaque = scanner.nextInt();
                    int indexSaque = buscarConta(codigos, codigoSaque);
                    if (indexSaque != -1) {
                        System.out.print("Digite o valor do saque: ");
                        double valorSaque = scanner.nextDouble();
                        if (saldos[indexSaque] >= valorSaque) {
                            saldos[indexSaque] -= valorSaque;
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3: // Consultar ativo bancário
                    double ativoBancario = 0;
                    for (double saldo : saldos) {
                        ativoBancario += saldo;
                    }
                    System.out.println("Ativo bancário total: " + ativoBancario);
                    break;

                case 4: // Finalizar
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }

    // Função para buscar a conta pelo código
    public static int buscarConta(int[] codigos, int codigo) {
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                return i;
            }
        }
        return -1; // Retorna -1 se a conta não for encontrada
    }
}

