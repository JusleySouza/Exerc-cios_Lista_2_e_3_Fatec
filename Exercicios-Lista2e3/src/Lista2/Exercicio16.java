//. Faça um programa que leia um vetor de 10 números inteiros e em seguida 
//apresente-os em ordem crescente

package Lista2;

import java.util.Scanner;

public class Exercicio16 {
	
	Scanner scan = new Scanner (System.in);
	int vetorInteiros[] = new int[10]; 
	int contador;
	int base;
	int ordemFinal;
	
public void pegarNumeros() {  
    for (int cont=0; cont<10; cont++){  
        System.out.println ("Informe o "+(cont+1)+"° numero: ");  
        vetorInteiros [cont] = scan.nextInt();    
    } 
}

public void OrdemCrescente(int vetorCrescente[]){  
	for(contador =0; contador<10; contador++){  
   	 	for(base =0; base <9; base++){  
   	 		if(vetorCrescente[base] > vetorCrescente[base+1]){  
   	 			ordemFinal = vetorCrescente[base];  
   	 			vetorCrescente[base] = vetorCrescente[base+1];  
   	 			vetorCrescente[base+1] = ordemFinal;  
             }  
         }  
    }
}

public void imprimirNumeros() {
	  OrdemCrescente(vetorInteiros);
	     
	     System.out.println("NUMEROS EM ORDEM CRESCENTE: ");
	     for (int n : vetorInteiros){
	    	 System.out.println(n);
	     }
 } 

public void executar() {
	pegarNumeros();
	imprimirNumeros();
}
	
public static void main (String args []){
	Exercicio16 exer = new Exercicio16();
	exer.executar();

		    
		     
		   
		   
				}      

}
