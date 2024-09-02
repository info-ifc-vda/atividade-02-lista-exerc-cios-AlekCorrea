/*Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
um número negativo ou 0*/

import java.util.Scanner;

public class ATT1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linha = 0; // Contador de linhas para controle do cabeçalho
        
        while (true) {
            System.out.print("Digite um número (negativo ou zero para sair): ");
            double valor = scanner.nextDouble();
            
            if (valor <= 0) {
                break; // Encerra o loop se o valor for negativo ou zero
            }

            // Exibe o cabeçalho a cada 20 linhas
            if (linha % 20 == 0) {
                imprimirCabecalho();
            }

            // Calcula o cubo e a raiz quadrada do valor
            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);

            // Exibe os resultados
            System.out.printf("%10.2f | %10.2f | %10.2f%n", valor, cubo, raizQuadrada);
            linha++;
        }
        
        scanner.close();
    }

    // Método para imprimir o cabeçalho da tabela
    private static void imprimirCabecalho() {
        System.out.printf("%10s | %10s | %10s%n", "Valor", "Cubo", "Raiz");
        System.out.println("---------------------------------------------");
    }
}
