package atividades_slide;

import java.util.Scanner;

public class Questao2 {

	public static void calculoBasal(Scanner scanner) {
		
			System.out.println("Identifique seu gênero:");
	        System.out.println("1. Masculino");
	        System.out.println("2. Feminino");
	        
	        System.out.print("Digite sua opção (1, 2): ");
	        int opcao = scanner.nextInt();
	    
	        System.out.print("Digite Sua Idade : ");
        	int idade = scanner.nextInt();
        	
        	System.out.print("Digite Seu Peso : ");
        	float peso = scanner.nextFloat();
        
        	double mediaBasal = 0;
        	
     if(opcao == 1) {
    	 if (idade < 18) {
    		 System.out.println("Idade invalida");
    	 }else if(idade >= 18 && idade < 30) {
    		mediaBasal = (15.057 * peso) + 679;
    		System.out.println("Sua Media Basal é: " + mediaBasal);
    	 }else if(idade >=30 && idade < 60) {
    		 mediaBasal = (11.6 * peso) + 879;
    		 System.out.println("Sua Media Basal é: " + mediaBasal);
    	 }else if(idade >= 60) {
    		 mediaBasal = (13.5 * peso) + 487;
    		 System.out.println("Sua Media Basal é: " + mediaBasal);
    	 }
     }else if(opcao == 2) {
    	 if (idade < 18) {
    		 System.out.println("Idade invalida");
    	 }else if(idade >= 18 && idade < 30) {
    		mediaBasal = (14.7 * peso) + 486.6; 
    		System.out.println("Sua Media Basal é: " + mediaBasal);
    	 }else if(idade >=30 && idade < 60) {
    		 mediaBasal = (8.7 * peso) + 829;
    		 System.out.println("Sua Media Basal é: " + mediaBasal);
    	 }else if(idade >= 60) {
    		 mediaBasal = (10.5 * peso) + 596;
    		 System.out.println("Sua Media Basal é: " + mediaBasal);
    	 }
     }else if(opcao != 1 && opcao != 2) {
    	 System.out.println("Opção Invalida");
     }
	}
}