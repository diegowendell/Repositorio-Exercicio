
public class Exercicio3 {

	public static void main(String[] args) {
		int z = 10;
		int sum = 0;
		
		while (z >= 0) {
			sum = sum + z;
			System.out.println(sum);
			//Para sair do loop infinito 
			//fazer com que z chegue a menor que 0
			z--;
		}
	}

}
