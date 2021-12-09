//Faça um programa que armazene as alturas de 20 pessoas e em seguida imprima
// a menor dentre elas

package Lista2;

import java.util.Scanner;

public class Exercicio19 {
	Scanner scan = new Scanner(System.in);
	
	int numPessoas = 20;
	int contador;
	double menorAltura = 0;
	double altura[] = new double [numPessoas];
	
public void receberAltura() {
	for(contador = 0; contador < 20; contador++) {
		System.out.println("Informe a altura da "+(contador+1)+"° pessoa:");
		altura[contador] = scan.nextDouble();
		menorAltura = altura[contador];
	}
}
	
public void analisaAltura() {
	for(contador = 0; contador < 20; contador++) {
		
		if(altura[contador] < menorAltura) {
			menorAltura = altura[contador];
		}
	} System.out.println("A menor altura e : "+menorAltura);
}
	
public static void main(String[]args) {
	Exercicio19 exer = new Exercicio19();	
	exer.receberAltura();
	exer.analisaAltura();
}			
}
