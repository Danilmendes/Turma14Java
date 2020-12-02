programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro x , contaMaior = 0, valor[10], maior = 0
		real media, total = 0.0 

		para(x=0 ; x < 10 ; x++){
			valor[x] = Util.sorteia(1, 6)
			escreva("Lançamento ",x+1,": ",valor[x],"\n")
			
			
			se ( valor[x] > maior ){
				maior = valor[x]
			}
						
			total = total + valor[x]
		}

		escreva("\n")
		
		para (x=0 ; x<10 ; x++){

			se (valor[x] == maior){
				contaMaior++
			}
		
			escreva(valor[x]," ")
		}

		
		media = total / 10
		
		escreva("\nA média é: ",media)
		escreva("\nNúmero de vezes que o maior resultado apareceu : ",contaMaior)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */