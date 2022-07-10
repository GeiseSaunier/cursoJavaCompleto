import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

	public static void diferenca(String[] args) {

        // programa para calcular a diferença entre 4 números
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
			
	}
	
}