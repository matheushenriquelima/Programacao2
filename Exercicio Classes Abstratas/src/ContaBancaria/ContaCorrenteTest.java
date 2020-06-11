package ContaBancaria;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTest {
	private ContaCorrente conta,conta2;
	private static final double DOUBLE_TOLERANCE = 0.00000001;
	@Before
	public void setUp() throws Exception 
	{
		conta = new ContaCorrente("Matheus", "123456", 25000);
		conta2 = new ContaCorrente("Eduardo", "654321", 25000);
	}

	@Test
	public void transferirComSaldoTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("123456", 2000, conta2);
		Assert.assertEquals(22995, conta.saldo,DOUBLE_TOLERANCE);
	}
	@Test
	public void transferirComSaldoSegundoTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("123456", 20000, conta2);
		Assert.assertEquals(4985, conta.saldo,DOUBLE_TOLERANCE);
	}
	
	@Test(expected = SaldoInsuficienteException.class)
	public void transferirSemSaldoTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("123456", 60000, conta2);
		Assert.assertEquals(25000, conta.saldo,DOUBLE_TOLERANCE);
	}
	@Test
	public void transferirComSenhaCorretaTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("123456", 2000, conta2);
		Assert.assertEquals(22995, conta.saldo,DOUBLE_TOLERANCE);
	}
	@Test(expected = SenhaInvalidaException.class)
	public void transferirComSenhaInvalidaTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("12345", 600, conta2);
		Assert.assertEquals(500, conta.saldo,DOUBLE_TOLERANCE);
	}


}
