import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
	
	private Cliente c;
	private Item i;
	private static final double DOUBLE_TOLERANCE = 0.00000001; 
	@Before
	public void setUp() throws Exception 
	{
		c = new Cliente(1);
		i = new AlcatraComBatata();
	}

	@Test
	public void AdicionarPedidoTest() 
	{	
		c.adicionarPedido(i);
		Assert.assertTrue(c.pedidos.contains(i));
	}
	
	@Test
	public void RemoverPedidoTest() 
	{	
		c.adicionarPedido(i);
		c.removerPedido(i);
		Assert.assertFalse(c.pedidos.contains(i));
	}
	


}
