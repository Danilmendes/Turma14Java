programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro linha, coluna, matrizN1[4][6], matrizN2[4][6], matrizM1[4][6],matrizM2[4][6]

		escreva("MATRIZ N1\n")
		
		para(linha = 0; linha<4 ; linha++)
		{
			para(coluna = 0; coluna<6 ; coluna++)
			{
				matrizN1[linha][coluna] = Util.sorteia(0,9)
				escreva(matrizN1[linha][coluna]," ")
			}
			
			escreva("\n")
		}
		escreva("\nMATRIZ N2\n")
		
		para(linha = 0; linha<4 ; linha++)
		{
			para(coluna = 0; coluna<6 ; coluna++)
			{
				matrizN2[linha][coluna] = Util.sorteia(0,9)
				escreva(matrizN2[linha][coluna]," ")
			}
			
			escreva("\n")
		}
		escreva("\nMATRIZ M1\n")
		para(linha = 0; linha<4 ; linha++)
		{
			para(coluna = 0; coluna<6 ; coluna++)
			{
				matrizM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna]
				escreva(matrizM1[linha][coluna]," ")
			}
		escreva("\n")	

		}
		
		escreva("\nMATRIZ M2\n")
		para(linha = 0; linha<4 ; linha++)
		{
			para(coluna = 0; coluna<6 ; coluna++)
			{
				matrizM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna]
				escreva(matrizM2[linha][coluna]," ")
			}
		escreva("\n")	

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizN1, 7, 25, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */