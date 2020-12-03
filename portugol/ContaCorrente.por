programa
{
	inclua biblioteca Internet
	inclua biblioteca Texto
	inclua biblioteca Util
	
	funcao inicio()
	{
		real saldoConta = 0.0 , movimentoConta[10]
		caracter operacao,verificacaoTalao, continuar
		inteiro numeroTalao = 0, numeroConta
		cadeia cpfConta = "059.326.060-02"
		
		
		escreva("Bem vindo ao App G6 Bank")
		numeroConta = Util.sorteia(1,30)		
		escreva("\nNúmero da conta: ",numeroConta)
		escreva("\nNúmero do CPF: ",cpfConta)

		faca{
			para(inteiro x=0 ; x<2 ; x++){
				escreva("\nVocê vai [C]creditar ou [D]debitar? ")
				leia(operacao)
				
				enquanto (operacao != 'c' e operacao != 'C' e operacao != 'd' e operacao != 'D'){
					escreva("\nOperação incorreta. Digite [C] para creditar ou [D] para debitar? ")
					leia(operacao)				
				}
							
				escreva("\nDigite o valor: $ ")
				leia(movimentoConta[x])
	
				enquanto (movimentoConta[x]<0){
					escreva("\nOperação incorreta. Digite um valor válido: $ ")
					leia(movimentoConta[x])				
				}				
				
				se(operacao == 'c' ou operacao == 'C' ){
					saldoConta = saldoConta + movimentoConta[x]
				}
				
				senao{
					se(saldoConta < movimentoConta[x]){
						escreva("\nErro: valor para débito maior que o seu saldo. Saldo Atual: $",saldoConta)
					}
					senao{
						movimentoConta[x]= -movimentoConta[x]
						saldoConta = saldoConta + movimentoConta[x]
					}
				}
			}
			escreva("Você deseja imprimar um talão de cheque [S] ou [N]? ")
			leia(verificacaoTalao)
	
			enquanto (verificacaoTalao != 's' e verificacaoTalao != 'S' e verificacaoTalao != 'n' e verificacaoTalao != 'n'){
					escreva("\nOperação incorreta. Digite [S] para continuar ou [N] para parar? ")
					leia(verificacaoTalao)				
			}
			
			se(verificacaoTalao == 's' ou verificacaoTalao =='S'){
				numeroTalao++
			}
			
			limpa()
			escreva("Seu saldo é: $",saldoConta)
			escreva("\nNúmero de talões de cheque impressos: ",numeroTalao)
			escreva("\nVocê deseja continuar [S] ou [N]? ")
			leia(continuar)
	
			enquanto (continuar != 's' e continuar != 'S' e continuar != 'n' e continuar != 'n'){
					escreva("\nOperação incorreta. Digite [S] para continuar ou [N] para parar? ")
					leia(continuar)				
				}
		}enquanto(continuar =='s' ou continuar =='S')
		
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */