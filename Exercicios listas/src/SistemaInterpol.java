import java.util.List;
import java.util.ArrayList;
public class SistemaInterpol 
{	
	List<String> procurados = new ArrayList<String>();
	void adicionarProcurado(String nome) 
	{
		procurados.add(nome);
	}
	boolean ehProcurado(String nome) 
	{
		for(String n: procurados) 
		{
			if(n.equals(nome)) 
			{
				return true;
			}
		}
		return false;
	}
}
