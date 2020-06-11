
public abstract class Bebida implements Item
{
	private Tamanho tamanho;
	private SaborBebida sabor;
	
	public Bebida(Tamanho tamanho, SaborBebida sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}
	
	public Tamanho getTamanho() 
	{
		return tamanho;
	}
	public SaborBebida getSaborBebida() 
	{
		return sabor;
	}
	@Override
	public double getPreco() {
		double preco = tamanho.valorBebida + sabor.valorBebida;
		return preco;
	}
	@Override
	public String getDescricao() {
		String descricao = "Bebida: " + sabor.saborBebida + "\n";
		descricao += "Tamanho: " + tamanho.toString() + "\n";
		descricao+= "Preço: " + getPreco(); 
		return descricao;
	}
}
