package Lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double peso, excesso, multa;
		final int taxaExcedente = 4;

		System.out.println("Olá João, quantos quilos de tomate você trouxe: ");
		peso = leia.nextDouble();

		if (peso > 50){
			excesso = peso - 50;
			multa = excesso * taxaExcedente;
			System.out.printf("Você trouxe [P]: " + peso +" Kg \nExcesso gerado [E]: " + excesso + " Kg\nMulta [M]: R$ %.2f", multa);
		}
		else{			
			excesso = 0;
			multa = 0;
			System.out.printf("Você trouxe [P]: " + peso +" Kg \nExcesso [E]: " + excesso + " Kg\nMulta [M]: $ %.2f", multa);
		}
	}

}
