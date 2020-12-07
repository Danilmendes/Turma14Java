import java.util.Scanner;

public class Lista1Ex2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int tempoDias, modulo, anos, mes , dias;
		final int diasNoAno = 365;
		
		System.out.println(" ----Cálculo da idade em anos---- ");
		System.out.println("Digite a sua idade em dias: ");
		tempoDias = leia.nextInt();
		modulo = tempoDias % diasNoAno;
		dias = (tempoDias % diasNoAno)%30;
		mes = (tempoDias % diasNoAno)/30;
		anos = (tempoDias - modulo) / diasNoAno;
		System.out.println("Sua idade é aproximadamente : " + anos +" anos " + mes + " meses e " + dias + " dias");
		
		
	}
}
