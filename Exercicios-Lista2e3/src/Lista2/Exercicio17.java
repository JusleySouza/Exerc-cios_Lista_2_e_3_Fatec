//. Faça um programa que leia um vetor de 10 números inteiros e em seguida 
//apresente-os em ordem decrescente

package Lista2;

import java.util.Scanner;

public class Exercicio17 {

	Scanner scan = new Scanner (System.in);
	int vetorDados[] = new int[10];  
	int cont;
	int posicao;
	int ordemFinal;
	
public void pegarDados() {
	 for (int contador=0; contador<10; contador++){  
         System.out.println ("Informe o "+(contador+1)+"° numero do vetor:");  
         vetorDados [contador] = scan.nextInt();     
     }  
}

public void OrdemDecrescente(int vetorDecrescente[]){    
    for(cont =0; cont<10; cont++){  
    	for(posicao =0; posicao <9; posicao++){  
    		if(vetorDecrescente[posicao]< vetorDecrescente[posicao+1]){  
    			ordemFinal = vetorDecrescente[posicao];  
    			vetorDecrescente[posicao] = vetorDecrescente[posicao+1];  
    			vetorDecrescente[posicao+1] = ordemFinal;  
             }  
         }  
     } 
}

public void imprimirDados() {
	 OrdemDecrescente(vetorDados);
     
     System.out.println("\nNUMEROS EM ORDEM DECRESCENTE: ");
     for (int numero : vetorDados){
    	 System.out.println(numero);
     }
}

public void executar() {
	pegarDados();
	imprimirDados();
}


public static void main (String args []){
	Exercicio17 exer = new Exercicio17();
	exer.executar();

	
	
		     
		    
		     
		    
		   
				         
				      }
}
