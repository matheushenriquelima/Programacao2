import java.util.List;
import java.util.ArrayList;
public class Cardapio 
{
	private List<Item> cardapio = new ArrayList<Item>();
	private List<Bebida> bebidas = new ArrayList<Bebida>();
	private List<Refeicao> refeicoes = new ArrayList<Refeicao>();
	
	public List<Item> getCardapio() 
	{	cardapio.addAll(getBebidas());
		cardapio.addAll(getRefeicoes());
		return cardapio;
	}
	public List<Bebida> getBebidas() {
		CocaMedia c = new CocaMedia();
		SucoPequeno s = new SucoPequeno();
		bebidas.add(c);
		bebidas.add(s);
		return bebidas;
	}
	public List<Refeicao> getRefeicoes() {
		AlcatraComBatata ab = new AlcatraComBatata();
		MacarraoComFrango mf = new MacarraoComFrango();
		refeicoes.add(ab);
		refeicoes.add(mf);
		return refeicoes;
	}
	
	
	
}
