//Fa�a um programa que leia 20 n�meros inteiros, armazene-os em um vetor, 
//imprima-os e informe quantos s�o pares e �mpares

package Lista2;

import java.util.Scanner;

public class Exercicio15 {
	Scanner scan = new Scanner(System.in);
	int valores[] = new int[20];
	int contador;
	int impares = 0;
	int pares = 0;
	
public void receberValores() {
	for (contador=0; contador<20;contador++) {
		System.out.println("Informe o " +(contador+1)+ "� numero: ");
		valores[contador] = scan.nextInt();
	}
}

public void imprimirValores() {
	for (int contador=0; contador<20;contador++) {
		System.out.println("Posi��o "+contador+ " = " +valores[contador]);
	}
}

public void analisaValores() {
	for(int contador = 0; contador<20; contador++) {
		if(valores[contador] %2 != 0) {
			impares++;
		}
		else {
			pares++;
		}
	}
	
}

public void mostrarResultados() {
	System.out.println("\nTotal de Impares:  "+impares+ " n�meros.");
	System.out.println("Total de Pares:  "+pares+ " n�meros");
}

public static void main(String[] args) {
	Exercicio15 exer = new Exercicio15();
	exer.receberValores();
	exer.imprimirValores();
	exer.analisaValores();
	exer.mostrarResultados();
}
}
