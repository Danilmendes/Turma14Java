package Lista3;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		int numero ,contador = 1, total= 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		while(numero <= 0){
			System.out.println("Valor incorreto. Digite um n�mero maior que 0: ");
			numero = leia.nextInt();
		}
		do{
			total = total + contador;
			contador++;
		}while(contador<=numero);

		System.out.println("O valor da soma de 1 at� "+numero+" �: "+total);
	}
}
