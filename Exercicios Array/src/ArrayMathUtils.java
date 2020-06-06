
public class ArrayMathUtils 
{
	static int[] calculaDivisores(int numero) 
	{
		int quantDivisores = 2;
		for (int i = 2; i <= numero/2; i++) 
		{
			if(numero%i == 0) 
			{
				quantDivisores++;
			}
		}
		int divisores[] = new int[quantDivisores];
		int posicao = 0;
		for (int i = 1; i <= numero; i++) 
		{
			if(numero%i==0) 
			{
				divisores[posicao] = i;
				posicao++;
			}
		}
		return divisores;
	}
	static double computaMaior(double[] numeros) 
	{	double maior = numeros[0];
		for (int i = 0; i < numeros.length; i++) 
		{				
			if(maior < numeros[i]) 
			{
				maior = numeros[i];
			}
		}
		return maior;
	}
	static double computaMenor(double[]numeros) 
	{
		double menor = numeros[0];
		for (int i = 0; i < numeros.length; i++) 
		{
			if(menor > numeros[i]) 
			{
				menor = numeros[i];
			}
		}
		return menor;
	}

	static double computaMedia(double[] numeros) 
	{
		double valor = 0;
		for (int i = 0; i < numeros.length; i++) 
		{
			valor+= numeros[i];
		}
		double media = valor/numeros.length;
		return media;
	}
	
	static boolean temNumRepetido(double[] numeros) 
	{	boolean repetido = false;
		for (int i = 0; i < numeros.length; i++) 
		{	// outro for para pegar sempre o numero posterior para comparar os numeros
			for (int j = i+1; j < numeros.length; j++) 
			{
				if(numeros[i]==numeros[j]) 
				{
					repetido = true;
					return repetido;
				}
			}
		}
		return repetido;
	}
	static int[][] somaMatrizes(int[][] m1, int[][]m2)
	{
		int[][] m3 = new int[m1.length][];
		for (int i = 0; i < m3.length; i++) 
		{	// verificando quantas colunas
			int qtdColunas = m1[i].length;
			// instanciando o numero de colunas
			m3[i] = new int[qtdColunas];
			for (int j = 0; j < qtdColunas; j++) 
			{
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}
}
