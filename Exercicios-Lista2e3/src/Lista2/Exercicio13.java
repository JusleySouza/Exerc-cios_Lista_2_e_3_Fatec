//Faça um programa que leia 4 notas de um aluno, apresente a média aritmética bem 
//como a sua situação: (Media < 3 - Reprovado, Média >=3 e < 7 - Exame e Média >=7 Aprovado)

package Lista2;

import java.util.Scanner;

public class Exercicio13 {
	
	Scanner scan = new Scanner(System.in);
	double notasAluno[] = new double[4];
	double soma = 0;
	double mediaAluno;
	
public void receberNotas() {
	for(int posicao = 0; posicao < 4; posicao++) {
		System.out.println("Informe a "+(posicao+1)+"° nota do aluno: ");
		notasAluno[posicao] = scan.nextDouble();
	}
}
	
public void somarNotas() {
	for (int contador = 0; contador < notasAluno.length ; contador++) {
		soma += notasAluno[contador];
	}
}

public void calcularMedia() {
	mediaAluno = soma / notasAluno.length;
	System.out.println("\nMédia do aluno: "+mediaAluno);
}

public void mostrarSituacao() {
	if(mediaAluno < 3) {
		System.out.println("REPROVADO!!");
	}
	if((mediaAluno >= 3) && (mediaAluno < 7)) {
		System.out.println("EXAME!!");
	}
	if((mediaAluno >= 7)) {
		System.out.println("APROVADO!!");
	}
}

public void executar() {
	receberNotas();
	somarNotas();
	calcularMedia();
	mostrarSituacao();
}

public static void main(String[]args){
		Exercicio13 exer = new Exercicio13();
		exer.executar();
}
}
