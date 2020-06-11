package ContaBancaria;

public class SenhaInvalidaException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2113396708467455834L;

	public SenhaInvalidaException() 
	{
		super("Senha inválida");
	}
	
}
