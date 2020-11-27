programa
{
	inclua biblioteca Matematica
			
	funcao inicio()
	{
		inteiro A,B,C,R,S
		real D

		escreva("Digite o primeiro valor (positivo e inteiro): ")
		leia(A)
		escreva("Digite o segundo valor (positivo e inteiro): ")
		leia(B)
		escreva("Digite o terceiro valor (positivo e inteiro): ")
		leia(C)

		R = Matematica.potencia(A + B, 2)
	     S = Matematica.potencia(B + C, 2)
	     D = (R + S) / 2

	     escreva("\nO resultado é: " + D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */