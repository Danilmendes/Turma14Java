package Lista5;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		double peso, altura, imc;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu peso em Kg: ");
		peso = leia.nextDouble();
		while (peso <= 0) {
			System.out.println("\nValor incorreto. Digite um valor correto em Kg: ");
			peso = leia.nextDouble();
		}
		System.out.println("Digite a sua altura em M (metros): ");
		altura = leia.nextDouble();
		while (altura < 0.6) {
			System.out.println("Valor incorreto. Digite um valor correto em Kg: ");
			altura = leia.nextDouble();
		}

		imc = peso / (Math.pow(altura, 2));

		if (imc < 18.5) {
			System.out.println("A partir do IMC: Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("A partir do IMC: Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("A partir do IMC: Acima do peso");
		} else {
			System.out.println("A partir do IMC: Obeso");
		}
	}
}
