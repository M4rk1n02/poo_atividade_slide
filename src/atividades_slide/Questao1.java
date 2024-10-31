package atividades_slide;

import java.util.Scanner;

public class Questao1 {
	public static void calculoImc(Scanner scanner) {
		
		
	    	System.out.print("Digite seu nome: ");
		    String nome = scanner.nextLine();

		    System.out.print("Digite Seu Peso : ");
	        float peso = scanner.nextFloat();
	        
	        System.out.print("Digite sua Altura: ");
	        float altura = scanner.nextFloat();

	        
	        float imc = peso  / (altura * altura);
	        
	        
	        if(imc >= 40) {
	        	System.out.println(nome + " seu imc é: "+ imc + "! Você tem Obesidade Moebida");
	        }else if (imc < 40 && imc >= 30) {
	        	System.out.println(nome + " seu imc é: "+ imc +  "! Você tem Obesidade tipo 1");
	        }else if (imc < 30 && imc >= 25) {
	        	System.out.println(nome + " seu imc é: "+ imc +  "! Você esta com Sobrepeso");
	        }else if (imc < 25 && imc >= 19) {
	        	System.out.println(nome + " seu imc é: "+ imc + "! Seu Peso esta Normal");
	        }else if ( imc <= 19) {
	        	System.out.println(nome + " seu imc é: "+ imc + "! Você esta Abaixo Peso");
	        }
	}

}
