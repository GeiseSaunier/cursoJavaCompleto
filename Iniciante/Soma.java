import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void soma(String[] args) {
		
	// programa para somar dois numeros
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int soma = x + y;
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
		
	}
	
}