
public class TestadorArrayUtils {

	public static void main(String[] args) 
	{
		ArrayMathUtils amu = new ArrayMathUtils();
		int[] div = amu.calculaDivisores(32);
		for (int i = 0; i < div.length; i++) 
		{
			//System.out.println(div[i]);
		}
		double[] numeros = {12.4, 43.1, 4.3, 54.0, 6.7,};
		//System.out.println(amu.computaMaior(numeros));
		//System.out.println(amu.computaMenor(numeros));
		//System.out.println(amu.computaMedia(numeros));
		System.out.println(amu.temNumRepetido(numeros));
		int[][] m1 = new int[][] {
				new int[] {5,4},
				new int[] {0,2},
				new int[] {1,-1}};
		int[][] m2 = new int[][] {
				new int[] {0,-2},
				new int[] {5,-3},
				new int[] {-1,0}};
				
		int [][] m3 = amu.somaMatrizes(m1, m2);
		for (int i = 0; i < m3.length; i++) 
		{	int qtdColunas = m3[i].length;
			System.out.println("");
			for (int j = 0; j < qtdColunas; j++) 
			{
				System.out.print(m3[i][j]+" ");
			}
		}
	}

}
