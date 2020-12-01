programa
{
	
	funcao inicio()
	{
		real numero = 0.0, total =0.0, contador = 0.0, media = 0.0

		enquanto ( numero >= 0){
			
			escreva("Digite um número: ")
			leia (numero)
			
			se (numero < 0){
				pare
			}
			senao{
				limpa()
				contador++
				total = total + numero
			}
		}

		media = total / contador
		
		limpa()
		escreva("\nSomatório: ",total)
		escreva("\nMédia: ", media)
		escreva("\nTotal de valores lidos: ", contador)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */