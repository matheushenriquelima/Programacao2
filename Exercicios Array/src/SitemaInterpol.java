
public class SitemaInterpol 
{
	String[] procurados;
	
	void adicionarProcurados(String nomes) 
	{
		procurados = nomes.split(" ");
	}
	
	boolean ehProcurado(String nome) 
	{
		boolean wanted = false;
		for (int i = 0; i < procurados.length; i++) 
		{
			if(procurados[i].equals(nome)) 
			{
				wanted = true;
			}
		}
		return wanted;
	}
	
	
}
