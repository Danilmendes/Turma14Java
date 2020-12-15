package MePolpa;

import java.util.Scanner;

public class CadLoja {
	public static <valor> void main(String[] args) {

		final int tamanho = 80;
		double valorTotal = 0;
		char opcao, continua, continuaCompra;
		int qtdProdutos = 10, quantidadeCompra, produtoCompra;
		String codigo[] = new String[qtdProdutos];
		String produto[] = { "Abacate", "Abacaxi", "Acerola", "Ameixa", "Cupuaçu", "Goiaba", "Graviola", "Mangaba",
				"Morango", "Pitanga" };
		double preco[] = { 12.00, 8.00, 8.00, 10.00, 10.00, 8.00, 9.00, 8.00, 15.00, 8.00 };
		int quantidade[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int carrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		String nome, compararProduto;
		char genero;

		Scanner leia = new Scanner(System.in);

		do {
			linha(tamanho);
			System.out.println("\n\t\t\t\t   Me Polpa");
			System.out.println("\t\t\tA maior loja de polpa do Brasil!");
			linha(tamanho);

			System.out.println("\n[1] - Comprar produtos");
			System.out.println("[2] - Gerenciar estoques");
			System.out.println("[3] - Sair");
			System.out.println("\nDigite a opção: ");
			opcao = leia.next().charAt(0);
			while (opcao != '1' && opcao != '2' && opcao != '3') {
				System.out.println("Opção incorreto. Digite a opção: ");
				opcao = leia.next().charAt(0);
			}
			if (opcao == '1') {
				leia.nextLine();
				System.out.println("\nDigite seu nome: ");
				nome = leia.nextLine();
				System.out.println("\nDigite seu gênero [1] Masculino,[2] Feminino ou [3] Não-Binário: ");
				genero = leia.next().charAt(0);
				while (genero != '1' && genero != '2' && genero != '3') {
					System.out.println(
							"Valor incorreto. Digite seu gênero [1] Masculino,[2] Feminino ou [3] Não-Binário: ");
					genero = leia.next().charAt(0);
				}
				if (tratamento(genero) == 'o') {
					System.out.println("\n\t\t   Seja bem-vind" + tratamento(genero) + " a loja senhor " + nome);
				} else {
					System.out.println("\n\t\t   Seja bem-vind" + tratamento(genero) + " a loja senhor"
							+ tratamento(genero) + " " + nome);
				}

				linha(tamanho);
				System.out.println("\n\t\t\t   Lista de Produtos");
				linha(tamanho);
				System.out.println("\nCódigo\t\tPreço\t     Quantidade\t\tProduto");
				for (int i = 0; i < qtdProdutos; i++) {
					if (i < 9) {
						codigo[i] = "MP-00" + (i + 1);
					} else {
						codigo[i] = "MP-0" + (i + 1);
					}
					System.out.printf("\n%s\t\t%.2f\t\t%d\t\t%s\n", codigo[i], preco[i], quantidade[i], produto[i]);
				}
				do {
					System.out.println("\nDigite o código do produto que será comprado: ");
					produtoCompra = leia.nextInt();
					if (produtoCompra < 10) {
						compararProduto = "MP-00" + (produtoCompra);
					} else {
						compararProduto = "MP-0" + (produtoCompra);
					}
					System.out.println("Digite a quantidade: ");
					quantidadeCompra = leia.nextInt();
					while(quantidadeCompra<0) {
						System.out.println("Valor incorreto. Digite a quantidade: ");
						quantidadeCompra = leia.nextInt();
					}
					for (int i = 0; i < qtdProdutos; i++) {
						if (compararProduto.equals(codigo[i])) {
							if(quantidade[i]>=quantidadeCompra) {
								carrinho[i] = carrinho[i]+quantidadeCompra;
								valorTotal = valorTotal + (quantidadeCompra * preco[i]);
								quantidade[i] = quantidade[i] - quantidadeCompra;
							}
							else {
								System.out.printf("Quantidade pedida maior que o estoque. Estoque disponível: %d",quantidade[i]);
							}
						}
					}
					System.out.print("\n\nVocê deseja comprar mais algum produto (S ou N)? ");
					continuaCompra = leia.next().toUpperCase().charAt(0);
					while (continuaCompra != 'S' && continuaCompra != 'N') {
						System.out.print("\nOpção incorreta. Você deseja comprar mais algum produto (S ou N)? ");
						continuaCompra = leia.next().toUpperCase().charAt(0);
					}
				} while (continuaCompra == 'S');
				linha(tamanho);
				System.out.println("\n\t\t\t   CUPOM FISCAL");
				System.out.println("CÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
				linha(tamanho);
				for (int i = 0; i < qtdProdutos; i++) {
					if (carrinho[i] > 0) {
						System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", codigo[i], produto[i], carrinho[i],
								preco[i], preco[i] * carrinho[i]);
					}
				}
				linha(tamanho);
				System.out.printf("\n\t\t\t\t\t    VL. TOTAL R$ %.2f\n", valorTotal);
				linha(tamanho);
				System.out.print("\n\nVocê deseja voltar para o menu (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
				while (continua != 'S' && continua != 'N') {
					System.out.print("\nOpção incorreta. Você deseja voltar para o menu (S ou N)? ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			} else if (opcao == '2') {
				System.out.println("WIP");
				System.out.println("\nVocê deseja voltar para o menu (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
				while (continua != 'S' && continua != 'N') {
					System.out.print("Opção incorreta. Você deseja voltar para o menu (S ou N)? ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			} else {
				System.out.printf("Obrigado! Volte sempre.");
				continua = 'N';
			}
		} while (continua == 'S');
		System.out.printf("Obrigado! Volte sempre.");
	}

	static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("═");
		}
	}

	public static char tratamento(char genero) {

		char pronome;

		if (genero == '1') {
			pronome = 'o';
		} else if (genero == '2') {
			pronome = 'a';
		} else {
			pronome = 'x';
		}

		return pronome;
	}
}