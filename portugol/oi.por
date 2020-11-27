programa
{
	
	funcao inicio()
	{	
		inteiro anos
		inteiro mes 
		inteiro dia
		inteiro total 
		
		
		escreva("Digite quantos anos você tem: ")
		leia("anos")

		escreva("Digite os meses: ")
		leia("meses")

		escreva("Digite os dias: ")
		leia("dias")

		total = (anos * 365) + (meses * 30) + dias

		escreva("Sua idade em dias é: " + total)
		
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