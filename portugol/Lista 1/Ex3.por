programa
{
	
	funcao inicio()
	{
		inteiro segundos, minutos, horas, moduloMin, moduloHora
		escreva("--- Conversão de segundos em horas e minutos ----")
		
		escreva("\nDigite o tempo em segundos: ")
		leia(segundos)

		moduloMin = segundos % 60
		minutos = (segundos - moduloMin) / 60

		moduloHora = (minutos % 60)
		horas = (minutos - moduloHora) / 60

		escreva("\nSão " + horas +" horas " + moduloHora + " minutos e " + moduloMin + " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */