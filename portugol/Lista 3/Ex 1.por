programa
{
	inclua biblioteca Matematica --> mat
	 
	funcao inicio()
	{

		inteiro pessoa, totalFilhos = 0, mediaFilhos=0, filhos
		const inteiro HABITANTES = 20
		real salario, maiorSalario = 0.0 ,mediaSalario = 0.0, totalSalario = 0.0 
		real percentual=0.0 , percentualTotal
		
		para (pessoa=1; pessoa<=HABITANTES ; pessoa++){
			limpa()
			escreva("Digite aqui o seu salário: $ ")
			leia(salario)
			enquanto (salario < 0){
				escreva("Valor incorreto. Digite novamente o seu salario: $ ")
				leia(salario)
			}
			escreva("Digite aqui quantos filhos você tem: ")
			leia (filhos)	
			enquanto (filhos < 0){
				escreva("Valor incorreto. Digite novamente o número de filhos:  ")
				leia(filhos)
			}
			
			
			totalSalario = totalSalario + salario
			totalFilhos = totalFilhos + filhos
			
			//verificação maior salario
			se (salario > maiorSalario){
				maiorSalario = salario 
			}

			//Número de pessoas com salário até $100
			se (salario<=100){
				percentual++
			}
	
		}

		mediaSalario = totalSalario / HABITANTES
		mediaFilhos = totalFilhos / HABITANTES
		percentualTotal = percentual * 100 / HABITANTES

		limpa()
		escreva("\nMédia de salário da população: $ ",mediaSalario)
		escreva("\nMédia do número de filhos: ",mediaFilhos)
		escreva("\nMaior salário: $ ", maiorSalario)
		escreva("\nPercentual de pessoas com salário até $ 100 : ",mat.arredondar(percentualTotal, 2)," % ")
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 979; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */