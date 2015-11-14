import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual o ano do veiculo: ");
		int ano = s.nextInt();
		System.out.println("Qual o valor do veiculo: ");
		double valor = s.nextDouble();
		String taxaDesconto = "";
		double valorDescontado = 0;
		if (ano <= 2000) {
			valorDescontado = valor - (valor*0.12);
			taxaDesconto="12%";
		}else if (ano > 2000 && ano <=2005) {
			valorDescontado = valor - (valor*0.07);
			taxaDesconto="7%";
		}else if (ano >2005) {
			valorDescontado = valor - (valor*0.05);
			taxaDesconto="5%";
		}
		System.out.println("Desconto de "+taxaDesconto);
		System.out.println("Valor a pagar R$"+valorDescontado);
		
	}
}
