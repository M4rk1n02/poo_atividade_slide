package atividades_slide;

import java.util.Scanner; 

public class Questao3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int escolha;
		
		
		do {
			System.out.println("Escolha Sua Consulta:");
			System.out.println("1. IMC");
			System.out.println("2. Metablolismo Basal");
			System.out.println("3. Impapar");
			System.out.println("0. Sair");
			System.out.println("Opção: ");
			escolha = scanner.nextInt();
			scanner.nextLine();
			
			switch (escolha) {
			case 1:
				Questao1.calculoImc(scanner);
				break;
			case 2:
				Questao2.calculoBasal(scanner);
				break;
			case 3:
				Questao4.impaPar(scanner);
				break;
			case 0:
				System.out.println("Bye");
				break;
			default:
				System.out.println("Opção inexistente, tente novamente.");				
			  }
        } while (escolha != 0);

        scanner.close();
    }
}