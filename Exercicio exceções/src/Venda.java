
public class Venda 
{
	private static double VALOR_MINIMO_PARCELA = 50.00;
	private double valor;
	private int qtdParcelas;

	public Venda(double valor) 
	{	
		this.valor = valor;
	}

	public void setQtdParcelas(int qtdParcelas) throws ValorMinimoParcelaException 
	{	
		this.qtdParcelas = qtdParcelas;
		if(VALOR_MINIMO_PARCELA > getValorParcela())
		{
			throw new ValorMinimoParcelaException(qtdParcelas);
		}
	}

	public double getValorParcela() {
		return valor / qtdParcelas;
	}
}
