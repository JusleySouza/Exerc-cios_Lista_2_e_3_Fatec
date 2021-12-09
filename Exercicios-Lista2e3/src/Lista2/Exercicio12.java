//Faça um programa que solicite ao usuário 10 números reais, armazene-os em um 
//vetor, imprima a soma de todos eles e a média aritmética

package Lista2;

import java.util.Scanner;

public class Exercicio12 {
	
	Scanner scan = new Scanner(System.in);
	double vetor[] = new double[10];
	double soma = 0;
	double media;
	
public void receberDados() {
	for (int contador = 0; contador < 10; contador++) {
		System.out.println("Informe o " +(contador+1)+ "° Número:");
		vetor[contador] = scan.nextDouble();
	}
}

public void somarDados() {
	for (int contador = 0; contador < vetor.length ; contador++) {
		soma +=vetor[contador];
	}
	System.out.println("\nSoma de todos os números: "+soma);	
}

public void calcularMedia() {
	media= soma / vetor.length;
	System.out.println("Média aritmética = " +media);
}
	
	
public static void main(String[] args) {
	Exercicio12 exer = new Exercicio12();
	exer.receberDados();
	exer.somarDados();
	exer.calcularMedia();
}
}
