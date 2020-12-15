import java.util.Scanner;

public class LojaLoka {
	public static void main(String[] args) {
		
		int produto;
		int quantidade;
		
		Scanner leia = new Scanner(System.in);
		Pessoa clienteAvulso = new Pessoa();
		
		clienteAvulso.nome = "EDNILSON";
		clienteAvulso.genero = 'M';
		clienteAvulso.anoNascimento = 1974;
		
		Produto vestido = new Produto("Vestido",3,100.00);
		Produto blusa = new Produto("blusa",1,50.00);
		Produto camisa = new Produto("camisa",20,20.00);

		System.out.println("Bom dia, digite o seu nome: ");
		clienteAvulso.nome = leia.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O");
		clienteAvulso.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.printf("Bom dia %s !!!\n", clienteAvulso.nome);
		System.out.println("PRODUTO DISPONIVEL NO MOMENTO:");
	    System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", vestido.produto, vestido.qtde, vestido.valorUnitario);
	    System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", blusa.produto, blusa.qtde, blusa.valorUnitario);
	    System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", camisa.produto, camisa.qtde, camisa.valorUnitario);
		System.out.println("\nDigite o produto que você deseja comprar: ");
		System.out.printf("[1] - %s\n",vestido.produto);
		System.out.printf("[2] - %s\n",blusa.produto);
		System.out.printf("[3] - %s\n",camisa.produto);
		produto = leia.nextInt();
		System.out.println("Digite a quantidade que deseja comprar: ");
		quantidade = leia.nextInt();
		if(produto==1) {
			if(vestido.qtde>=quantidade) { 
				System.out.printf("Valor total: R$ %.2f",vestido.valorFinal(quantidade));	
			}else{
				System.out.println("Valor incorreto!");
			}
		}
		else if(produto == 2) {
			if(vestido.qtde>=quantidade) { 
				System.out.printf("Valor total: R$ %.2f",blusa.valorFinal(quantidade));
			}else {
				System.out.println("Valor incorreto!");
			}
		}
		else if(produto == 3) {
			if(vestido.qtde>=quantidade) { 
				System.out.printf("Valor total: R$ %.2f",blusa.valorFinal(quantidade));
			}else {
				System.out.println("Valor incorreto!");
			}
	}
}
}