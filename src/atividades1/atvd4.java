package atividades1;

import java.util.Random;

//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
//elementos numericos que sejam primos.

public class atvd4 {

        public static boolean numPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numeros = new int[100];
        
        System.out.println("numeros aleatorios:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); 
            System.out.println(numeros[i]);
        }
        
        System.out.println("numeros primos encontrados:");
        for (int numero : numeros) {
            if (numPrimo(numero)) { 
                System.out.println(numero);
            }
        }
    }
}
