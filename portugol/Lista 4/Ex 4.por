programa
{
	
	funcao inicio()
	{
		inteiro linha, coluna, matriz[3][3], soma = 0, somaDiagonal = 0

		para(linha = 0; linha<3 ; linha++)
		{
			para(coluna = 0; coluna<3 ; coluna++)
			{
				escreva("Digite um valor inteiro para a linha(",linha+1,"): ")
				leia(matriz[linha][coluna])
			}
		}
		
		escreva("\n")
		
		para(linha = 0; linha<3 ; linha++)
		{
			para(coluna = 0; coluna<3 ; coluna++)
			{
				escreva(matriz[linha][coluna]," ")
				soma = soma + matriz[linha][coluna]

				se(linha == coluna){
					somaDiagonal = somaDiagonal + matriz[linha][coluna]
				}
			}
			
			escreva("\n")
		}

		escreva("\nSoma de todos os valores da matriz: ",soma)
		escreva("\nSoma de todos os valores da diagonal principal: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */