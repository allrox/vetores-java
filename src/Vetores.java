import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double grausCelsius[] = new double[1000];
		int soma = 0;
		
		for( int i = 0; i < grausCelsius.length; i++ ) {
			System.out.println("Digite a temperatura em Celsius: [" + ((i+1)*3) + "]");
			grausCelsius[i] = (i+1)*3;		
		}
		
		System.out.println("Foram informadas as temperaturas: ");
		for( int i = 0; i < 1000; i++) {
			System.out.println("Temperatura: [" + (i + 1) + "] -> " + grausCelsius[i]);
		}
		
		for(int i = 0; i < 1000; i++) {
			soma += grausCelsius[i];
		}
		
		System.out.println("Endereço de memória do vetor: " + grausCelsius);
		System.out.println("A temperatura média é: " + (soma/1000));
		
		scan.close();		
		
	}

}
