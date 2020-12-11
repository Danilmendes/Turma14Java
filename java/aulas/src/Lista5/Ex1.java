package Lista5;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		double valor, valorFinal, parcelas;
		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Ol�, tudo bem? Digite o valor do produto: R$ ");
		valor = leia.nextDouble();
		while (valor <= 0) {
			System.out.println("Op��o incorreta. Digite um valor correto:R$ ");
			valor = leia.nextDouble();
		}
		System.out.println("Qual vai ser a forma de pagamento: ");
		System.out.println("[1] - � vista em dinheiro ou cheque, recebe 20% de desconto");
		System.out.println("[2] - � vista no cart�o de cr�dito, recebe 15% de desconto");
		System.out.println("[3] - Em duas vezes, pre�o normal de etiqueta sem juros ");
		System.out.println("[4] - Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%\n");

		opcao = leia.nextInt();
		while (opcao < 1 || opcao > 4) {
			System.out.println("Op��o incorreta. Digite uma forma de pagamento v�lida [1], [2], [3] ou [4]: ");
			opcao = leia.nextInt();
		}

		switch (opcao) {

		case 1:
			valorFinal = (valor - (0.2 * valor));
			System.out.println("Forma de pagamento escolhida: � vista em dinheiro ou cheque\n");
			System.out.printf("Valor pago: R$ %.2f", valorFinal);
			break;
		case 2:
			valorFinal = (valor - (0.15 * valor));
			System.out.println("\nForma de pagamento escolhida: � vista no cart�o de cr�dito\n");
			System.out.printf("Valor pago: R$ %.2f", valorFinal);
			break;
		case 3:
			parcelas = valor / 2;
			System.out.println("\nForma de pagamento escolhida: Em duas vezes");
			System.out.printf("\nValor das parcelas: R$ %.2f\n", parcelas);
			System.out.printf("\nValor total pago: R$ %.2f", valor);
			break;
		case 4:
			valorFinal = (valor + (valor * 0.1));
			parcelas = valorFinal / 3;
			System.out.println("\nForma de pagamento escolhida: Em tr�s vezes");
			System.out.printf("Valor das parcelas: R$ %.2f\n", parcelas);
			System.out.printf("\nValor total pago: R$ %.2f", valorFinal);
			break;
		}
	}
}
