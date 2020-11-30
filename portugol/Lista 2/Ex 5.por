programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Digite o valor do índice de poluição: ")
		leia(indicePoluicao)

		se (indicePoluicao >= 0.3){
			se (indicePoluicao >= 0.4){
				se (indicePoluicao >= 0.5){
					escreva("\nValor do índice de poluíção: " + indicePoluicao + "\nAs atividades das empresas de todos os grupo devem ser suspensas.")	
				}
				senao{
					escreva("\nValor do índice de poluíção: " + indicePoluicao + "\nAs atividades das empresas do 1º e do 2º grupo devem ser suspensas.")
				}
			}
			senao{
				escreva("\nValor do índice de poluíção: " + indicePoluicao + "\nAs atividades das empresas do 1º grupo devem ser suspensas.")
			}
		}
		senao se (indicePoluicao <0){
			escreva("Valor incorreto. Digite um valor válido")
		}
		senao{
			escreva("\nValor do índice de poluíção: " + indicePoluicao + "\níndice de poluição aceitável")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */