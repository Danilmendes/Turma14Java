programa
{
	
	funcao inicio()
	{
		inteiro tempoDias, modulo, anos, mes , dias
		const inteiro diasNoAno = 365
		
		escreva(" ----Cálculo da idade em anos---- ")
		escreva("\n\nDigite a sua idade em dias: ")
		leia(tempoDias)

		
		modulo = tempoDias % diasNoAno
		dias = (tempoDias % diasNoAno)%30
		mes = (tempoDias % diasNoAno)/30
		anos = (tempoDias - modulo) / diasNoAno	
		escreva("\nSua idade é aproximadamente : " + anos +" anos " + mes + " meses e " + dias + " dias" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */