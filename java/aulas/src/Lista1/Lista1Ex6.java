package Lista1;
import java.util.Scanner;

public class Lista1Ex6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float x1, y1, x2, y2;
		double resultado;

		System.out.println("---- Distância entre dois pontos ----");
		System.out.println("Digite a coordenada X do primeiro ponto: ");
		x1 = leia.nextFloat();
		System.out.println("Digite a coordenada Y do primeiro ponto: ");
		y1 = leia.nextFloat();
		System.out.println("Digite a coordenada X do Segundo ponto: ");
		x2 = leia.nextFloat();
		System.out.println("Digite a coordenada Y do Segundo ponto: ");
		y2 = leia.nextFloat();	
		resultado = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println("A distância entre os dois pontos é: " + resultado);
	}
}
