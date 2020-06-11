import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante 
{	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionarCliente(Cliente c) 
	{	
		clientes.add(c);
	}
	public void adicionarPedido(Cliente c,Item i) throws ClienteInexistenteException 
	{
		if(clientes.contains(c))
		{
			c.adicionarPedido(i);
		}
		else 
		{
		   throw new ClienteInexistenteException();
		}
	}
	public void removerPedido(Cliente c,Item i) throws ClienteInexistenteException
	{	
		if(clientes.contains(c)) 
		{
			c.removerPedido(i);			
		}
		else 
		{
			throw new ClienteInexistenteException();
		}
	}
	public double computarPagamentoCliente(Cliente c) 
	{	double total = 0;
		for(Item i :c.pedidos) 
		{
			total+= i.getPreco();
		}
		return total;
	}
	public boolean receberPagamentoCliente(Cliente c, double pagamento) throws PagamentoInvalidoException
	{
		if(pagamento == computarPagamentoCliente(c)) 
		{
			System.out.println("Pagamento Realizado");
			return true;
		}
		else 
		{
			throw new PagamentoInvalidoException();
		}
	}
}
