//Fa�a um programa que receba dez n�meros inteiros e imprima o cubo de cada n�mero

package Lista2;

import java.util.Scanner;

public class Exercicio7 {

	Scanner scan = new Scanner(System.in);
	int numero[] = new int[11];
	int cubo;
	
public void receberNumeros() {
	for(int contador = 1; contador<=10; contador++) {
		
		System.out.println(+contador+"� numero: ");
		numero[contador] = scan.nextInt();
	}
}

public void multiplicarNumero() {
	for(int contador = 1; contador<numero.length; contador++) {
		cubo = numero[contador] * numero[contador] * numero[contador];	

		System.out.println("o CUBO de "+numero[contador]+ " � = "+cubo);
	}
}
	
	public static void main(String[]args) {
		Exercicio7 exer = new Exercicio7();
		exer.receberNumeros();
		exer.multiplicarNumero();
	}
}

