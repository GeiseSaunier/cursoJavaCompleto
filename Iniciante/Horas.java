import java.util.Scanner;

public class Horas {

	public static void horas(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe dois horários:");
		
		int horaInicioDoJogo = sc.nextInt();
		int horaFimDoJogo = sc.nextInt();
		int duracao;
		
		if (horaInicioDoJogo < horaFimDoJogo) {
			duracao = horaFimDoJogo - horaInicioDoJogo;
		} else {
			duracao = 24 - horaInicioDoJogo + horaFimDoJogo;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
							
		sc.close();
			
	}
	
}