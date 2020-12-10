package Lista4;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		int linha, coluna, soma = 0, somaDiagonal = 0;
		int matriz[][] = new int[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha<3 ; linha++)
		{
			for(coluna = 0; coluna<3 ; coluna++)
			{
				System.out.print("Digite um valor inteiro para a linha("+(linha+1)+"): ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		System.out.println("");	
		for(linha = 0; linha<3 ; linha++)
		{
			for(coluna = 0; coluna<3 ; coluna++)
			{
				System.out.print(matriz[linha][coluna]+" ");
				soma = soma + matriz[linha][coluna];
				if(linha == coluna){
					somaDiagonal = somaDiagonal + matriz[linha][coluna];
				}
			}			
			System.out.println("");
		}

		System.out.println("\nSoma de todos os valores da matriz: "+soma);
		System.out.println("Soma de todos os valores da diagonal principal: "+somaDiagonal);
	}
}
