
public class Exercicio6 {
	public static void main(String[] args) {
		int y;
		int x = 10;
		int total = 0;
		
		while (total <= 10) {
			y = x * x;
			System.out.println(y);
			total += y;
			x++;
		}
		System.out.printf("Total é %d\n" , total);
	}
}
