// Faça um programa que leia uma matriz 5 x 5 e imprima como
//resultado as posições onde se encontram o menor e o maior valores

package Lista3;

public class Exercicio1 {
	int matriz[][]= {
		{2,6,8,7,9},
		{45,51,1,95,103},
		{12,4,46,37,26},
		{21,32,56,89,74},
		{3,24,5,200,13}
	};
	 int maiorNumero;
	 String posicaoMaior;
	 int menorNumero;
	 String posicaoMenor;

	
public void descobrirMaior() {

		for(int cont =0; cont < matriz.length; cont++){
			for(int contador =0; contador < matriz.length; contador++){
				if (matriz[cont][contador] > maiorNumero) {
					maiorNumero = matriz[cont][contador];
					posicaoMaior = cont + "," + contador;
				} 
			}
		}
		System.out.println(" A POSIÇÃO DO MAIOR NÚMERO: "+posicaoMaior);
	}

public void descobrirMenor() {
	
	menorNumero=matriz[0][0];
	
	for(int cont =0; cont < matriz.length; cont++){
		for(int contador =0; contador < matriz.length; contador++){
			if (matriz[cont][contador] < menorNumero) {
				menorNumero = matriz[cont][contador];
				posicaoMenor = cont + "," + contador;
			} 
		}
	}
	System.out.println(" A POSIÇÃO DO MENOR NÚMERO: "+posicaoMenor);
}

public static void main(String[] args) {
	Exercicio1 exer = new Exercicio1();
	exer.descobrirMaior();
	exer.descobrirMenor();
}
}
