
public class Exercicio4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
//		Solu��o Principal      
		int acumulador = a;
		
		a = b;
		b = acumulador;
	
//		Solu��o alternativa (achei mais legal, mas como n�o sei explicar direito esse operador achei melhor
//		colocar como segunda op��o).
//		
//	    a = a ^ b;
//	    b = a ^ b;
//	    a = a ^ b;

		System.out.println();
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}

}
