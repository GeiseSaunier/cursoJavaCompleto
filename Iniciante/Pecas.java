import java.util.Locale;
import java.util.Scanner;

public class Pecas {

	public static void pecas(String[] args) {
		
		// calcular valor de pecas de roupa
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		

		int codigoPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valor = (numPeca1*valorUnitarioPeca1) + (numPeca2*valorUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
			
		sc.close();
			
	}
	
}