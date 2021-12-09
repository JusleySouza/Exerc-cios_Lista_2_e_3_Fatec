//Seja a seguinte série: 1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, ...
// Escreva um programa que seja capaz de gerar os seus N termos

package Lista2;

public class Exercicio5 {
	int vetorTermos[] = new int[30];
	int base = 1;

public void gerarTermos() {
	for(int posicao=0; posicao<30; posicao+=3 ) {
		vetorTermos[posicao] = base;
		vetorTermos[posicao+1] = base+3;
		vetorTermos[posicao+2] = base+3;
		base++;
	}
}
	
public void imprimirTermos() {
	for(int posicao=0; posicao<30; posicao++ ) {
	System.out.println(vetorTermos[posicao]);
	}

}

public static void main(String[] args) {
	Exercicio5 exer = new Exercicio5();
	exer.gerarTermos();
	exer.imprimirTermos();
}
}
