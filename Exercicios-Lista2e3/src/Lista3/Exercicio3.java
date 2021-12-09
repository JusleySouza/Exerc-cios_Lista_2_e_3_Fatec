//Faça um programa que leia uma matriz 5 x 5 e imprima como
//resultado o maior valor da diagonal secundária

package Lista3;

public class Exercicio3 {
	int matriz[][]= {
			{2,6,8,7,9},
			{45,51,1,95,103},
			{12,4,46,37,26},
			{21,32,56,89,74},
			{3,24,5,200,13}
		};
	int posicao = 4;
	int maiorValor;
	int vetor[] = new int[5];
	
public void pegarDiagonalSecundaria() {
		for (int contador=0; contador<matriz.length; contador++) {
			vetor[contador] = matriz[contador][posicao];
			posicao--;
		}
	}

public void descobrirNumeroMaior() {

	for(int cont =0; cont < vetor.length; cont++){
	 
		if (vetor[cont] > maiorValor) {
			maiorValor = vetor[cont];
		} 
	 }
	System.out.println(" MAIOR NÚMERO: "+maiorValor);
}

public static void main(String[] args) {
	Exercicio3 exer = new Exercicio3();
	exer.pegarDiagonalSecundaria();
	exer.descobrirNumeroMaior();
}

}
