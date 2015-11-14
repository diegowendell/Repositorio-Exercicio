
public class Exercicio3 {
	
	public static void main(String[] args) {
		
	String nome = "Roberto Martins Silva";
	double salarioFixo = 1235.38;
	double vendasMes = 10250.00;
	double salarioFinal = salarioFixo + (vendasMes * 0.15);
	
	System.out.println("Funcionário: "+nome);
	System.out.println("Salário Fixo: "+salarioFixo);
	System.out.println("Salário final com comissão: "+salarioFinal);
	}
}
