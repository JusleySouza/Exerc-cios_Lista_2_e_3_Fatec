// Faça um programa que leia um vetor de 10 números inteiros e em seguida
// apresente todos eles

package Lista2;

public class Exercicio10 {
	
	int vetor[ ] = {32,74,65,1,8,9,56,7,224,10};
	
public void imprimirVetor() {
	for(int posicao=0; posicao<vetor.length; posicao++) {
		System.out.println("Posição " +posicao+ " = " +vetor[posicao]); 
	}
}
	
 public static void main(String args[]) {
	Exercicio10 exer = new Exercicio10();
	exer.imprimirVetor();
	}
}
