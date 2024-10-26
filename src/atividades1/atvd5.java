package atividades1;

import java.util.Random;

//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
//elementos numericos que sejam  ́ımpares.

public class atvd5 {
    public static boolean numImpar(int numero) {
        return numero % 2 != 0;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[100];

        System.out.println("numeros aleatorios:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
            System.out.println(numeros[i]);
        }

        System.out.println("numeros impares encontrados:");
        for (int numero : numeros) {
            if (numImpar(numero)) {
                System.out.println(numero + "");
            }
        }
    }
}
