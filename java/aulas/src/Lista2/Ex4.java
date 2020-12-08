package Lista2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero,resto;
		
		System.out.println("\nDigite um número (inteiro) : ");
		numero = leia.nextInt();

		resto = (numero % 2);
		
		if(numero < 0){
			if(resto==0){
				System.out.println("O número " + numero + " é par e negativo.");
			}
			else{
				System.out.println("O número " + numero + " é ímpar e negativo.");
			}
		}
		else if(numero == 0){
			System.out.println("O número " + numero + " é neutro." );
		}
		else{	
			 if(resto==0){
				System.out.println("O número " + numero + " é par e positivo.");
			}
			 else{
				System.out.println("O número " + numero + " é ímpar e positivo.");
			}
		}
	}
}
