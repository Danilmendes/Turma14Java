programa
{
	
	funcao inicio()
	{
		real numero = 0.0
		inteiro intervalo[5]={0,0,0,0,0}

		faca{
			escreva("Digite um número: ")
			leia(numero)
			se(numero>=0 e numero<=25){
				intervalo[0]++
			}
			senao se(numero>=26 e numero<=50){
				intervalo[1]++
			}
			senao se(numero>=51 e numero<=75){
				intervalo[2]++
			}
			senao se(numero>=76 e numero<=100){
				intervalo[3]++
			}
			senao se(numero >100){
				intervalo[4]++
			}
		}enquanto(numero>=0)

		limpa()
		escreva("\nQuandidade de números no intervalo [0 - 25]: ",intervalo[0])
		escreva("\nQuandidade de números no intervalo [26 - 50]: ",intervalo[1])
		escreva("\nQuandidade de números no intervalo [51 - 75]: ",intervalo[2])
		escreva("\nQuandidade de números no intervalo [76 - 100]: ",intervalo[3])
		escreva("\nQuandidade de números acima de 100: ",intervalo[4])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */