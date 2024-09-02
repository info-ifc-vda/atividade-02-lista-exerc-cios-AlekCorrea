/*Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATT2 {

    public static void main(String[] args) {
        // Definindo os dois vetores de 10 números inteiros
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {5, 6, 7, 8, 11, 12, 13, 14, 15, 16};

        // Criando uma lista para armazenar os números não comuns
        List<Integer> naoComuns = new ArrayList<>();

        // Adicionando os números de vetor1 que não estão em vetor2
        for (int num : vetor1) {
            if (!Arrays.stream(vetor2).anyMatch(x -> x == num)) {
                naoComuns.add(num);
            }
        }

        // Adicionando os números de vetor2 que não estão em vetor1
        for (int num : vetor2) {
            if (!Arrays.stream(vetor1).anyMatch(x -> x == num)) {
                naoComuns.add(num);
            }
        }

        // Convertendo a lista de números não comuns em um vetor
        int[] vetorNaoComuns = naoComuns.stream().mapToInt(Integer::intValue).toArray();

        // Imprimindo o vetor dos números não comuns
        System.out.println("Números não comuns: " + Arrays.toString(vetorNaoComuns));
    }
}
