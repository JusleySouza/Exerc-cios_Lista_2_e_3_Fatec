// Fa�a um programa que leia um conjunto de n�meros inteiros e imprima 
//todos os m�ltiplos de 3 e 5

package Lista2;

import java.util.Scanner;

public class Exercicio2 {
	Scanner scan = new Scanner(System.in);
	
	int vetor[] = new int[8];
	int numeros;
	
	public void pegarDados() {
		for (int numeros = 0; numeros < 8; numeros++) {
			System.out.println("Informe um valor inteiro: ");
			vetor[numeros] = scan.nextInt();
			}
	}
	
	public void avaliarDados() {

		for(numeros=0; numeros<vetor.length;numeros++) {
			if(vetor[numeros] %3 == 0) {
				System.out.println("\nM�ltiplo de 3 = " + vetor[numeros]);
				
			}
			if(vetor[numeros] %5 == 0) {
				System.out.println("\nM�ltiplo de 5 = " + vetor[numeros]);
				
			}
			else if (vetor[numeros] %3 != 0 && vetor[numeros] %5 != 0) {
				System.out.println("\nN�o � m�ltiplo de 3 nem de 5 = " + vetor[numeros]);
			}
		}
	}
	public static void main(String[]args) {
		Exercicio2 exer = new Exercicio2();
		exer.pegarDados();
		exer.avaliarDados();	
	}
}
