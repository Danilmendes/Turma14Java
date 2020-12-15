package Lista6;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantidade;
		
		
		ProdutoEletronico celular = new ProdutoEletronico("Iphone x","Celular",20.00);
		System.out.println("---------------");
		System.out.println(" Loja do Dan");
		System.out.println("---------------");
		System.out.println("Lista de produtos : ");
		System.out.printf("%s \t%s \tR$ %.2f\n", celular.produto,celular.categoria,celular.preco);
		System.out.println("Digite a quantidade que você deseja: ");
		quantidade = leia.nextInt();
		System.out.printf("Valor total: R$ %.2f", celular.valorFinal(quantidade));
		
	}
}
