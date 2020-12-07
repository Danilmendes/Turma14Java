package Lista1;
import java.util.Scanner;

public class Lista1Ex7 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float a, b, c, d, f, g, x, y;
		System.out.println("--- Calculo do X e do Y ---");
		System.out.println("Exemplo de equação: \n8ax + by = c \ndx + ey = f");

		//Obtendo os índices
		System.out.println("Digite o valor do índice a: ");
		a = leia.nextFloat();
		System.out.println("Digite o valor do índice b: ");
		b = leia.nextFloat();
		System.out.println("Digite o valor do índice c: ");
		c = leia.nextFloat();
		System.out.println("Digite o valor do índice d: ");
		d = leia.nextFloat();
		System.out.println("Digite o valor do índice e: ");
		f = leia.nextFloat();
		System.out.println("Digite o valor do índice f: ");
		g = leia.nextFloat();

		//Cálculo do X
		x = (c*f - b*g) / (a*f - b*d);
		y = (a*g - c*d) / (a*f - b*d);

		System.out.println("O valor de X é " + x + " e o valor de Y é " + y);
		
	}
}
