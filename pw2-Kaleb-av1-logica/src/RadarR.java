import java.util.Scanner;

public class RadarR {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double velCarro;
	double multa;
	
	System.out.println("Informe a frequencia do carro: ");
	double fCarro = ler.nextDouble();
	
	System.out.println("Informe a velocidade máxima da estrada: ");
	int velEstrada = ler.nextInt();
	
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
