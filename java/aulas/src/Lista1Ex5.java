import java.util.Scanner;

public class Lista1Ex5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int nota1, nota2, nota3;
		float mediaPonderada;
		
		System.out.println("----Cálculo da media Ponderada----");		
		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("Digite sua segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("Digite sua terceira nota: ");
		nota3 = leia.nextInt();

		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5)/10;

		System.out.println("Sua média é: " + mediaPonderada);
	}
}
