import java.util.Scanner;

public class Lista1Ex1{
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);//instanciar um teclado 
		int anos, meses, dias, total;
		
		System.out.println("---Cálculo da idade em dias---");
		System.out.println("Digite a sua idade: ");
		anos = leia.nextInt();
		System.out.println("Digite os meses: ");
		meses = leia.nextInt();
		System.out.println("Digite os dias: ");
		dias = leia.nextInt();
		total = (anos * 365) + (meses * 30) + dias;
		System.out.println("Sua idade em dias é aproximadamente: "+total);
		
		leia.close(); // fecha o teclado
	}
}
