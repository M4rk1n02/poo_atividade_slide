package atividades1;

import java.util.Random;

//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e realize o calculo
//da media aritmetica.

public class atvd8 {
    public static void main(String[] args) {
        Random random = new Random();
        

        int[] numeros = new int[100];

        System.out.println("numeros aleatorios:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = random.nextInt(100);
            System.out.println(numeros[i]);
        }

        double soma = 0;

        for ( int i = 0; i < numeros[i]; i++) {
//            System.out.println(numeros[i]); so pra ver se ta imprimindo os mesmos numeros de cima
            double nota = numeros[i];
            soma += nota;
        }

        System.out.println("media dos numeros acima: ");
        double media = soma / 5;
        System.out.println(media);
    }
}
