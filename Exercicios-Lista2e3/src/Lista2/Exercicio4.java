//Faça um programa que solicite uma sequência de números inteiros e determine 
//se eles são primos ou não


package Lista2;

import java.util.Scanner;

public class Exercicio4 {
	Scanner scan = new Scanner(System.in);
	
	int sequencia [] = new int[6];
	int contador;
	int cont;
	
	
public void receberDados() {
	for (contador=0; contador<6;contador++) {
		System.out.println("Informe um numero qualquer: ");
		sequencia[contador] = scan.nextInt();
		System.out.println(sequencia[contador]);
	}
}

public void analisarPrimos() {
	for(contador=0; contador<sequencia.length;contador++) {
			int primos=0;
 	
			for(cont=1; cont<=sequencia[contador];cont++) {
 				if(sequencia[contador] % cont == 0) {
 					primos++;
 				}
 			}
			
 			if(primos == 2) {
 				System.out.println(+sequencia[contador]+" = É PRIMO.");
			}
	}
 }
		
public static void main(String[]args) {
	Exercicio4 exer = new Exercicio4();
	exer.receberDados();
	exer.analisarPrimos();		 	
}
}
