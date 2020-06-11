package ContaBancaria;

public class ContaPoupanca extends ContaBancaria
{	private static final double custoTransferencia = 5;

	public ContaPoupanca(String nome, String senha, double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws SaldoInsuficienteException, SenhaInvalidaException {
		if(this.senha.equals(senha)) 
		{
			if(valor + custoTransferencia <= this.saldo) 
			{
				this.saldo -=  valor+custoTransferencia;
			}
			else 
			{
				throw new SaldoInsuficienteException();
			}
		}
		else 
		{
			throw new SenhaInvalidaException();
		}
		
	}
	
}
