package Lista6;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao("Gol",250,65707);
		
		int pessoasNoAviao;
		
		System.out.printf("Bem vindo ao voo %d da companhia a�rea %s\n",aviao1.numeroVoo,aviao1.companhia);
		System.out.println("Digite quantas pessoas est�o no avi�o: ");
		pessoasNoAviao = leia.nextInt();
		if(pessoasNoAviao<=aviao1.capacidade) {
			System.out.printf("Faltam %d pessoas no avi�o!",aviao1.embarque(pessoasNoAviao));
		}
		else {
			System.out.println("Valor Incorreto!!");
		}
	}
}
