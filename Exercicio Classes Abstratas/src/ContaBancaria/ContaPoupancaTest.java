package ContaBancaria;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaPoupancaTest {
	private ContaPoupanca conta,conta2;
	private static final double DOUBLE_TOLERANCE = 0.00000001;
	@Before
	public void setUp() throws Exception 
	{
		conta = new ContaPoupanca("Matheus", "123456", 500);
		conta2 = new ContaPoupanca("Eduardo", "654321", 500);
	}

	@Test
	public void transferirComSaldoTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("123456", 300, conta2);
		Assert.assertEquals(195, conta.saldo,DOUBLE_TOLERANCE);
	}
	
	@Test(expected = SaldoInsuficienteException.class)
	public void transferirSemSaldoTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("123456", 600, conta2);
		Assert.assertEquals(500, conta.saldo,DOUBLE_TOLERANCE);
	}
	@Test
	public void transferirComSenhaCorretaTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("123456", 400, conta2);
		Assert.assertEquals(95, conta.saldo,DOUBLE_TOLERANCE);
	}
	@Test(expected = SenhaInvalidaException.class)
	public void transferirComSenhaInvalidaTest() throws SaldoInsuficienteException, SenhaInvalidaException 
	{
		conta.transferir("12345", 600, conta2);
		Assert.assertEquals(500, conta.saldo,DOUBLE_TOLERANCE);
	}
}
