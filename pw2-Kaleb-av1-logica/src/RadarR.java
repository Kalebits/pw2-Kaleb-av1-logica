
public class RadarR {
public static void main(String[] args) {
	double fCarro = 0.65;
	double velCarro;
	double multa;
	int velEstrada = 120;
	
	velCarro = 300 * (1 / fCarro - 1);
	
	if (velCarro > velEstrada)
	{
		if(velEstrada * 1.2 > velCarro)
		{
			multa = 130.16;
			System.out.println("Velocidade do carro: " +velCarro + " km/h");
			System.out.println("Multa de R$ " +multa);
		}
		else if(velEstrada * 1.5 > velCarro)
		{
			multa = 195.23;
			System.out.println("Velocidade do carro: " +velCarro + "km/h");
			System.out.println("Multa de R$ " +multa);
		}
		else
		{
			multa = 880.41;
			System.out.println("Velocidade do carro: " +velCarro + "km/h");
			System.out.println("Multa de R$ " +multa);
		}
	}
	else
	{
		System.out.println("Velocidade do carro: " +velCarro + "km/h");
	}
}
}
