package Lista3;

public class Ex2 {
	public static void main(String[] args) {
		
		int x, soma=0;
			for(x=3;x<=500;x=x+3){
				if(x%3==0){
					soma = soma + x;
				}
			}
		System.out.println( "O valor da soma dos múltiplos de 3 de 1 até 500 é: " + soma);
	}
}
