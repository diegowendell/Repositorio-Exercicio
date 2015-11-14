import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
//		Faça um programa em Java que armazene a Idade de 10 pessoas e que ao final informe a 
//		maior idade e a menor idade (devem ser consideras idades validas as que forem maior que 0 e menor que 100).
		
		int maior = 0;
		int menor = 0;
		int idade;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite idade 1: ");
		idade = s.nextInt();
		if (idade>0 && idade<=100) {
			menor = idade;
		}else {
			System.out.println("Idade não valida!");
		}
		
		for (int i = 2; i <=10 ; i++) {
		
			System.out.println("Digite idade "+i+": ");
			idade = s.nextInt();
			
			if (idade>0 && idade<=100) {
				if (maior<idade) {
					maior = idade;
				}
				if (menor>idade) {
					menor = idade;
				}
			}else {
				System.out.println("Idade não valida!");
			}
		}
		
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
	}
}
