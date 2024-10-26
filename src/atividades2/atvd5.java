package atividades2;

import java.util.Scanner;

//Elabore um algoritmo em Java para identificar se um numero  ́e par ou ́ımpar.

public class atvd5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("digite um numero: ");
	        int num = scanner.nextInt();
	        	        
	        if(num % 2 == 0) {
	        	System.out.print("o numero " + num +" é par" );
	        }else if(num % 2 !=  0) {
	        	System.out.print("o numero "+ num +" é impar");
	        }
	        
	    }
}
