import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int antecessor = 0;
		int sucessor = 1;
		int termoSucedente;
		Scanner s = new Scanner(System.in);
		System.out.println("Quantos termos deseja visualizar o Fibonacci: ");
		int x = s.nextInt();
		
		System.out.print(antecessor+", "+sucessor);
		for (int i = 3; i <= x; i++) {
			termoSucedente = antecessor + sucessor;
			System.out.print(", "+termoSucedente);
			antecessor = sucessor;
			sucessor = termoSucedente;
		}
	}

}
