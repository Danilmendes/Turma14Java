programa
{
	
	funcao inicio()
	{
		cadeia nomePessoa //nome da variável
		inteiro anoPessoa, idade
		const inteiro anoAtual = 2020
		

		//Obter nome da pessoa
		escreva("Digite o nome da pessoa: ")
		leia (nomePessoa)

		//Obter ano de nascimento da pessoa e fazer o cálculo
		escreva("Digite o Seu ano de nascimento: ")
		leia (anoPessoa)
		idade = anoAtual - anoPessoa

		
		escreva("\nOi "+ nomePessoa + " estamos na Generation. \nSua idade aproximada é: " + idade +" anos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 98; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */