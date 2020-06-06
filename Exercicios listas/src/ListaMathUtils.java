import java.util.ArrayList;
import java.util.List;

public class ListaMathUtils 
{
	static List<Integer> calculaDivisores(int num) 
	{	List<Integer> divisores = new ArrayList<Integer>();
		for (int i = 1; i < num; i++) 
		{
			if(num % i == 0) 
			{
				divisores.add(i);
			}
		}
		return divisores;
	}
	static double computaMaior(List<Double> numeros) 
	{
		double maior = numeros.get(0);
		for(double numero: numeros) 
		{
			if(numero> maior) 
			{
				maior = numero;
			}
		}
		return maior;
	}
	static double computaMenor(List<Double> numeros) 
	{
		double menor = numeros.get(0);
		for(double numero: numeros) 
		{
			if(numero< menor) 
			{
				menor = numero;
			}
		}
		return menor;
	}
	static double computaMedia(List<Double> numeros) 
	{
		int qtd = numeros.size();
		double soma = 0;
		for (double numero: numeros) 
		{
			soma+=numero;
		}
		double media = soma/qtd;
		return media;
	}
	static boolean temNumRepetido(List<Double> numeros) 
	{
		for (int i = 0; i < numeros.size(); i++) 
		{	for (int j = i+1; j < numeros.size(); j++) 
			{
				if(numeros.get(i).equals(numeros.get(j))) 
				{
					return true;
				}
			}
		}
		return false;
	}
}
