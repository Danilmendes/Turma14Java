package Lista6;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente pessoa1 = new Cliente("Dan",'M',1994,"danilmendes@gmail.com");
		
		pessoa1.boaVinda();
	}
}
