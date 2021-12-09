//Faça um programa que imprima todos os números do intervalo de 1 a 30 e 
//a soma do quadrado destes números

package Lista2;

public class Exercicio6 {
	
	int inicio =1;
	int fim =30;
	int soma=0; 
	int vetorIntervalo[] = new int[31];
	int vetorQuadrados[] = new int [1000];
	int numQuadrado;
	
public void imprimirIntervalo() {
	for(int cont = inicio; cont <= fim; cont++)
	{	vetorIntervalo[cont]=cont;
		System.out.println(+vetorIntervalo[cont]);
}
}

public void gerarOsQuadrados() {
	for (int cont = inicio; cont <= fim; cont++) {
		int numQuadrado = vetorIntervalo[cont]*vetorIntervalo[cont];
		vetorQuadrados[numQuadrado]=numQuadrado;
		System.out.println("Quadrado do numero " +cont + " = "+vetorQuadrados[numQuadrado]);
	}
}

public void somarQuadrados() {
	for (int cont = inicio; cont<vetorQuadrados.length; cont++) {
		soma += vetorQuadrados[cont];
	}
	System.out.println("Valor total da soma dos quadrados = "+soma);
}

	public static void main(String[]args){
		Exercicio6 exer = new Exercicio6();
		exer.imprimirIntervalo();
		exer.gerarOsQuadrados();
		exer.somarQuadrados();
	}
}
