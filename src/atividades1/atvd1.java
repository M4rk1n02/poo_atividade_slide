package atividades1;

import java.util.Scanner;

//Escreva um algoritmo em Java que solicite 5 notas e realize o calculo da media aritmetica ao t ́ermino
//da execucao.

public class atvd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0; //Double é utilizado pois ele é mais preciso com decimais, mas da pra usar o float também. ao menos foi oq disse a internet
        
        for ( int i = 0; i < 5; i++) {
            System.out.print("digite a nota: "); //só pra deixar bonitinho
            double nota = scanner.nextDouble(); //usa isso pra digitar o numero que voce vai querer calcular
            soma += nota;
        }
        
        double media = soma / 5;
        System.out.println(media);
        
    }

}
