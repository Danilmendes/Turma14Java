package Lista2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String codigo;
		int horas, salarioTotal, salarioExcedente;   
		final int taxaNormal =10;
		final int taxaExcedente = 20;

		System.out.println("Digite seu ID na empresa [C]: ");
		codigo = leia.nextLine();
		System.out.println("Digite aqui a quantidade de horas trabalhadas [N]: ");
		horas = leia.nextInt();

		if(horas>50){
			salarioExcedente = (horas - 50) * taxaExcedente;
			salarioTotal = (taxaNormal * 50) + salarioExcedente;
			System.out.println("\nId: " + codigo + "\nSalário Excedente: $" + salarioExcedente + "\nSalário Total: $ " + salarioTotal );	
		}
		else{
			salarioExcedente = 0;
			salarioTotal = taxaNormal * horas;
			System.out.println("\nId: " + codigo + "\nSalário Excedente: $" + salarioExcedente + "\nSalário Total: $ " + salarioTotal );			
		}
	}
}
