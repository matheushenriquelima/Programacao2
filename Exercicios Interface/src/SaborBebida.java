
public enum SaborBebida 
{
	COCA(4,"Coca cola"),FANTA(4,"Fanta"),SUCO(5,"Suco"),CERVEJA(9,"Cerveja"),CAIPIRINHA(8,"Caipirinha"),AGUA_COM_GAS(3,"Agua com gás");
	public int valorBebida;
	public String saborBebida;
	SaborBebida(int valor,String bebida)
	{
		valorBebida = valor;
		saborBebida = bebida;
	}
}
