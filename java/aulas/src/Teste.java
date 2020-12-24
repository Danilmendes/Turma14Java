
public class Teste {
	public static void main(String[] args) {
		Funcionario cp = new Funcionario("Dan",2,20.0);
		Terceiro dm = new Terceiro("Haha",5,40.0,50.00);
		
		System.out.printf(cp.getNome()+" "+cp.getHorasMensais()+" "+cp.getValorHora()+" "+cp.pagamentoSalario());
		System.out.printf("\n"+dm.getNome()+" "+dm.getHorasMensais()+" "+dm.getValorHora()+" "+dm.getValorTerceiro()+" "+dm.pagamentoSalario());
	}
}
