package Lista2;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double base, altura, area;

		System.out.println("Digite o valor da base do tri�ngulo em cm: ");
		base = leia.nextDouble();
		System.out.println("Digite o valor da altura do tri�ngulo em cm: ");
		altura = leia.nextDouble();
		
		if( base > 0 && altura > 0 ){
			area = (base * altura)/2;	
			System.out.println("\nA �rea do tri�ngulo �: " + area + " cm�" );		
		}
		else{
			System.out.println("Valor informado incorreto. Digite n�meros positivos maiores que 0.");
		}
	}
}
