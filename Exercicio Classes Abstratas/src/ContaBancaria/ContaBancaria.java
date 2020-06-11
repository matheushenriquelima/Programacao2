package ContaBancaria;

public abstract class ContaBancaria 
{
	protected String nome;
	protected String senha;
	protected double saldo;
	
	public ContaBancaria(String nome, String senha, double saldo) 
	{
		this.nome = nome;
		this.senha = senha;
		this.saldo  = saldo;
	}
	
	public String getNome() 
	{
		return nome;
	}
	public double getSaldo() 
	{
		return saldo;
	}
	public abstract void transferir(String senha,double valor,ContaBancaria conta) throws SaldoInsuficienteException,SenhaInvalidaException;
	
}
