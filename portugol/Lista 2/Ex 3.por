programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real num1, num2, num3, num4, quadrado1, quadrado2, quadrado3, quadrado4

		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o terceiro número: ")
		leia(num3)
		escreva("Digite o quarto número: ")
		leia(num4)

		quadrado1= mat.potencia(num1,2)
		quadrado2= mat.potencia(num2,2)
		quadrado3= mat.potencia(num3,2)
		quadrado4= mat.potencia(num4,2)

		se (quadrado3 >= 1000){
			escreva("Valor do terceiro número: " + num3 +"\nQuadrado do terceiro número (x²): " + quadrado3)		
		}
		senao{
			escreva("\nValor do primeiro número: " + num1 +"   Quadrado do primeiro número (x²): " + quadrado1)
			escreva("\nValor do segundo número: " + num2 +"    Quadrado do segundo número (x²): " + quadrado2)
			escreva("\nValor do terceiro número: " + num3 +"   Quadrado do terceiro número (x²): " + quadrado3)
               escreva("\nValor do quarto número: " + num4 +"     Quadrado do quarto número (x²): " + quadrado4)
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 724; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */