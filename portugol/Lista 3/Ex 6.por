programa
{
	
	funcao inicio()
	{
		inteiro numero ,contador = 1, total= 0.0

		escreva("Digite um número: ")
		leia(numero)
		
		enquanto (numero <= 0){
			escreva("Valor incorreto. Digite um número maior que 0: ")
			leia(numero)
		}

		faca{
	
			total = total + contador
			contador++	
		} enquanto (contador<=numero)
		
		escreva ("O valor da soma até ",numero," é: ",total)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */