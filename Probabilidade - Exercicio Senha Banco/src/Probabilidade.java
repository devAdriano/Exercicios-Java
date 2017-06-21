/* Questão concurso ITAIPU BINACIONAL 2016
 * 
 * O sistema de segurança de um banco gera, para cada cliente, uma senha de quatro dígitos numéricos distintos. Note que os dígitos das senhas 1234 e 0269 estão em ordem crescente, porém 
 * os dígitos das senhas 1233 e 1034 NÃO estão em ordem crescente. Qual é a probabilidade de os dígitos de uma senha aleatoriamente gerada por esse sistema estarem em ordem crescente?
 * 
	a) 84/1680.
	b) 126/3024. 
	►c) 210/3024. 
	d) 504/10000. 
	e) 3024/10000.
 * 
 */
public class Probabilidade 
{

	public static void main(String[] args) 
	{
	
		int num = -1; 
		String numStringDigits;
		String numSplit[];
		
		int i;
		int contNumCresc = 0;
		
		for(i = 0; i <= 9999; i++)
		{
			
			num = num + 1;
			numStringDigits = String.format("%04d", num);//converte o valor inteiro para 4 digitos
			
			numSplit = numStringDigits.split("");//separa os valores em um array
			
			//compara as posicoes do array verificando se os digitos estao em ordem crescente
			if((Integer.parseInt(numSplit[0]) < Integer.parseInt(numSplit[1])) && (Integer.parseInt(numSplit[1]) < Integer.parseInt(numSplit[2])) && (Integer.parseInt(numSplit[2]) < Integer.parseInt(numSplit[3])))
			{
				
				contNumCresc = contNumCresc + 1;
				
			}//if
			
		}//for
		
		//imprime-as na tela
		System.out.println("Entre 0000 e 9999 há: " + contNumCresc + " digitos em ordem crescente.");
	
		
	}//main
	
}//PC Probabilidade
