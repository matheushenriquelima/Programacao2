package ContaBancaria;

public class ContaCorrente extends ContaBancaria
{

	public ContaCorrente(String nome, String senha, double saldo) {
		super(nome, senha, saldo);
	
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws SaldoInsuficienteException, SenhaInvalidaException {
		if(this.senha.equals(senha)) 
		{
			if(valor < 5000) 
			{
				valor+= valor*0.0025;
			}
			else 
			{
				valor+=15;
			}
			if(valor<= this.saldo) 
			{
				this.saldo -= valor;
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
