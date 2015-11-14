import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		double real;
		double dolar;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Digite valor em real: ");
		real = s.nextDouble();
		
		dolar = real * 3.18;
		
		System.out.println("Real: R$ "+real);
		System.out.print("Dolar: US$ ");
		System.out.printf("%.2f",dolar);
		
	}
}
