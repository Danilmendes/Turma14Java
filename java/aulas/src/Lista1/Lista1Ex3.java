package Lista1;
import java.util.Scanner;

public class Lista1Ex3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int segundos, minutos, horas, moduloMin, moduloHora;
		
		System.out.println("--- Convers�o de segundos em horas e minutos ----");
		System.out.println("Digite o tempo em segundos: ");
		segundos = leia.nextInt();
		moduloMin = segundos % 60;
		minutos = (segundos - moduloMin) / 60;
		moduloHora = (minutos % 60);
		horas = (minutos - moduloHora) / 60;
		System.out.println("S�o " + horas +" horas " + moduloHora + " minutos e " + moduloMin + " segundos");
	}
}
