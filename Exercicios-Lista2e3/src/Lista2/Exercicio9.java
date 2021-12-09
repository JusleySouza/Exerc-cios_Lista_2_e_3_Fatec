//Faça um programa que receba 20 números inteiros e imprima quantos deles 
//são maiores que 50

package Lista2;

import java.util.Scanner;

public class Exercicio9 {
	 Scanner scan = new Scanner(System.in);
	 int contador = 0;
	 int numero[] = new int[20];
	 
public void receberNumeros() {

	 for(int contador = 0;contador<20 ;contador++) {
		
		System.out.println("Informe o "+(contador+1)+"° número: ");
		numero[contador] = scan.nextInt();
	 }
}

public void descobrirMaior50() {
	 for(int cont = 0; cont< numero.length ;cont++) {

		 	if(numero[cont] > 50) {
		 		contador++;
		 	}
	 }
	 System.out.println("\nTem " +contador+ " números maiores que 50. ");	
}

public static void main(String[]args) {
		Exercicio9 exer = new Exercicio9();
		exer.receberNumeros();
		exer.descobrirMaior50();
		}  
}
