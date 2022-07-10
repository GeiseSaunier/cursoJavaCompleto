import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void salario(String[] args) {
		
		// calcular o salario de um funcionário
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncionaro = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHorasTrabalhadas = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHorasTrabalhadas;
		
		System.out.println("NUMBER = " + numFuncionaro);
		System.out.printf("SALARY = U$ %.2f%n", salario);
			
		sc.close();
			
	}
	
}