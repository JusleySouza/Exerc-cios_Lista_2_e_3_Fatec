//Fa�a um programa que solicite ao usu�rio 10 n�meros reais, armazene-os em um 
//vetor, imprima a soma de todos eles e a m�dia aritm�tica

package Lista2;

import java.util.Scanner;

public class Exercicio12 {
	
	Scanner scan = new Scanner(System.in);
	double vetor[] = new double[10];
	double soma = 0;
	double media;
	
public void receberDados() {
	for (int contador = 0; contador < 10; contador++) {
		System.out.println("Informe o " +(contador+1)+ "� N�mero:");
		vetor[contador] = scan.nextDouble();
	}
}

public void somarDados() {
	for (int contador = 0; contador < vetor.length ; contador++) {
		soma +=vetor[contador];
	}
	System.out.println("\nSoma de todos os n�meros: "+soma);	
}

public void calcularMedia() {
	media= soma / vetor.length;
	System.out.println("M�dia aritm�tica = " +media);
}
	
	
public static void main(String[] args) {
	Exercicio12 exer = new Exercicio12();
	exer.receberDados();
	exer.somarDados();
	exer.calcularMedia();
}
}
