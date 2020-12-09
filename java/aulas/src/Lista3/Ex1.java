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
			System.out.println("Digite aqui o seu sal�rio: $ ");
			salario = leia.nextDouble();
			while(salario < 0){
				System.out.println("Valor incorreto. Digite novamente o seu salario: $ ");
				salario = leia.nextDouble();
			}
			System.out.println("Digite aqui quantos filhos voc� tem: ");
			filhos = leia.nextInt();	
			while (filhos < 0){
				System.out.println("Valor incorreto. Digite novamente o n�mero de filhos:  ");
				filhos = leia.nextInt();
			}
			
			
			totalSalario = totalSalario + salario;
			totalFilhos = totalFilhos + filhos;
			
			//verifica��o maior salario
			if (salario > maiorSalario){
				maiorSalario = salario; 
			}

			//N�mero de pessoas com sal�rio at� $100
			if (salario<=100){
				percentual++;
			}
		}

		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		percentualTotal = percentual * 100 / HABITANTES;

		System.out.println("M�dia de sal�rio da popula��o: $ "+ mediaSalario);
		System.out.println("M�dia do n�mero de filhos: "+ mediaFilhos);
		System.out.println("Maior sal�rio: R$ "+ maiorSalario);
		System.out.printf("Percentual de pessoas com sal�rio at� $ 100 : %.2f porcento",percentualTotal);
	}
}
