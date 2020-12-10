package Lista4;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		int x;
		double pontuacao[] = new double[5];
		double maiornumero= 0.0;
		
		Scanner leia = new Scanner(System.in);

		for(x=0 ; x < 5 ; x++){
			System.out.println("Digite um valor: ");
			pontuacao[x] = leia.nextDouble();	

			if( maiornumero < pontuacao[x]){
				maiornumero = pontuacao[x];			
			}
		}
		System.out.printf("\n");	
		for (x=0 ; x<5 ; x++){
			System.out.printf(pontuacao[x]+" ");
		}
		
		System.out.printf("\n\nO maior valor digitado neste vetor é: %.2f",maiornumero);
	}
}
