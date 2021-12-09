//Faça um programa que leia uma matriz 5 x 5 e imprima como
//resultado os valores das diagonais principal e secundária

package Lista3;

public class Exercicio2 {
	int matriz[][]= {
			{2,6,8,7,9},
			{45,51,1,95,103},
			{12,4,46,37,26},
			{21,32,56,89,74},
			{3,24,5,200,13}
		};
		int posicao = 4;
	
public void imprimirDiagonalPrincipal() {
	System.out.println("DIAGONAL PRINCIPAL: ");
	for (int contador=0; contador<matriz.length; contador++) {
		System.out.println(matriz[contador][contador]);
	}
}

public void imprimirDiagonalSecundaria() {
	System.out.println("\nDIAGONAL SECUNDARIA: ");
	for (int contador=0; contador<matriz.length; contador++) {
		System.out.println(matriz[contador][posicao]);
		posicao--;
	}
}


public static void main(String[] args) {
	Exercicio2 exer = new Exercicio2();
	exer.imprimirDiagonalPrincipal();
	exer.imprimirDiagonalSecundaria();
}
}
