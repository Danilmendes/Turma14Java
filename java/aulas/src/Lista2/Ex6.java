package Lista2;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;

		System.out.println("Digite a idade do nadador: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <= 7){
			System.out.println("O nadador pertence a categoria: Infantil A");
		}
		else if(idade >= 8 && idade <= 11){
			System.out.println("O nadador pertence a categoria: Infantil B");
		}
		else if(idade >= 12 && idade <= 13){
			System.out.println("O nadador pertence a categoria: Juvenil A");
		}
		else if(idade >= 14 && idade <= 17){
			System.out.println("O nadador pertence a categoria: Juvenil B");
		}
		else if(idade >= 18){
			System.out.println("O nadador pertence a categoria: Maiores de 18 anos");
		}
		else if(idade < 0){
			System.out.println("Idade informada incorreta.");
		}
		else{
			System.out.println("Idade informada abaixo da idade mínima. Ídade Mínima: 5 anos");
		}
	}
}
