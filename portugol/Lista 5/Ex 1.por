programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real valor,valorFinal, parcelas
		inteiro opcao

		escreva("Olá, tudo bem? Digite o valor do produto: R$ ")
		leia(valor)
		enquanto(valor <=0){
			escreva("Opção incorreta. Digite um valor correto:R$ ")
			leia(valor)
		}
		escreva("Qual vai ser a forma de pagamento: ")
		escreva("\n[1] - À vista em dinheiro ou cheque, recebe 20% de desconto")
		escreva("\n[2] - À vista no cartão de crédito, recebe 15% de desconto")
		escreva("\n[3] - Em duas vezes, preço normal de etiqueta sem juros ")
		escreva("\n[4] - Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		
		leia(opcao)
		enquanto(opcao <1 ou opcao>4){
			escreva("Opção incorreta. Digite uma forma de pagamento válida [1], [2], [3] ou [4]: ")
			leia(opcao)
		}

		escolha(opcao){
			
			caso 1:
			     valorFinal= (valor - (0.2 * valor))
				escreva("\nForma de pagamento escolhida: À vista em dinheiro ou cheque")
				escreva("\nValor pago: R$ ", mat.arredondar(valorFinal,2))
				pare
			caso 2:
			     valorFinal= (valor - (0.15 * valor))
				escreva("\nForma de pagamento escolhida: À vista no cartão de crédito")
				escreva("\nValor pago: R$ ",  mat.arredondar(valorFinal,2))
				pare
			caso 3:
			     parcelas = valor/ 2
				escreva("\nForma de pagamento escolhida: Em duas vezes")
				escreva("\nValor das parcelas: R$ ",  mat.arredondar(parcelas,2))
				escreva("\nValor total pago: R$ ",  mat.arredondar(valor,2))
				pare		
			caso 4:
				valorFinal= (valor + (valor*0.1))
			     parcelas = valorFinal / 3
				escreva("\nForma de pagamento escolhida: Em três vezes")
				escreva("\nValor das parcelas: R$ ",  mat.arredondar(parcelas,2))
				escreva("\nValor total pago: R$ ",  mat.arredondar(valorFinal,2))
				pare				
							
		}
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1766; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */