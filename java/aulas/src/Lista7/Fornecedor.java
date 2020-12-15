package Lista7;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	private double saldo;
	
	public Fornecedor(String nome, String telefone,double valorCredito,double valorDivida) {
		super(nome, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public Fornecedor(String nome, String endereco, String telefone,double valorCredito,double valorDivida) {
		super(nome, telefone, endereco);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(double valorCredito,double valorDivida ) {
		
		this.saldo = this.valorCredito - this.valorDivida;
		return this.saldo;
	}
	
}
