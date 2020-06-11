
public class AlcatraComBatata implements Refeicao 
{
	private Proteina proteina = Proteina.Alcatra;
	private Carboidrato carbo = Carboidrato.Batata;
	
	public Proteina getProteina() 
	{
		return proteina;
	}
	public Carboidrato getCarboidrato() 
	{
		return carbo;
	}
	@Override
	public double getPreco() {
		double preco = proteina.valorProteina + carbo.valorCarboidrato;
		return preco;
	}
	@Override
	public String getDescricao() {
		String descricao = "Refeição: ";
		descricao+= carbo.toString();
		descricao+= " com ";
		descricao+= proteina.toString() + "\n";
		descricao+= "Preço: " + getPreco();
		return descricao;
	}
	
}
