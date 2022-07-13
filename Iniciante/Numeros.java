import java.util.Scanner;

public class Numeros {

	public static void numeros(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número qualquer aí, vei, na moral:");
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO!");
		} else {
			System.out.println("NÃO NEGATIVO!");
		}
		
		sc.close();
			
	}
	
}
