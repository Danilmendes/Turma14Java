programa
{
	
	funcao inicio()
	{
		inteiro x
		real pontuacao [5], maiornumero= 0.0

		para(x=0 ; x < 5 ; x++){
			escreva("Digite um valor: ")
			leia(pontuacao[x])	

			se( maiornumero < pontuacao[x]){
				maiornumero = pontuacao[x]			
			}
		}
		
		escreva("\n")
		
		para (x=0 ; x<5 ; x++){
			escreva(pontuacao[x]," ")
		}
		
		escreva("\n\nO maior valor digitado neste vetor é: ",maiornumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */