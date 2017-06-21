import java.util.Scanner;

public class Volta 
{

	public static void main(String[] args) 
	{
		
		int[] carroFrente;
		int[] carroAtras;
		int[] difVolta;
		int volta = 1;
		
		int Daux = 0;
		
		carroFrente = new int[50];
		carroAtras = new int[50];
		difVolta = new int[50];
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o tempo da volta do Piloto que está em primeiro");
		carroFrente[volta] = scanner.nextInt();
		
		System.out.println("Informe o tempo da volta do Piloto que está em ultimo");
		carroAtras[volta] = scanner.nextInt();
		
		
		while (Daux < carroAtras[1])
		{
			
			difVolta[volta] = carroAtras[volta] - carroFrente[volta];
			
			Daux = difVolta[volta];
		
			volta++;
			
			carroAtras[volta] = carroAtras[volta - 1] + carroAtras[1];
			carroFrente[volta] = carroFrente[volta - 1] + carroFrente[1];
			
		}//while
		
		volta--;
		
		System.out.println("Alcancou o ultimo colocado na " + volta + " volta");
		

	}//main

}//volta
