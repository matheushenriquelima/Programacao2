
public class ValorMinimoParcelaException extends Exception
{
	public ValorMinimoParcelaException(int parcelas)
	{
		super("Informe uma quantidade menor que "+ parcelas + " parcelas");
	}
}
