package Lista2;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double indicePoluicao;

		System.out.println("Digite o valor do �ndice de polui��o: ");
		indicePoluicao = leia.nextDouble();

		if(indicePoluicao >= 0.3){
			if(indicePoluicao >= 0.4){
				if(indicePoluicao >= 0.5){
					System.out.println("\nValor do �ndice de polu���o: " + indicePoluicao + "\nAs atividades das empresas de todos os grupo devem ser suspensas.");	
				}
				else{
					System.out.println("\nValor do �ndice de polu���o: " + indicePoluicao + "\nAs atividades das empresas do 1� e do 2� grupo devem ser suspensas.");
				}
			}
			else{
				System.out.println("\nValor do �ndice de polu���o: " + indicePoluicao + "\nAs atividades das empresas do 1� grupo devem ser suspensas.");
			}
		}
		else if(indicePoluicao <0){
			System.out.println("Valor incorreto. Digite um valor v�lido");
		}
		else{
			System.out.println("\nValor do �ndice de polu���o: " + indicePoluicao + "\n�ndice de polui��o aceit�vel");	
		}
	}
}
