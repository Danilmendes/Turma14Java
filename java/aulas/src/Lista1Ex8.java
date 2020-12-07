import java.util.Scanner;

public class Lista1Ex8 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float valorInicial;
		double valorFinal;

		System.out.println("---- Preço carro novo ----");			
		System.out.println("Digite o preço inicial do carro: $ ");
		valorInicial = leia.nextFloat();
		valorFinal = valorInicial + (valorInicial * 0.28) + (valorInicial * 0.45);
		System.out.println("O valor do carro novo é: R$ " + valorFinal);
	}
}
