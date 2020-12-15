package Lista7;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
		
	public Pessoa() {
		
	}
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;	
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endereco;
	}
	public void setEndere�o(String endere�o) {
		this.endereco = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
