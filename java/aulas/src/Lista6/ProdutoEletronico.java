package Lista6;

public class ProdutoEletronico {
	public String produto;
	public String categoria;
	public int quantidade;
	public double preco;
	
public ProdutoEletronico(String produto,String categoria, double preco) {
	this.produto = produto;
	this.categoria = categoria;
	this.preco = preco;
}
public double valorFinal(int quantidade){
    return (this.preco*quantidade);    
}
}
