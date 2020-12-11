package Lista5;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		double valor, valorFinal, parcelas;
		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Olá, tudo bem? Digite o valor do produto: R$ ");
		valor = leia.nextDouble();
		while (valor <= 0) {
			System.out.println("Opção incorreta. Digite um valor correto:R$ ");
			valor = leia.nextDouble();
		}
		System.out.println("Qual vai ser a forma de pagamento: ");
		System.out.println("[1] - À vista em dinheiro ou cheque, recebe 20% de desconto");
		System.out.println("[2] - À vista no cartão de crédito, recebe 15% de desconto");
		System.out.println("[3] - Em duas vezes, preço normal de etiqueta sem juros ");
		System.out.println("[4] - Em três vezes, preço normal de etiqueta mais juros de 10%\n");

		opcao = leia.nextInt();
		while (opcao < 1 || opcao > 4) {
			System.out.println("Opção incorreta. Digite uma forma de pagamento válida [1], [2], [3] ou [4]: ");
			opcao = leia.nextInt();
		}

		switch (opcao) {

		case 1:
			valorFinal = (valor - (0.2 * valor));
			System.out.println("Forma de pagamento escolhida: À vista em dinheiro ou cheque\n");
			System.out.printf("Valor pago: R$ %.2f", valorFinal);
			break;
		case 2:
			valorFinal = (valor - (0.15 * valor));
			System.out.println("\nForma de pagamento escolhida: À vista no cartão de crédito\n");
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
			System.out.println("\nForma de pagamento escolhida: Em três vezes");
			System.out.printf("Valor das parcelas: R$ %.2f\n", parcelas);
			System.out.printf("\nValor total pago: R$ %.2f", valorFinal);
			break;
		}
	}
}
