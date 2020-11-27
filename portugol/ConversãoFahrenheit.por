programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real tempGrau, tempFahrenheit

		
		escreva("Digite a temperatura atual (em grau Fahrenheit) : ")
		leia(tempFahrenheit)
		tempGrau = ((tempFahrenheit -32) * 5) / 9

		escreva("A temperatura em Celsius é: " + Matematica.arredondar(tempGrau,2) + "°C")
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */