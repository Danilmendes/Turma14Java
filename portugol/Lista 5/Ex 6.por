programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vetor[3], matriz[3][3], linha

		escreva("Vetor\n")

		para(linha=0; linha<3 ; linha++){
			vetor[linha] = Util.sorteia(1,9)
			escreva(vetor[linha]," ")
			}
		escreva("\n")
		escreva("\nMatriz\n")
		para(linha=0; linha<3 ; linha++){
			para(inteiro coluna=0; coluna<3 ; coluna++){
				matriz[linha][coluna] = Util.sorteia(1,9)
				escreva("",matriz[linha][coluna]," ")
			}
			escreva("\n")	
		}
		escreva("\nMatriz 2\n")
		para(linha=0; linha<3 ; linha++){
			para(inteiro coluna=0; coluna<3 ; coluna++){
				matriz[linha][coluna] = matriz[linha][coluna] * vetor[linha]
				escreva("",matriz[linha][coluna]," ")
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
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 7, 10, 5}-{matriz, 7, 20, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */