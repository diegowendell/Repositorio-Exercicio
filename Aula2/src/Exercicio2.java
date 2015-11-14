
public class Exercicio2 {
	public static void main(String[] args) {
		double distanciaPercorrida = 440.0;
		double combustivelGasto = 27.0;
		
		double mediaConsumo = distanciaPercorrida / combustivelGasto;
		
		System.out.print("O consumo medio de ");
		System.out.printf( "%.2f", mediaConsumo ); 
		System.out.println(" Km/L em uma distancia de "
				+distanciaPercorrida+" KM com um total de combustivel gasto de "+combustivelGasto+" L.");
	}
}
