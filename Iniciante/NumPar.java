import java.util.Scanner;

public class NumPar {

	public static void numpar(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número qualquer:");
		int numero = sc.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("PAR!");
		} else {
			System.out.println("IMPAR!");
		}
		
		sc.close();
			
	}
	
}
