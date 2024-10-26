package atividades1;


import java.util.Random; // pra randomizar os numeros;

//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima o maior
//e menor elemento.

public class atvd7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[100];


        System.out.println("numeros aleatorios:");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(100);
            System.out.println(numeros[i]);
        }

        for(int numero : numeros){
            if(numero == numeros[0]){
                System.out.println("primeiro numero do array: " + numero);
            }if(numero == numeros[99]){
                System.out.println("ultimo numero do array: " + numero);
            }
        }
    }
}
