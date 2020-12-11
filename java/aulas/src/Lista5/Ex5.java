package Lista5;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double vetor[] = new double[5];
		int codigo;
		
		for(int x=0;x<5;x++){
			System.out.println("Digite um valor: ");
			vetor[x] = leia.nextDouble();
		}
		System.out.println("---Digite um código---");
		System.out.println("1 - Ordem direta do vetor");
		System.out.println("2 - Ordem inversa do vetor\n");
		codigo = leia.nextInt();
		while(codigo<1 || codigo>2){
			System.out.println("Opção incorreta. Digite um valor [1] ou [2]: ");
			codigo = leia.nextInt();	
		}
		if(codigo == 1){
			System.out.print("[ ");
			for(int x=0;x<5;x++){
				System.out.print(vetor[x]+" ");
			}
			System.out.print("]");
		}
		else{
			System.out.print("[ ");
			for(int x=4;x>=0;x--){
				System.out.print(vetor[x]+" ");
			}
			System.out.print("]");
		}
	}
}
