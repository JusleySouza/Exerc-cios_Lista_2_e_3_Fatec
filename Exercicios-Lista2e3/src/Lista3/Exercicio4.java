//Faça um programa que leia uma matriz 5 x 5 e imprima como
//resultado as médias dos valores da diagonal principal

package Lista3;

public class Exercicio4 {
	int matriz[][]= {
			{2,6,8,7,9},
			{45,51,1,95,103},
			{12,4,46,37,26},
			{21,32,56,89,74},
			{3,24,5,200,13}
		};
	float mediaDiagonal;
	int vetor[] = new int[5];
	float total = 0;
	
public void pegarDiagonalPrincipal() {
		for (int contador=0; contador<matriz.length; contador++) {
			vetor[contador] = matriz[contador][contador];
		}
}

public void calcularMediaDiagonal() {
	for(int cont =0; cont < vetor.length; cont++){
		total += vetor[cont];
	}
	mediaDiagonal = total / vetor.length;
	System.out.println("MEDIA DA DIAGONAL PRINCIPAL: " +mediaDiagonal);
}

public static void main(String[] args) {
	Exercicio4 exer = new Exercicio4();
	exer.pegarDiagonalPrincipal();
	exer.calcularMediaDiagonal();
}
}
