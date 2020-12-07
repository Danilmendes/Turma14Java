package Lista1;
import java.util.Scanner;

public class Lista1Ex4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int A,B,C;
		double R, S, D;
		

		System.out.println("Digite o primeiro valor (positivo e inteiro): ");
		A = leia.nextInt();
		System.out.println("Digite o segundo valor (positivo e inteiro): ");
		B = leia.nextInt();
		System.out.println("Digite o terceiro valor (positivo e inteiro): ");
		C = leia.nextInt();

		R = Math.pow(A+B, 2);
	    S = Math.pow(B + C, 2);
	    D = (R + S) / 2;

	    System.out.println("O resultado é: " + D);
	}
}
