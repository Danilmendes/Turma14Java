programa
{
	
	funcao inicio()
	{
		real a, b, c, d, f, g, x, y
		escreva("--- Calculo do X e do Y ---")
		escreva("\nExemplo de equação: \n8ax + by = c \ndx + ey = f")

		//Obtendo os índices
		escreva("\nDigite o valor do índice a: ")
		leia(a)
		escreva("Digite o valor do índice b: ")
		leia(b)
		escreva("Digite o valor do índice c: ")
		leia(c)
		escreva("Digite o valor do índice d: ")
		leia(d)
		escreva("Digite o valor do índice e: ")
		leia(f)
		escreva("Digite o valor do índice f: ")
		leia(g)

		//Cálculo do X
		x = (c*f - b*g) / (a*f - b*d)
		y = (a*g - c*d) / (a*f - b*d)

		escreva("O valor de X é " + x + " e o valor de Y é " + y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */