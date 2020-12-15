package Lista6;

public class Cliente {
	
	public String nome;
	public char genero;
	public int anoNascimento;
	public int idade;
	public String email;
	
	
	public Cliente(String nome, char genero, int anoNascimento, String email) {
		
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		this.email = email;
		
	}
	
	public void boaVinda() {
		if(this.genero=='M') {
			System.out.printf("Seja bem vindo, senhor %s\n",this.nome );
			System.out.printf("Idade: %d\n",(2020 - this.anoNascimento));
			System.out.printf("Email: %s\n",this.email);
		}
		else if(this.genero == 'F') {
			System.out.printf("Seja bem vinda, senhora %s\n",this.nome );
			System.out.printf("Idade: %d\n",(2020 - this.anoNascimento));
			System.out.printf("Email: %s\n",this.email);
		}
		else {
			System.out.printf("Seja bem vinde, senhore %s\n",this.nome );
			System.out.printf("Idade: %d\n",(2020 - this.anoNascimento));
			System.out.printf("Email: %s\n",this.email);
		}
	}
}
