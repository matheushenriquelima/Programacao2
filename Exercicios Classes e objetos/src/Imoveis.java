
public class Imoveis 
{
	String casa,apto, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean piscina, quadra,elevador;
	
	public Imoveis(String imobiliaria,int quartos,int suites,int metrosQuadrados, boolean piscina,boolean quadra, int banheiros) 
	{	//this.pavimento = 0;
		//this.pavimentos = 0;
		this.elevador = false;
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.casa = "Casa";
		this.imobiliaria = imobiliaria;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		//this.apto = "";
	}

	public Imoveis(String apto, String imobiliaria, int pavimentos, int pavimento, int quartos, int suites,
			int banheiros, int metrosQuadrados, boolean piscina, boolean quadra, boolean elevador) 
	{
		this.elevador = elevador;
		this.apto = apto;
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	public double calculaPreco() 
	{
		double preco = metrosQuadrados*5000;
		if(pavimento>=5) 
		{
			preco+=2000*pavimento;
		}
		if(elevador) 
		{
			preco+=2500;
		}
		if(piscina) 
		{
			preco+=2500;
		}
		if(quadra) 
		{
			preco+=2500;
		}
		return preco;
	}
	public String toString() 
	{	String saida = "";
		if(this.casa!= null) 
		{
			saida+= "Casa, " + "Imoboliaria " + imobiliaria + ", " + quartos + " quarto(s), " + suites + " suíte(s), " + banheiros + " banheiro(s), " + metrosQuadrados +"m²";
			if(piscina) 
			{
				saida+= ", com piscina";
			}
			if(quadra) 
			{
				saida+= ", quadra";
			}
			saida+=". Preço Total: " + calculaPreco();
		}
		else 
		{
			saida+= apto + ", Imoboliaria " + imobiliaria + ", " + pavimentos + " andares, " + "apartamento no pavimento " + pavimento + ", "  + quartos + " quarto(s), " + suites + " suíte(s), " + banheiros + " banheiro(s), " + metrosQuadrados +"m²";
			if(piscina) 
			{
				saida+= ", com piscina";
			}
			if(quadra) 
			{
				saida+= ", quadra";
			}
			if(elevador) 
			{
				saida+= ", com elevador";
			}
			else 
			{
				saida+= ", sem elevador";
			}
			saida+=". Preço Total: " + calculaPreco()+".";
		}
		return saida;
	}
}
