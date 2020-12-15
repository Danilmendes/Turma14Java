package Lista6;

public class Aviao {
	
	public String companhia;
	public int capacidade;
	public int numeroVoo;
	
	public Aviao(String companhia, int capacidade, int numeroVoo) {
		this.companhia = companhia;
		this.capacidade = capacidade;
		this.numeroVoo = numeroVoo;
	}
	
	public int embarque(int pessoasNoAviao) {
		
			int embarqueFaltosos = this.capacidade - pessoasNoAviao;		
		
		return embarqueFaltosos; 
	}
}
