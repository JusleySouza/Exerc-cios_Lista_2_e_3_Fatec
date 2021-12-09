//Faça um programa que leia um vetor de 15 caracteres e informe quantas vogais 
//foram digitadas pelo usuário

package Lista2;

import java.util.Scanner;

public class Exercicio14 {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 String letras[]= {"a","e","i","o","u"};
	 String caracteres[] = new String[15];
	 int contador = 0;
	 int cont;
	
public void lerDados() {
	for(int contador=0; contador < 15; contador++) {
		System.out.println("Digite um caracter qualquer entre numero e letra: ");
  		caracteres[contador] = scan.nextLine();
  		System.out.println(caracteres[contador]);
}
}
	
public void analisarDados() {
	for( int cont = 0; cont < caracteres.length ; cont++){
  		for(int vet = 0; vet <letras.length; vet++){
  			if(caracteres[cont].equalsIgnoreCase(letras[vet])) {
  				contador++;
  			}
  		}
  	}
  	System.out.println("Total de Vogais: " + contador);
}

public void executar() {
	lerDados();
	analisarDados();
}

public static void main(String[]args) {
  	Exercicio14 exer = new Exercicio14();
  	exer.executar();
  }
	
}
