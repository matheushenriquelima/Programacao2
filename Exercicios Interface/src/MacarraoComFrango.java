
public class MacarraoComFrango implements Refeicao 
{
	private Proteina proteina = Proteina.Frango;
	private Carboidrato carbo = Carboidrato.Macarrao;
	
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
		String descricao = "Refei��o: ";
		descricao+= carbo.toString();
		descricao+= " com ";
		descricao+= proteina.toString() + "\n";
		descricao+= "Pre�o: " + getPreco();
		return descricao;
	}
}
