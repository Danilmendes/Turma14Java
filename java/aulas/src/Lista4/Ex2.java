package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		int x, contaMaior = 0, maior = 0;
		int valor[] = new int[10];
		double media, total = 0.0;

		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();

		for (x = 0; x < 10; x++) {
			valor[x] = gerador.nextInt(6) + 1;
			System.out.println("Lan�amento " + (x + 1) + ": " + valor[x]);
			if (valor[x] > maior) {
				maior = valor[x];
			}
			total = total + valor[x];
		}
		System.out.println("");

		for (x = 0; x < 10; x++) {
			if (valor[x] == maior) {
				contaMaior++;
			}
			System.out.printf(valor[x] + " ");
		}
		media = total / 10;
		System.out.printf("\nA m�dia �: %.2f", media);
		System.out.printf("\nN�mero de vezes que o maior resultado apareceu : %d", contaMaior);
	}
}
