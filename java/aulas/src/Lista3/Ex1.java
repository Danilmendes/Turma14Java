package Lista3;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		int pessoa, totalFilhos = 0, mediaFilhos=0, filhos;
		final int HABITANTES = 2;
		double salario, maiorSalario = 0.0 ,mediaSalario = 0.0, totalSalario = 0.0; 
		double percentual=0.0 , percentualTotal;
		
		Scanner leia = new Scanner(System.in);
		
		for(pessoa=1; pessoa<=HABITANTES ; pessoa++){
			System.out.println("Digite aqui o seu salário: $ ");
			salario = leia.nextDouble();
			while(salario < 0){
				System.out.println("Valor incorreto. Digite novamente o seu salario: $ ");
				salario = leia.nextDouble();
			}
			System.out.println("Digite aqui quantos filhos você tem: ");
			filhos = leia.nextInt();	
			while (filhos < 0){
				System.out.println("Valor incorreto. Digite novamente o número de filhos:  ");
				filhos = leia.nextInt();
			}
			
			
			totalSalario = totalSalario + salario;
			totalFilhos = totalFilhos + filhos;
			
			//verificação maior salario
			if (salario > maiorSalario){
				maiorSalario = salario; 
			}

			//Número de pessoas com salário até $100
			if (salario<=100){
				percentual++;
			}
		}

		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		percentualTotal = percentual * 100 / HABITANTES;

		System.out.println("Média de salário da população: $ "+ mediaSalario);
		System.out.println("Média do número de filhos: "+ mediaFilhos);
		System.out.println("Maior salário: R$ "+ maiorSalario);
		System.out.printf("Percentual de pessoas com salário até $ 100 : %.2f porcento",percentualTotal);
	}
}
