import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		
		String alunos[] = {"Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
		char sexoAlunos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		int matriculas[] = new int[40];
		double notas[]= new double[40];
		final int tamanho = 80;
		int matricula;
		
		Scanner leia = new Scanner(System.in);
		
		linha(tamanho);
		System.out.println("Matrícula    Tipo\tNome");
		linha(tamanho);
		for(int x=0; x<40; x++) {
			matriculas[x] = (x+1);
			if(sexoAlunos[x]=='M') {
				System.out.println("   "+matriculas[x]+ "\t     Aluno\t"+ alunos[x]);
			}
			else {
				System.out.println("   "+matriculas[x]+ "\t     Aluna\t"+ alunos[x]);
			}
		}
		for(int x =0; x<tamanho; x++) {
			System.out.print("=");
		}
		System.out.print("\n");
		System.out.println("Digite a matrícula do aluno: ");
		matricula = leia.nextInt();
		while(matricula<0 || matricula>40) {
			System.out.println("Matrícula incorreta. Digite a matrícula do aluno: ");
			matricula = leia.nextInt();
		}
		for(int x=0; x<40; x++) {
			if(matricula == matriculas[x]) {
				System.out.println("Digite a nota: ");
				notas[x] = leia.nextDouble();				
			}		
	
		}
		linha(tamanho);
		System.out.println("Matrícula    Tipo\tNotas\tNome");
		linha(tamanho);
		for(int x=0; x<40; x++) {
			matriculas[x] = (x+1);
			if(sexoAlunos[x]=='M') {
				System.out.printf("   %d\t     Aluno\t%.2f\t%s\n",matriculas[x],notas[x],alunos[x]);
			}
			else {
				System.out.printf("   %d\t     Aluna\t%.2f\t%s\n",matriculas[x],notas[x],alunos[x]);
			}
		}
		
	}
	static void linha(int tamanho) {
		for(int x =0; x<tamanho; x++) {
			System.out.print("═");
		}
		System.out.print("\n");
	}	
}
