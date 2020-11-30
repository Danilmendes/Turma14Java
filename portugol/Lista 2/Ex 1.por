programa
{
	
	funcao inicio()
	{
		real peso, excesso, multa
		const real taxaExcedente = 4.0

		escreva("Olá João, quantos quilos de tomate você trouxe: ")
		leia(peso)

		se (peso > 50){
			excesso = peso - 50
			multa = excesso * taxaExcedente
			escreva("Você trouxe [P]: " + peso +" Kg \nExcesso gerado [E]: " + excesso + " Kg\nMulta [M]: $ "+ multa)
		}
		
		senao{
			
			excesso = 0
			multa = 0
			escreva("Você trouxe [P]: " + peso +" Kg \nExcesso [E]: " + excesso + " Kg\nMulta [M]: $ "+ multa)
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */