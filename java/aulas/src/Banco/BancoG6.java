package Banco;

import java.util.Scanner;

public class BancoG6 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		final int tamanho = 80;
		char tipoConta, continuar;
		double saldoConta;
		char a = ' ';
		
		saldoConta = 0.0;
		do {
			linha(tamanho);
			System.out.println("\n\t\t\t\tApp G6 Bank");
			linha(tamanho);
			System.out.println("\nServiços Disponíveis");
			System.out.println("\n[1] - Conta Poupança");
			System.out.println("[2] - Conta Corrente");
			System.out.println("[3] - Conta Especial");
			System.out.println("[4] - Conta Empresa");
			System.out.println("[5] - Conta Universitária");
			System.out.println("[6] - Sair");
			System.out.println("\nDigite a opção: ");
			tipoConta = leia.next().charAt(0);
			while (tipoConta != '1' && tipoConta != '2' && tipoConta != '3' && tipoConta != '4' && tipoConta != '5'
					&& tipoConta != '6') {
				System.out.println("\nOpção inválida. Digite a opção: ");
				tipoConta = leia.next().charAt(0);
			}
			if (tipoConta == '1') {

			} else if (tipoConta == '2') {
				a = contaCorrente(saldoConta);
			} else if (tipoConta == '2') {

			} else if (tipoConta == '3') {

			} else if (tipoConta == '4') {

			} else if (tipoConta == '5') {

			} else {
				a = 'S';
			}
		} while (a == 'N');

	}

	static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("═");
		}
	}
	static char contaCorrente(double saldoConta) {

		double movimentoConta;
		int maxMovimentacoes = 2, numConta;
		char status, continuar = ' ';

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número da conta: ");
		numConta = leia.nextInt();
		System.out.printf("Seu saldo atual é: %.2f", saldoConta);
		do {
			for (int x = 0; x < maxMovimentacoes; x++) {
				System.out.println("\n\nTransação " + (x + 1));
				if (saldoConta == 0) {
					System.out.println("Quanto você quer depositar: R$ ");
					movimentoConta = leia.nextDouble();
					while (movimentoConta < 0) {
						System.out.println("\nValor inválido. Quanto você quer depositar: R$ ");
						movimentoConta = leia.nextDouble();
					}
					saldoConta = saldoConta + movimentoConta;
					System.out.printf("Saldo atual: R$ %.2f", saldoConta);
				} else {
					System.out.println("\nVocê quer Creditar (C) ou Debitar (D) da conta? ");
					status = leia.next().toUpperCase().charAt(0);
					while (status != 'C' && status != 'D') {
						System.out.println("\nOpção inválida. Você quer Creditar (C) ou Debitar (D) da conta? ");
						status = leia.next().toUpperCase().charAt(0);
					}
					if (status == 'C') {
						System.out.println("Quanto você quer depositar: R$ ");
						movimentoConta = leia.nextDouble();
						while (movimentoConta < 0) {
							System.out.println("\nValor inválido. Quanto você quer depositar: R$ ");
							movimentoConta = leia.nextDouble();
						}
						saldoConta = saldoConta + movimentoConta;
						System.out.printf("Saldo atual: R$ %.2f", saldoConta);
					} else {
						System.out.println("Quanto você quer retirar: R$ ");
						movimentoConta = leia.nextDouble();
						while (movimentoConta < 0 || movimentoConta > saldoConta) {
							System.out.println("\nValor inválido. Quanto você quer retirar: R$ ");
							movimentoConta = leia.nextDouble();
						}
						saldoConta = saldoConta - movimentoConta;
						System.out.printf("Saldo atual: R$ %.2f", saldoConta);
					}
				}
			}
			System.out.println("\nVocê deseja continuar (S ou N)? ");
			continuar = leia.next().toUpperCase().charAt(0);
			while (continuar != 'S' && continuar != 'N') {
				System.out.println("\nOpção inválida. Deseja continuar? ");
				continuar = leia.next().toUpperCase().charAt(0);
			}
		} while (continuar == 'S');
		return continuar;
	}
}