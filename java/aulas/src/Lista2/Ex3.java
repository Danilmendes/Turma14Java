package Lista2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num1, num2, num3, num4, quadrado1, quadrado2, quadrado3, quadrado4;

		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		num2 = leia.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = leia.nextDouble();
		System.out.println("Digite o quarto n�mero: ");
		num4 = leia.nextDouble();

		quadrado1= Math.pow(num1,2);
		quadrado2= Math.pow(num2,2);
		quadrado3= Math.pow(num3,2);
		quadrado4= Math.pow(num4,2);

		if (quadrado3 >= 1000){
			System.out.println("Valor do terceiro n�mero: " + num3 +"\nQuadrado do terceiro n�mero (x�): " + quadrado3);		
		}
		else{
			System.out.println("\nValor do primeiro n�mero: " + num1 +"   Quadrado do primeiro n�mero (x�): " + quadrado1);
			System.out.println("\nValor do segundo n�mero: " + num2 +"    Quadrado do segundo n�mero (x�): " + quadrado2);
			System.out.println("\nValor do terceiro n�mero: " + num3 +"   Quadrado do terceiro n�mero (x�): " + quadrado3);
            System.out.println("\nValor do quarto n�mero: " + num4 +"     Quadrado do quarto n�mero (x�): " + quadrado4);
		}
	}
}
