import java.util.List;
import java.util.ArrayList;
public class LojaDeCarros 
{
	private List<Carro> carrosDisponiveis = new ArrayList<Carro>();
	public List<Carro> carrosVendidos = new ArrayList<Carro>();
	public void adicionarCarro(Carro carro) 
	{
		carrosDisponiveis.add(carro);
	}
	public void exibirCarrosDisponiveis() 
	{	for(Carro car: carrosDisponiveis) 
		{
			System.out.println(car);
		}
	}
	public int venderCarro(int id) 
	{	int vendas = 0;
		for(Carro carro: carrosDisponiveis) 
		{
			if(carro.id == id) 
			{
				carrosVendidos.add(carro);
				vendas++;
			}
		}
		return vendas;
	}
	public void adicionarPromocao(int id) 
	{
		for(Carro carro: carrosDisponiveis) 
		{
			if(carro.id == id) 
			{
				carro.promocao = true;
			}
		}
	}
	public double computaApuradoDasVendas() 
	{	double apurado = 0;
		for(Carro carro: carrosVendidos) 
		{
			apurado+= carro.calculaPreco();
		}
		return apurado;
	}
	public void limparVendidos() 
	{
		carrosVendidos.clear();
	}
}
