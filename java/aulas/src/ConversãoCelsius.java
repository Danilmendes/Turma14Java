import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversãoCelsius {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double tempGrau, tempFahrenheit;
		String tempGrauF;

		
		System.out.println("Digite a temperatura atual (em grau Fahrenheit) : ");
		tempFahrenheit = leia.nextDouble();
		tempGrau = ((tempFahrenheit -32) * 5) / 9;
		DecimalFormat df = new DecimalFormat("#.00");
		
		tempGrauF = df.format(tempGrau);
		
		System.out.println("A temperatura em Celsius é: " +tempGrauF+ "ºC");

	}

}
