package Lista1;
import java.util.Scanner;

public class Lista1Ex7 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float a, b, c, d, f, g, x, y;
		System.out.println("--- Calculo do X e do Y ---");
		System.out.println("Exemplo de equa��o: \n8ax + by = c \ndx + ey = f");

		//Obtendo os �ndices
		System.out.println("Digite o valor do �ndice a: ");
		a = leia.nextFloat();
		System.out.println("Digite o valor do �ndice b: ");
		b = leia.nextFloat();
		System.out.println("Digite o valor do �ndice c: ");
		c = leia.nextFloat();
		System.out.println("Digite o valor do �ndice d: ");
		d = leia.nextFloat();
		System.out.println("Digite o valor do �ndice e: ");
		f = leia.nextFloat();
		System.out.println("Digite o valor do �ndice f: ");
		g = leia.nextFloat();

		//C�lculo do X
		x = (c*f - b*g) / (a*f - b*d);
		y = (a*g - c*d) / (a*f - b*d);

		System.out.println("O valor de X � " + x + " e o valor de Y � " + y);
		
	}
}
