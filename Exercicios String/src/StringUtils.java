
public class StringUtils 
{	static char transformaMaiuscula = (char)('A' - 'a');
	static String formataAtributo(String atributo) 
	{
		String[] palavras = atributo.toLowerCase().split(" ");
		StringBuilder novoAtributo = new StringBuilder();
		for (int i = 0; i < palavras.length; i++) {
			String palavra = palavras[i];
			char letra = palavra.charAt(0);
			if(i!=0) 
			{
				letra = (char)(palavra.charAt(0)+ transformaMaiuscula);
			}
			novoAtributo.append(letra);
			novoAtributo.append(palavra.substring(1));
		}
		return novoAtributo.toString();
	}
	static String formataMetodo(String metodo) 
	{
		String[] palavras = metodo.toLowerCase().split(" ");
		StringBuilder novoMetodo = new StringBuilder();
		for (int i = 0; i < palavras.length; i++) {
			String palavra = palavras[i];
			char letra = palavra.charAt(0);
			if(i!=0) 
			{
				letra = (char)(palavra.charAt(0)+ transformaMaiuscula);
			}
			novoMetodo.append(letra);
			novoMetodo.append(palavra.substring(1));
		}
		return novoMetodo.toString();
	}
	static String formataClasse(String classe) 
	{
		String[] palavras = classe.toLowerCase().split(" ");
		StringBuilder novaClasse = new StringBuilder();
		for (int i = 0; i < palavras.length; i++) 
		{
			String palavra = palavras[i];
			char letra = (char)(palavra.charAt(0) + transformaMaiuscula);
			novaClasse.append(letra);
			novaClasse.append(palavra.substring(1));
		}
		return novaClasse.toString();
	}
	static String ordenaStrings(String palavra1, String palavra2) 
	{	String ordem = "";
		if(palavra1.toLowerCase().charAt(0) < palavra2.toLowerCase().charAt(0)) 
		{
			ordem = palavra1 + " " + palavra2;
		}
		else 
		{
			ordem = palavra2 + " " + palavra1;
		}
		return ordem;
	}
	static boolean ehPalindromo(String palavra) 
	{
		boolean palindromo = false;
		StringBuilder palavra2 = new StringBuilder();
		for (int i = palavra.length() - 1; i >= 0; i--) 
		{
			palavra2.append(palavra.charAt(i));
		}
		if(palavra.equals(palavra2.toString())) 
		{
			palindromo = true;
		}
		return palindromo;
	}
	static String transformaParaCaixaAlta(String palavra) 
	{
		String novaPalavra = palavra.toUpperCase();
		return novaPalavra;
		//criar depois um metodo uppercase
	}
	static int contaVogais(String frase) 
	{	int contador = 0;
		String[] palavras = frase.toLowerCase().split(" ");
		for (int i = 0; i < palavras.length; i++) 
		{	String palavra = palavras[i];
			for (int j = 0; j < palavra.length(); j++) 
			{	char letra = palavra.charAt(j);
				if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') 
				{
					contador+=1;
				}
			}
			
		}
		return contador;
	}
	static String removeEspacosSuperfluos(String frase) 
	{
		StringBuilder novaFrase = new StringBuilder();
		novaFrase.append(frase.trim());
		return novaFrase.toString();
	}
	static int binarioPraDecimal(String binario) 
	{
		int decimal = 0;
		for(int i = binario.length()-1;i >= 0;i--) 
		{	//Character.getNumericValue ele transforma o char em um numero e o math.pow é para fazer o exponencial
			decimal+= Character.getNumericValue(binario.charAt(i)) * Math.pow(2,(binario.length()-1)-i);
		}
		return decimal;
	}
	static int getQtdadePalavras(String frase) 
	{
		String[] palavras = frase.trim().split(" ");
		int qtdade = palavras.length;
		return qtdade;
	}
	static int[]histogramaLetras(String frase)
	{
		int[] histograma = new int [('z' - 'a')+1];
		frase = frase.toLowerCase().replace(" ", "");
		for (int i = 0; i < frase.length(); i++) 
		{
			histograma[frase.charAt(i) - 'a']++;
		}
		return histograma;
	}
}
