programa
{
	
	funcao inicio()
	{	
		cadeia codigo
		inteiro horas, salarioTotal, salarioExcedente   
		const inteiro taxaNormal =10
		const inteiro taxaExcedente = 20

		escreva("Digite seu ID na empresa [C]: ")
		leia(codigo)
		escreva("Digite aqui a quantidade de horas trabalhadas [N]: ")
		leia(horas)

		se (horas>50){
			salarioExcedente = (horas - 50) * taxaExcedente
			salarioTotal = (taxaNormal * 50) + salarioExcedente
			escreva("\nId: " + codigo + "\nSalário Excedente: $" + salarioExcedente + "\nSalário Total: $ " + salarioTotal )	
		}
		senao{
			salarioExcedente = 0
			salarioTotal = taxaNormal * horas
			escreva("\nId: " + codigo + "\nSalário Excedente: $" + salarioExcedente + "\nSalário Total: $ " + salarioTotal )			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 736; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */