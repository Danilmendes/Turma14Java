programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real tempGrau, tempFahrenheit

		escreva("Digite a temperatura atual (em grau Celsius) : ")
		leia(tempGrau)
		tempFahrenheit = (tempGrau * 9 / 5) + 32

		escreva("A temperatura em Fahrenheit é: " + Matematica.arredondar(tempFahrenheit,2) + "°F")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */