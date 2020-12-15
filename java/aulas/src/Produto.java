
public class Produto {
	public String produto;
	public int qtde;
	public double valorUnitario;
	
	 public Produto(String nomeProduto, int qtdeEstoque, double valorUnitario) {
	        this.produto = nomeProduto;
	        this.qtde = qtdeEstoque;
	        this.valorUnitario = valorUnitario;
	    }
	  public double valorFinal(int quantidade){
	      return (this.valorUnitario*quantidade);
	   }


}
