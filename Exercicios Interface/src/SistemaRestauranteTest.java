import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class SistemaRestauranteTest {
	
	private SistemaRestaurante sistema;
	private List<Cliente> clientes; 
	private Cliente c;
	private Item i;
	private static final double DOUBLE_TOLERANCE = 0.00000001; 
	
	@Before
	public void setUp() throws Exception 
	{	
		c = new Cliente(1);
		sistema = new SistemaRestaurante();
		clientes = sistema.clientes;
		i = new AlcatraComBatata();
	}

	@Test
	public void AdicionarClienteTest() 
	{	
		sistema.adicionarCliente(c);
		Assert.assertTrue(clientes.contains(c));
	}
	
	@Test
	public void AdicionarPedidoTest() throws ClienteInexistenteException
	{	
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(c, i);
		Assert.assertTrue(c.pedidos.contains(i));
	}
	
	@Test(expected = ClienteInexistenteException.class)
	public void AdicionarPedidoTestFail() throws ClienteInexistenteException
	{	
		sistema.adicionarPedido(c, i);
		Assert.assertTrue(c.pedidos.contains(i));
	}
	
	@Test
	public void removerPedidoTest() throws ClienteInexistenteException 
	{	
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(c,i);
		sistema.removerPedido(c, i);
		Assert.assertFalse(c.pedidos.contains(i));
	}
	
	@Test(expected = ClienteInexistenteException.class)
	public void removerPedidoTestFail() throws ClienteInexistenteException 
	{	
		sistema.adicionarPedido(c,i);
		sistema.removerPedido(c, i);
		Assert.assertFalse(c.pedidos.contains(i));
	}
	
	@Test
	public void ComputaPagamentoTest() throws ClienteInexistenteException 
	{
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(c,i);
		Assert.assertEquals(i.getPreco(), sistema.computarPagamentoCliente(c),DOUBLE_TOLERANCE);
	}
	@Test
	public void receberPagamentoClienteTest() throws ClienteInexistenteException, PagamentoInvalidoException 
	{		
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(c,i);
		double valor = i.getPreco();
		Assert.assertTrue(sistema.receberPagamentoCliente(c, valor));
		
	}
	@Test(expected = PagamentoInvalidoException.class)
	public void receberPagamentoClienteTestFail() throws ClienteInexistenteException, PagamentoInvalidoException 
	{		
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(c,i);
		double valor = 200;
		Assert.assertTrue(sistema.receberPagamentoCliente(c, valor));
		
	}
		
}
