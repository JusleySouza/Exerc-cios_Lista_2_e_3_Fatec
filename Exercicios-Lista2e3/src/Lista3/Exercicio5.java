// Faça um programa que Leia uma matriz 4 x 4 trocando os valores
//da 1ª.linha pelos da 4ª.coluna e vice-versa. Imprima a matriz após realizada a troca

package Lista3;

public class Exercicio5 {
	int matriz[][]= {
			{2,6,8,17},
			{45,51,1,95},
			{12,4,46,37},
			{21,32,56,89},
		};
	
	int vetorLinha[] = new int[4];
	int vetorColuna[] = new int[4];
	
public void pegarVetorLinha() {
	for (int cont =0; cont < matriz.length; cont++){
		vetorLinha[cont] = matriz[0][cont];
	}
}

public void pegarVetorColuna() {
	for (int cont =0; cont < matriz.length; cont++){
		vetorColuna[cont] = matriz[cont][3];
	}
}

public void novaMatriz() {
	for (int cont =0; cont < matriz.length; cont++){
		matriz[0][cont] = vetorColuna[cont];
	}
	for (int cont =0; cont < matriz.length; cont++){
		matriz[cont][3] = vetorLinha[cont];
	}
}

public void imprimirNovaMatriz() {
	System.out.println("NOVA MATRIZ: ");
	for (int cont =0; cont < matriz.length; cont++){
		for (int contador =0; contador < matriz.length; contador++){
		System.out.println(matriz[cont][contador]);
	}
	}
}
 
public static void main(String[] args) {
	Exercicio5 exer = new Exercicio5();
	exer.pegarVetorLinha();
	exer.pegarVetorColuna();
	exer.novaMatriz();
	exer.imprimirNovaMatriz();
}
}
