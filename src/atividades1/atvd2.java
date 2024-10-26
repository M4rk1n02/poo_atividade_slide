package atividades1;


//Dada a entrada de 10 inteiros em sequencia, realize a impressao da entrada inicial de forma inversa.

public class atvd2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1; 
        }
        
        System.out.println("numeros em ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}
