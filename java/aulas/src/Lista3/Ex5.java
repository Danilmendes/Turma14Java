package Lista3;

public class Ex5 {
	public static void main(String[] args) {
		
		int contador = 233;
		do{
			while(contador>300 && contador <400){
				System.out.println("\n"+contador);
				contador = contador + 3;
			}
			System.out.println("\n"+contador);
			contador = contador + 5;		
		}while(contador <457);
	}
}
