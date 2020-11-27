programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, total
		
		escreva("----Cálculo da idade em dias----")
		escreva("\n\nDigite a sua idade: ")
		leia(anos)

		escreva("Digite os meses: ")
		leia(meses)

		escreva("Digite os dias: ")
		leia(dias)

		total = anos * 365 + meses * 30 + dias
		escreva("Sua idade em dias é aproximadamente: " + total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */