import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis que alimentar�o o �ndice do vetor e a soma dos elementos
		double soma=0;
		int i;
		
		// Instanciando objeto a partir da classe scanner para receber entrada de dados
		Scanner scan = new Scanner(System.in);
				
		/**
		 * Bloco para defini��o do tamanho do vetor
		 */
		System.out.print("Quantos elementos ter� o vetor\nde n�meros inteiros? ");
		i = (Integer.parseInt(scan.nextLine()));
		double notas[] = new double[i];

		/**
		 * La�o para preencher os elementos do vetor
		 */
		System.out.println("\n------------------------------------------");
		for(int x = 0; x < notas.length; x++) {
			System.out.print("Informe o " + (x+1) + "� elemento: ");
			notas[x] = Double.parseDouble(scan.next());
			soma += notas[x];
		}
		
		/**
		 * Bloco para exibi��o dos resultados
		 */
		System.out.println("\n------------------------------------------");
		System.out.println("A soma dos elementos do vetor �: " + soma);
		System.out.println("A m�dia dos elementos do seu vetor �: " + (soma/i));
		scan.close();
		

	}

}
