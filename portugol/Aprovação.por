programa
{
	
	funcao inicio()
	{
		inteiro nota
		caracter genero

		escreva("Olá! Tudo bem? Você prefere ser chamado como [o] ou [a] ? ")
		leia (genero)
		escreva("Digite a sua nota: ")
		leia (nota)
		
			se ( genero == 'a' ){
			     se (nota > 5 e nota <= 10){
					escreva("Sua nota foi "+ nota + " , você foi aprovada")
				}
				senao se ( nota <= 5){
					escreva("Sua nota foi "+ nota + " , você foi reprovada")
				}
				senao{
					escreva("Nota digitada incorreta")
				}
			}
			senao se ( genero == 'o' ){
				se (nota > 5 e nota <= 10){
					escreva("Sua nota foi "+ nota + " , você foi aprovado")
				}
				senao se ( nota <= 5){
					escreva("Sua nota foi "+ nota + " , você foi reprovado")
				}
				senao{
					escreva("Nota digitada incorreta")
				}
			}
			senao{
			escreva("Digite a letra (o) ou (a) para funcionar corretamente.")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 861; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */