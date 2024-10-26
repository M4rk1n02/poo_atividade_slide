package atividades2;

import java.util.Scanner;


//Crie um algoritmo em Java para realizar o c ́alculo de IMC. A sa ́ıda do algoritmo deve ser o valor do
//IMC no console (e.g. ”O valor do seu IMC  ́e ”).

public class atvd2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
                
        System.out.print("seu imc : " + imc);
    }
}

