import java.util.ArrayList;
import java.util.List;

public class Cliente 
{
	private int mesa;
	
	List<Item> pedidos = new ArrayList<Item>();
	
	public Cliente(int mesa) 
	{
		this.mesa = mesa;
	}
	public int getMesa() 
	{
		return mesa;
	}
	public void adicionarPedido(Item i) 
	{
		pedidos.add(i);
	}
	public void removerPedido(Item i) 
	{
		pedidos.remove(i);
	}
	public double getConta() 
	{	double saldo = 700;
		return saldo;
	}
	
}
