package Lista5;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numerador = 1;
		double soma = 0.0;

		for (int x = 1; x <= 50; x++) {
			soma = soma + (numerador / x);
			if (x == 50) {
				System.out.print(numerador + "/" + x + " = ");
			} else {
				System.out.print(numerador + "/" + x + " + ");
			}
			numerador = numerador + 2;
		}
		System.out.println(soma);
	}
}
