package atividades2;

import java.util.Scanner;


//Construa um algoritmo que faca a leitura de dois numeros inteiros e imprima no console qual numero
//́e o maior, se o primeiro ou o segundo.

public class atvd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];

        System.out.println("digite dois numeros: ");
        int pNum = scanner.nextInt();
        int sNum = scanner.nextInt();


        System.out.println("o maior numero e: ");
        if ( pNum > sNum ){
            System.out.print(pNum);
        }else{
            System.out.print(sNum);
        }

    }
}
