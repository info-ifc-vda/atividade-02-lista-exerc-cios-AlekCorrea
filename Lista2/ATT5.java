/*Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um que contenham, respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados */

import java.util.Random;

public class ATT5 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int[] maioresDasLinhas = new int[7];
        int[] menoresDasColunas = new int[7];

        // Preenchendo a matriz com números aleatórios e inicializando os vetores
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            maioresDasLinhas[i] = Integer.MIN_VALUE; // Inicializa com o menor valor possível
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = random.nextInt(100); // Preenche com números aleatórios de 0 a 99
                if (j == 0) {
                    menoresDasColunas[j] = Integer.MAX_VALUE; // Inicializa com o maior valor possível
                }
            }
        }

        // Encontrando o maior de cada linha e o menor de cada coluna
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j] > maioresDasLinhas[i]) {
                    maioresDasLinhas[i] = matriz[i][j]; // Maior da linha
                }
                if (matriz[i][j] < menoresDasColunas[j]) {
                    menoresDasColunas[j] = matriz[i][j]; // Menor da coluna
                }
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimindo os maiores elementos de cada linha
        System.out.println("\nMaior elemento de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.print(maioresDasLinhas[i] + " ");
        }

        // Imprimindo os menores elementos de cada coluna
        System.out.println("\n\nMenor elemento de cada coluna:");
        for (int j = 0; j < 7; j++) {
            System.out.print(menoresDasColunas[j] + " ");
        }
    }
}
