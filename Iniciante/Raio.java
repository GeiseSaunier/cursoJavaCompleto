import java.util.Locale;
import java.util.Scanner;

public class Raio {

	public static void raio(String[] args) {

        // programa para calcular o raio de um círculo
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double area = pi * (Math.pow(raio,2));
		
		System.out.printf("AREA = %.4f%n", area);
		
		
		sc.close();
			
	}
	
}