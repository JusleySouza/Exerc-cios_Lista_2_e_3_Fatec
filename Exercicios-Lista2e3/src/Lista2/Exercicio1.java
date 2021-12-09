// Faça um programa que leia um intervalo de números inteiros, imprima todos
// os pares e o somatório destes números

package Lista2;

import java.util.Scanner;

public class Exercicio1 {
	
	Scanner scan = new Scanner(System.in);
	
	int inicio;
	int fim;
	int pares;
	int totalSoma = 0;
	
	public void receberDados() {
		System.out.println("Informe o inicio do intervalo: ");
		inicio = scan.nextInt();
		System.out.println("Informe o fim do intervalo: ");
		fim = scan.nextInt();	
	}
	
	public void avaliarPares() {
		for(pares = inicio;pares<=fim;pares++) {
			if(pares%2==0) {
				System.out.println("Numero Par: " +pares);
		}
		}	
		}
	
	public void SomarPares() {
		for(pares = inicio;pares<=fim;pares++) {
			if(pares%2==0) {
		totalSoma+=pares;
		}
		}
		System.out.println("\nSoma dos pares = " +totalSoma);
	}
	
	
	public static void main(String[]args) {
		Exercicio1 exer = new Exercicio1();
		exer.receberDados();
		exer.avaliarPares();
		exer.SomarPares();
	}	
}
