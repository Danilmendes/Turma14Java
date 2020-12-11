package Lista5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		double numero = 0.0;
		int intervalo[] = { 0, 0, 0, 0, 0 };

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextDouble();
			if (numero >= 0 && numero <= 25) {
				intervalo[0]++;
			} else if (numero >= 26 && numero <= 50) {
				intervalo[1]++;
			} else if (numero >= 51 && numero <= 75) {
				intervalo[2]++;
			} else if (numero >= 76 && numero <= 100) {
				intervalo[3]++;
			}

			else if (numero > 100) {
				intervalo[4]++;
			}
		} while (numero >= 0);
		System.out.println("\nQuandidade de números no intervalo [0 - 25]: " + intervalo[0]);
		System.out.println("Quandidade de números no intervalo [26 - 50]: " + intervalo[1]);
		System.out.println("Quandidade de números no intervalo [51 - 75]: " + intervalo[2]);
		System.out.println("Quandidade de números no intervalo [76 - 100]: " + intervalo[3]);
		System.out.println("Quandidade de números acima de 100: " + intervalo[4]);
	}
}
