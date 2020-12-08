import java.util.Scanner;

public class ConversãoFahrenheit {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float tempGrau, tempFahrenheit;

		System.out.println("Digite a temperatura atual (em grau Celsius) : ");
		tempGrau = leia.nextFloat();
		tempFahrenheit = (tempGrau * 9 / 5) + 32;


		System.out.printf("A temperatura em Fahrenheit é: %.2f °F" ,tempFahrenheit);
	}
}
