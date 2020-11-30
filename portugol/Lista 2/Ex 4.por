programa
{
	
	funcao inicio()
	{
		inteiro numero,resto
		
		escreva("\nDigite um número (inteiro) : ")
		leia(numero)

		resto = (numero % 2)
		
		se(numero < 0){
			se (resto==0)
			{
				escreva("O número " + numero + " é par e negativo.")
			}
			senao {
				escreva("O número " + numero + " é ímpar e negativo.")
			}
		}
		senao se (numero == 0){
			escreva("O número " + numero + " é neutro." )
		}
		senao{
				
			se (resto==0)
			{
				escreva("O número " + numero + " é par e positivo.")
			}
			senao {
				escreva("O número " + numero + " é ímpar e positivo.")
			}
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */