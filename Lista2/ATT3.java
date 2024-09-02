/*Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
calcule e mostre 2 vetores resultantes:
• no primeiro vetor resultante, cada elemento será composto pela soma de cada
número par do primeiro vetor somado a todos os números do segundo vetor;
• o segundo vetor resultante será composto pela quantidade de divisores que cada
número ímpar do primeiro vetor tem no segundo vetor. */

import java.util.ArrayList;

public class ATT3 {
    public static void main(String[] args) {
        // Inicializando os vetores dados
        int[] vetor1 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] vetor2 = {1, 2, 3, 4, 5};

        // Listas para armazenar os vetores resultantes
        ArrayList<Integer> resultado1 = new ArrayList<>();
        ArrayList<Integer> resultado2 = new ArrayList<>();

        // Calculando o primeiro vetor resultante
        for (int num1 : vetor1) {
            if (num1 % 2 == 0) { // Se o número é par
                int soma = 0;
                for (int num2 : vetor2) {
                    soma += num1 + num2; // Soma o número par com cada elemento do vetor2
                }
                resultado1.add(soma);
            }
        }

        // Calculando o segundo vetor resultante
        for (int num1 : vetor1) {
            if (num1 % 2 != 0) { // Se o número é ímpar
                int contagemDivisores = 0;
                for (int num2 : vetor2) {
                    if (num1 % num2 == 0) { // Se num2 é divisor de num1
                        contagemDivisores++;
                    }
                }
                resultado2.add(contagemDivisores);
            }
        }

        // Exibindo os resultados
        System.out.println("Primeiro vetor resultante: " + resultado1);
        System.out.println("Segundo vetor resultante: " + resultado2);
    }
}
