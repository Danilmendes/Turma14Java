programa
{
	
	funcao inicio()
	{
		inteiro numerador=1
		real soma=0.0

		para(inteiro x=1 ; x<=50; x++){
			soma = soma + (numerador/x)
			se(x == 50){
				escreva(numerador,"/",x," = ")
			}
			senao{	
				escreva(numerador,"/",x," + ")
			}
			numerador= numerador + 2			
		}

		escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */