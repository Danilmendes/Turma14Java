programa
{
	
	funcao inicio()
	{
		caracter tratamento
		cadeia disciplinas[4], nome
		inteiro notas[4], x

		escreva ("Digite seu nome: ")
		leia (nome)
		escreva("Você prefere ser chamado como (o) ou (a)? ")
		leia(tratamento)
		enquanto(tratamento != 'o' e tratamento != 'a'){
			escreva("Você escreveu incorretamente. Digite (o) ou (a): ")
			leia(tratamento)
		}
		
		para(x=0 ; x<4 ; x++){
			
			escreva("Digite a disciplina: ")
			leia(disciplinas[x])
			escreva("Digite a nota nesta disciplina: ")
			leia(notas[x])
		}

		limpa()
		escreva("Notas d",tratamento," ", nome, ":")
		
		para(x=0 ; x<4 ; x++){
			escreva("\n\nDisciplina: ",disciplinas[x],"|| Nota: ",notas[x])
			se(notas[x]<=5){
				
				escreva("\nVocê foi reprovad",tratamento," nesta matéria")
			}
			senao{
				
				escreva("\nVocê foi aprovad",tratamento," nesta matéria")			
			}
			  
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */