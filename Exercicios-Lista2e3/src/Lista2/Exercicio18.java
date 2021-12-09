//Faça um programa que leia dois vetores de 10 números inteiros, gere um terceiro 
//com 20 elementos com valores que deverão ser compostos pelos elementos
//dos dois outros vetores

package Lista2;

public class Exercicio18 {
	int vetor1[] = {65,84,75,9,32,2,5,7,47,10};
	int vetor2[] = {3,56,98,52,4,1,36,8,27,12};
	int vetor3[] = new int[20];
	int base = 0;
	
public void juntarVetores() {
	for(int posicao=0; posicao<20; posicao+=2) {
		vetor3[posicao] = vetor1[base];
		vetor3[posicao+1] = vetor2[base];
		base++;
	}
}

public void imprimirVetor3() {
	for(int posicao=0; posicao<20; posicao++) {
	System.out.println("Posição " +posicao+ " do Vetor 3: "+ vetor3[posicao]);
	}
}

public static void main(String[] args) {
	Exercicio18 exer = new Exercicio18();
	exer.juntarVetores();
	exer.imprimirVetor3();
}
}
