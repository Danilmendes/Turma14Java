package Lista2;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double variavel;

		System.out.println("Digite o valor da vari�vel N: ");
		variavel = leia.nextDouble();
		
		if( variavel > 100 ){
			System.out.println("O valor da vari�vel �: " + variavel);
		}
		else{
			variavel = 0;
			System.out.println("O valor da vari�vel �: " + variavel);
		}
	}
}