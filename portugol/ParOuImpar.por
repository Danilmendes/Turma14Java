programa
{
	
	funcao inicio()
	{
		inteiro numero,resto
		
		escreva("---- Descobrir se um número é par ou ímpar ----")
		escreva("\n\nDigite um número (inteiro) : ")
		leia(numero)

		resto = (numero % 2)
		
		se(numero <= 0)   {
			escreva("O número digitado não é inteiro ou foi igual a 0. Obs: Números inteiros são positivos e não possuem casas decimais. ")
		}
		senao{
				
			se (resto==0)
			{
				escreva("O número " + numero + " é par")
			}
			senao se (resto==1) {
				escreva("O número " + numero + " é ímpar")
			}
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 58; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */