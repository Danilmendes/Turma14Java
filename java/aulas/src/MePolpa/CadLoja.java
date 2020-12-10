package MePolpa;

import java.util.Scanner;

public class CadLoja {
	public static void main(String[] args) {
		
		final int tamanho = 80;
		char opcao,continua;
		
		
		String nome;
		char genero;
		Scanner leia = new Scanner(System.in);
		do {
			linha(tamanho);
			System.out.println("\n\t\t\t\t   Me Polpa");
			System.out.println("\t\tQual a maior loja de polpa do Brasil? Me Polpa né!");
			linha(tamanho);
			
			System.out.println("\n[1] - Comprar produtos");
			System.out.println("[2] - Gerenciar estoques");
			System.out.println("[3] - Sair");
			System.out.println("\nDigite a opção: ");
			opcao = leia.next().charAt(0);
			while(opcao!='1' && opcao!='2' && opcao!='3') {
				System.out.println("Opção incorreto. Digite a opção: ");
				opcao = leia.next().charAt(0);
			}
			if(opcao == '1') {
				leia.nextLine();
				System.out.println("\nDigite seu nome: ");
				nome = leia.nextLine();
				System.out.println("\nDigite seu gênero [1] Masculino,[2] Feminino ou [3] Não-Binário: ");
				genero = leia.next().charAt(0);
				while(genero!='1' && genero!='2' && genero!='3') {
					System.out.println("Valor incorreto. Digite seu gênero [1] Masculino,[2] Feminino ou [3] Não-Binário: ");
					genero = leia.next().charAt(0);
				}
				if(tratamento(genero)=='o') {
					System.out.println("\nSeja bem-vind"+ tratamento(genero) +" a loja senhor "+nome);
				}
				else {
					System.out.println("\nSeja bem-vind"+ tratamento(genero) +" a loja senhor"+tratamento(genero)+" "+nome);
				}
				System.out.println("Você deseja continuar (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
				while(continua!='S' && continua!='N') {
					System.out.println("Opção incorreta. Você deseja continuar (S ou N)? ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			}
			
			else if(opcao == '2') {
				System.out.println("WIP!!!!");
				System.out.println("Você deseja continuar (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
				while(continua!='S' && continua!='N') {
					System.out.println("Opção incorreta. Você deseja continuar (S ou N)? ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			}
			else {
				System.out.println("Obrigado! Volte sempre.");
				continua = 'N';
			}		
		}while(continua=='S');
	}	
	static void linha(int tamanho) {
		for(int x =0; x<tamanho; x++) {
			System.out.print("═");
		}
	}
	public static char tratamento (char genero) {
		
		char pronome;
		
		if(genero == '1') {
			pronome = 'o';
		}
		else if(genero == '2'){
			pronome = 'a';
		}
		else {
			pronome = 'x';
		}
		
		return pronome;
	}
}