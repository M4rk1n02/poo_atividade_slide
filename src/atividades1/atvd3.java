package atividades1;


import java.util.Random;


//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
//elementos. Alem disso, deve-se realizar a impressao inversa tambem.

public class atvd3 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numeros = new int[100];
        
        System.out.println("numeros aleatorios:");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(100);
            System.out.println(numeros[i]);
        }

        System.out.println("numeros aleatorios em ordem inversa:");
        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.println(numeros[i]); 
        }
    }

}
