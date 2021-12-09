//Faça um programa que leia dez números inteiros e imprima o maior deles

package Lista2;

import java.util.Scanner;

public class Exercicio8 {
	Scanner scan = new Scanner(System.in);
	int numeros[] = new int [11];
	int maiorNumero=0;
	
public void pegarNumeros() {

	for(int contador=0; contador<10; contador++)
	{
		System.out.println(+(contador+1) +"º valor : ");
		numeros[contador] = scan.nextInt();
	}
}

public void descobrirMaior() {

	for(int cont =0; cont < numeros.length; cont++){
	 
		if (numeros[cont] > maiorNumero) {
			maiorNumero = numeros[cont];
		} 
	 }
	System.out.println(" MAIOR NÚMERO: "+maiorNumero);
}

public static void main (String[]args) {
	Exercicio8 exer = new Exercicio8();
	exer.pegarNumeros();
	exer.descobrirMaior();
}   
}
