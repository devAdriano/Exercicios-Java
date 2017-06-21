import java.util.Scanner;

public class Fatorial 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		//Calcula Fatorial
		int FatAux = 1;
		int resultFatAux = 1;
		
		//BuscaFatorial
		int valorDigitado;
		int valorPrincipal = 0; //responsável pelo fatorial
		
		int[] fatResolvidos;
		int[] fatResultados;
		int totalFat = 0;
		int i = 0;
		
		fatResolvidos = new int[10];
		fatResultados = new int[10];
		
//------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
		Scanner scanner = new Scanner(System.in);
		
		//Usuario digita valor desejado
		System.out.println("Digite o numero: ");
		valorDigitado = scanner.nextInt();
		valorPrincipal = valorDigitado;
		
		while(totalFat != valorDigitado)
		{
			
			while(resultFatAux <= valorPrincipal)
			{
			
				resultFatAux = (FatAux * resultFatAux);
				FatAux = FatAux + 1;
			
			}//while
		
			FatAux = FatAux - 1;
			
			fatResultados[i] = resultFatAux / FatAux;
			fatResolvidos[i] = FatAux - 1;
			totalFat = totalFat + fatResultados[i];
			
			if(totalFat != valorDigitado)
			{
				
				valorPrincipal = valorPrincipal - fatResultados[i];	
				i++;
				resultFatAux = 1;
				FatAux = 1;
		
			}
				
		}//while
			
		i = 0;
		
		while(fatResolvidos[i] >= 1)
		{
			
			System.out.println("Fat: " + fatResolvidos[i] + "!");
			i++;
			
		}
		
		System.out.println("A soma dos " + i + " fatoriais acima é "+ totalFat + "");
		
	}//main

}//PC Fatorial
