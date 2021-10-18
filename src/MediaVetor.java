import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		
		// Declaração das variáveis que alimentarão o índice do vetor e a soma dos elementos
		double soma=0;
		int i;
		
		// Instanciando objeto a partir da classe scanner para receber entrada de dados
		Scanner scan = new Scanner(System.in);
				
		/**
		 * Bloco para definição do tamanho do vetor
		 */
		System.out.print("Quantos elementos terá o vetor\nde números inteiros? ");
		i = (Integer.parseInt(scan.nextLine()));
		double notas[] = new double[i];

		/**
		 * Laço para preencher os elementos do vetor
		 */
		System.out.println("\n------------------------------------------");
		for(int x = 0; x < notas.length; x++) {
			System.out.print("Informe o " + (x+1) + "° elemento: ");
			notas[x] = Double.parseDouble(scan.next());
			soma += notas[x];
		}
		
		/**
		 * Bloco para exibição dos resultados
		 */
		System.out.println("\n------------------------------------------");
		System.out.println("A soma dos elementos do vetor é: " + soma);
		System.out.println("A média dos elementos do seu vetor é: " + (soma/i));
		scan.close();
		

	}

}
