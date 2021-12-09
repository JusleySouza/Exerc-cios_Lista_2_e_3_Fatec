//Faça um programa que leia 30 números inteiros e imprima quantos são ímpares.

package Lista2;

import java.util.Scanner;

public class Exercicio3 {
	
	Scanner scan = new Scanner(System.in);
	
	int vetor[] = new int [30];
	int contador;
	int impares=0;
	
public void pegarNumeros() {
	for(int contador = 0; contador<30; contador++) {
		
		System.out.println( +(contador+1)+ "° Número:");
		vetor[contador] = scan.nextInt();
}
}	

public void analisarNumeros() {
	for(int contador = 0; contador<30; contador++) {
		if(vetor[contador] %2 != 0) {
			impares++;
		}
	}
	System.out.println("\nTotal de Impares:  "+impares);
}
	
public static void main(String[]args){
	Exercicio3 exer = new Exercicio3();
	exer.pegarNumeros();
	exer.analisarNumeros();	
	}
}
