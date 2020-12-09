package Lista3;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = leia.nextInt();		
		while(numero <= 0){
			System.out.println("Valor incorreto. Digite um número maior que 0: ");
			numero = leia.nextInt();
		}
		while(numero<=100){
			System.out.println("\n"+numero);
			numero = numero * 3;		
		}	
	}
}
