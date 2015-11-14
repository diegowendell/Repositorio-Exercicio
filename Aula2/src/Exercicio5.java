import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		double nota;
		Scanner s = new Scanner(System.in);
		System.out.print("Digite Nota: ");
		nota = s.nextDouble();
		
		if (nota>=7.0) {
			System.out.println("Passou direto, nota "+nota);	
		}
		if (nota>=5.0 && nota<7.0) {
			System.out.println("Tem direito de fazer uma prova de recuperação, nota "+nota);
		}
		if (nota<5.0) {
			System.out.println("Reprovado direto, nota "+nota);
		}
	}

}
