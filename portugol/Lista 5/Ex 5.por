programa
{
	
	funcao inicio()
	{
		real vetor[5]
		inteiro codigo

		para(inteiro x=0;x<5;x++){
			escreva("Digite um valor: ")
			leia(vetor[x])
		}
		limpa()
		escreva("---Digite um código---")
		escreva("\n1 - Ordem direta do vetor")
		escreva("\n2 - Ordem inversa do vetor\n")
		leia(codigo)
		enquanto(codigo<1 ou codigo>2){
			escreva("Opção incorreta. Digite um valor [1] ou [2]: ")
			leia(codigo)		
		}
		se(codigo == 1){
			escreva("[ ")
			para(inteiro x=0;x<5;x++){
				escreva(vetor[x]," ")
			}
			escreva("]")
		}
		senao{
			escreva("[ ")
			para(inteiro x=4;x>=0;x--){
				escreva(vetor[x]," ")
			}
			escreva("]")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */