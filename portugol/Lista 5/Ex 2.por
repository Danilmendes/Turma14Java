programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real peso, altura, imc

		escreva("Digite o seu peso em Kg: ")
		leia(peso)
		enquanto(peso <=0){
			escreva("\nValor incorreto. Digite um valor correto em Kg: ")
			leia(peso)
		}
		escreva("\nDigite a sua altura em M (metros): ")
		leia(altura)
		enquanto(altura <0.6){
			escreva("\nValor incorreto. Digite um valor correto em Kg: ")
			leia(altura)
		}

		imc = peso/ (mat.potencia(altura,2))

		se(imc<18.5){
			escreva("\nA partir do IMC: Abaixo do peso")	
		}
		senao se(imc>= 18.5 e imc<25){
			escreva("\nA partir do IMC: Peso normal")
		}
		senao se(imc>= 25 e imc<30){
			escreva("\nA partir do IMC: Acima do peso")
		}
		senao{
			escreva("\nA partir do IMC: Obeso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 558; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */