// Faça um programa que leia um vetor de 10 números inteiros e exiba-os do último ao primeiro

package Lista2;

public class Exercicio11 {
	int vetorNumeros[]= {31,95,4,16,20,3,15,27,56,1};
	int posicao;

public void inverterPosicoes() {
	for(posicao = 0; posicao < vetorNumeros.length; posicao++) {
		   System.out.println("Posição " +((vetorNumeros.length - 1)-posicao)+ " = "+vetorNumeros[(vetorNumeros.length - 1)-posicao]);
	}
}
	
public static void main(String[]args) {
	Exercicio11 exer = new Exercicio11();
	exer.inverterPosicoes();	  	
} 
}
