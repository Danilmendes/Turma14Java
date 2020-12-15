package Lista7;

public class Teste {

	public static void main(String[] args) {

		Fornecedor empresa1 = new Fornecedor("Jorge", "São Paulo", "999999999",500.00,200.00);
		Empregado jose = new Empregado("Jose", "888888888",88,2000,30);

		System.out.printf("Nome: %s\n",empresa1.getNome());
		System.out.printf("Localização: %s\n",empresa1.getEndereço());
		System.out.printf("Telefone: %s\n",empresa1.getTelefone());

		System.out.printf("Fornecedor Me Polpa , Saldo: R$ %.2f\n",empresa1.obterSaldo(empresa1.getValorCredito(), empresa1.getValorDivida()));
		System.out.println("\n--------------------------------------------------------------------------");
		System.out.printf("\nNome do empregado: %s", jose.getNome());
		System.out.printf("\nTelefone: %s", jose.getTelefone());
		System.out.printf("\nCódigo do setor: %d", jose.getCodigoSetor());
		System.out.printf("\nSalário base: R$ %.2f", jose.getSalarioBase());
		System.out.printf("\nSalário: R$ %.2f\n", jose.calcularSalario(jose.getSalarioBase(), jose.getImposto()));
		System.out.println("\n--------------------------------------------------------------------------");
	}

}
