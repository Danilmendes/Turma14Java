package Lista8;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome,idade);
	}
	public void som() {
		System.out.println("Au Au Au");
	}
	public void correr() {
		System.out.println("Eu corro");
	}
}
