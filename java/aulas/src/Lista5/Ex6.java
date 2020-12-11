package Lista5;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random sorteia = new Random();
		
		int vetor[] = new int[3];
		int matriz[][] = new int[3][3]; 
		int linha;
		
		System.out.println("Vetor");

		for(linha=0; linha<3 ; linha++){
			vetor[linha] = sorteia.nextInt(9)+1;
			System.out.print(vetor[linha]+" ");
			}
		System.out.println("");
		System.out.println("\nMatriz\n");
		for(linha=0; linha<3 ; linha++){
			for(int coluna=0; coluna<3 ; coluna++){
				matriz[linha][coluna] = sorteia.nextInt(9)+1;
				System.out.print(""+matriz[linha][coluna]+" ");
			}
			System.out.println("");	
		}
		System.out.println("\nMatriz 2");
		for(linha=0; linha<3 ; linha++){
			for(int coluna=0; coluna<3 ; coluna++){
				matriz[linha][coluna] = matriz[linha][coluna] * vetor[linha];
				System.out.print(""+matriz[linha][coluna]+" ");
			}
			System.out.println();	
		}	
	}
}
