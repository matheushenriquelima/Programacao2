
public class TesteStringUtils {

	public static void main(String[] args) {
		StringUtils s = new StringUtils();
		System.out.println(s.formataAtributo("quantidade de questoes"));
		System.out.println(s.formataMetodo("quantidade de questoes"));
		System.out.println(s.formataClasse("quantidade de questoes"));
		System.out.println(s.ordenaStrings("fiat", "chevrolet"));
		System.out.println(s.ordenaStrings("chevrolet", "fiat"));
		System.out.println(s.ehPalindromo("arara"));
		System.out.println(s.contaVogais("In god we trust"));
		System.out.println(s.removeEspacosSuperfluos(" programar eh muito facil "));
		System.out.println(s.getQtdadePalavras("programar eh muito facil"));
		System.out.println(s.binarioPraDecimal("101110010"));
		int[] histograma = s.histogramaLetras("the quick brown fox jumps over the lazy dog");
		String array = "[ ";
		for (int i = 0; i < histograma.length; i++) 
		{
			array+= histograma[i] + ", ";
			if(i == histograma.length - 1) 
			{
				array += histograma[i] + " ]";
			}
		}
		System.out.println(array);
		
	
	}

}
