programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real x1, y1, x2, y2, resultado

		escreva("---- Distância entre dois pontos ----")
		
		escreva("\nDigite a coordenada X do primeiro ponto: ")
		leia(x1)
		escreva("Digite a coordenada Y do primeiro ponto: ")
		leia(y1)
		escreva("Digite a coordenada X do Segundo ponto: ")
		leia(x2)
		escreva("Digite a coordenada Y do Segundo ponto: ")
		leia(y2)	

		resultado = Matematica.raiz(Matematica.potencia(x2-x1,2) + Matematica.potencia(y2-y1,2) ,2)

		escreva("\nA distância entre os dois pontos é: " + resultado)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 523; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */