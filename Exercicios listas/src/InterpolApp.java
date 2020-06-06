
public class InterpolApp {

	public static void main(String[] args) 
	{
		SistemaInterpol interpol = new SistemaInterpol();
		interpol.adicionarProcurado("Fulano");
		interpol.adicionarProcurado("Sicrano");
		interpol.adicionarProcurado("Beltrano");
		System.out.println(interpol.ehProcurado("Matheus"));
		System.out.println(interpol.ehProcurado("Fulano"));
	}

}
