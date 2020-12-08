import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite o seu ano de nascimento: ");
		ano = leia.nextInt();
		if(idade(ano) < 18) {
			System.out.println("Oi, você tem "+idade(ano)+" anos e é considerado infanto-juvenil.");	
		}
		else if(idade(ano) >= 18 && idade(ano)<=60) {
			System.out.println("Oi, você tem "+idade(ano)+" anos e é considerado adulto.");
		}
		else {
			System.out.println("Oi, você tem "+idade(ano)+" anos e é considerado idoso.");
		}	
	}
	static int idade(int ano) {
		
		int idade;
		int anoAtual=2020;
		
		idade = anoAtual - ano;
		return idade;		
	}
}
