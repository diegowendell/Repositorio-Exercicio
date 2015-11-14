
public class Exercicio4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
//		Solução Principal      
		int acumulador = a;
		
		a = b;
		b = acumulador;
	
//		Solução alternativa (achei mais legal, mas como não sei explicar direito esse operador achei melhor
//		colocar como segunda opção).
//		
//	    a = a ^ b;
//	    b = a ^ b;
//	    a = a ^ b;

		System.out.println();
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}

}
