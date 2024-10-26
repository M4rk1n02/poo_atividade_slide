package atividades2;

import java.util.Scanner;

//Faça um algoritmo em Java para ler, usando o teclado, um numero do tipo inteiro, um do tipo long
//e outro do tipo float. Realize a leitura dos numeros obdecendo a ordem descrita e exiba-os no con-
//sole utilizando o printf (System.out.printf()) na mesma ordem. Formato da saıda (”O numero inteiro
//digitado foi NUMERO INTEIRO, o numero long digitado foi NUMERO LONG e o numero float foi
//NUMERO FLOAT.”)


public class atvd1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("digite um numero inteiro: ");
		int numInt = scanner.nextInt();		
		System.out.print("digite um numero long: ");
		long numLong = scanner.nextLong();
		System.out.print("digite um numero float: ");
		float numFloat = scanner.nextFloat();
		
		System.out.printf("O numero inteiro digitado foi "+ numInt +", o numero long digitado foi "+ numLong+" e o numero float foi "+ numFloat);
	}
}
