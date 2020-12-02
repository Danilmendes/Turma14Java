programa
{
	
	funcao inicio()
	{
		caracter tipo
		inteiro rodada, pontoCorinthians=0, pontoPalmeiras=0, pontoSantos=0, pontoSpfc=0

		para(rodada = 1; rodada <= 4; rodada++){
			escreva("Corinthians - G-ganhou, P-perdeu ou E-empatou [G/P/E]: ")
			leia (tipo)
			pontoCorinthians = pontoCorinthians + retornaPontos(tipo) 
			
			escreva("Palmeiras - G-ganhou, P-perdeu ou E-empatou [G/P/E]: ")
			leia (tipo)
			pontoPalmeiras = pontoPalmeiras + retornaPontos(tipo) 
			
			escreva("Santos - G-ganhou, P-perdeu ou E-empatou [G/P/E]: ")
			leia (tipo)
			pontoSantos = pontoSantos + retornaPontos(tipo) 
			
			escreva("São Paulo - G-ganhou, P-perdeu ou E-empatou [G/P/E]: ")
			leia (tipo)
			pontoSpfc = pontoSpfc + retornaPontos(tipo) 

			
			
			

			limpa()
			escreva("Rodada ",rodada)
			escreva("\n\nCorinthians: ",pontoCorinthians)
			escreva("\nPalmeiras: ",pontoPalmeiras)
			escreva("\nSantos: ",pontoSantos)
			escreva("\nSão Paulo: ",pontoSpfc)
			escreva("\n\n")
		}
	}

	funcao inteiro retornaPontos (caracter tipo){

		inteiro pontoAtual = 0
		
		se(tipo == 'G' ou tipo == 'g'){
				pontoAtual = 3
			}
			senao se(tipo == 'E' ou tipo == 'e'){
				pontoAtual = 1
			}
			senao {
				pontoAtual = 0
			}
		retorne pontoAtual	
	}
}	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 737; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */