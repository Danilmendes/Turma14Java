package Lista3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		double numero = 0.0, total =0.0, contador = 0.0, media = 0.0;
		Scanner leia = new Scanner(System.in);
	
		while(numero >= 0){
			System.out.println("Digite um n�mero: ");
			numero = leia.nextDouble();
			if(numero < 0){
				break;
			}
			else{
				contador++;
				total = total + numero;
			}
		}
		media = total / contador;
		System.out.println("\nSomat�rio: "+total);
		System.out.println("\nM�dia: "+ media);
		System.out.println("\nTotal de valores lidos: "+ contador);
	}
}
