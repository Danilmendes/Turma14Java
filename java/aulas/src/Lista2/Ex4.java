package Lista2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero,resto;
		
		System.out.println("\nDigite um n�mero (inteiro) : ");
		numero = leia.nextInt();

		resto = (numero % 2);
		
		if(numero < 0){
			if(resto==0){
				System.out.println("O n�mero " + numero + " � par e negativo.");
			}
			else{
				System.out.println("O n�mero " + numero + " � �mpar e negativo.");
			}
		}
		else if(numero == 0){
			System.out.println("O n�mero " + numero + " � neutro." );
		}
		else{	
			 if(resto==0){
				System.out.println("O n�mero " + numero + " � par e positivo.");
			}
			 else{
				System.out.println("O n�mero " + numero + " � �mpar e positivo.");
			}
		}
	}
}
