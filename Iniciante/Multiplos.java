import java.util.Scanner;

public class Multiplos {

	public static void multiplos(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dois valores:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if((A %B == 0) || (B %A == 0)){
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
						
		sc.close();
			
	}
	
}
