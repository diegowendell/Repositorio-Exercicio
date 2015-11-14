import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Opção VariavelA: Digite (Pedra, Papel ou Tesoura)");
		String a = s.nextLine();
		System.out.println("Opção VariavelB: Digite (Pedra, Papel ou Tesoura)");
		String b = s.nextLine();
	
		if (a.equals("Papel") && b.equals("Pedra")) {
			System.out.println("VariavelA venceu!");
		}else if (a.equals("Tesoura") && b.equals("Papel")) {
			System.out.println("VariavelA venceu!");
		}else if (a.equals("Pedra") && b.equals("Tesoura")) {
			System.out.println("VariavelA venceu!");
		}else {
			System.out.println("VariavelB venceu!");
		}
	}

}
