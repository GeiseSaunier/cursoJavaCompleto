import java.util.Locale;
import java.util.Scanner;

public class Trigonometria {

	public static void trigonometria(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		// area do triangulo area = A * B;
		double areaTriangulo = (A * C)/2;
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		
		// area do circulo area = pi * raio ao quadrado
		double pi = 3.14159;
		double areaCirculo = pi * (Math.pow(C,2));
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		
		// area do trapézio area = base maior + base menor * altura dividido por 2
		double areaTrapezio = ((A + B)*C)/2;
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		
		// area do quadrado area = lado ao quadrado
		double areaQuadrado = (Math.pow(B,2));
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		
		//area do retangulo area = base * altura
		double areaRetangulo = A * B;
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
			
	}
	
}