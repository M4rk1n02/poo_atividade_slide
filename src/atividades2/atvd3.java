package atividades2;

import java.util.Scanner;

//Escreva um algoritmo em Java para realizar o calculo de  ́area de um trapezio retangulo. Todas as
//entradas do usuario devem estar em cm. A saıda do algoritmo deve ser a area do trapezio em cm2 no
//console (e.g. ”A  ́area do trapezio em cm2  ́e ”).


public class atvd3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a maior base do trapezio: ");
        float bMaior = scanner.nextFloat();

        System.out.print("digite a menor base do trapezio: ");
        float bMenor = scanner.nextFloat();

        System.out.print("digite a altura do trapezio: ");
        float altura = scanner.nextFloat();

        float area = (bMaior + bMenor) + altura / 2;

        System.out.println("a area do trapezio em cm2 é: " + area);

    }
}
