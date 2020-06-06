
public class Carro 
{
	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	public Carro(String nome,String marca,double precoBase) 
	{
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.portas = 2;
		this.cor = "BRANCA";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.direcaoEletrica = false;
		this.cambioAutomatico = false;
		
	}
	
	public Carro() 
	{
	}

	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) 
	{
		
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	public double calculaPreco() 
	{	double precoTotal = precoBase;
		
	switch (cor){
		case "BRANCA":
			precoTotal+=0;
			break;
		case "VERMELHA":
			precoTotal+=0;
			break;
		case "AZUL":
			precoTotal+=0;
			break;
		case "PRETA":
			precoTotal+=0;
			break;

		default:
			precoTotal+=1000;
			break;
		}
		if(vidroEletrico) 
		{
			precoTotal+= 1250;
		}
		if (arCondicionado) 
		{
			precoTotal+= 1250;
		}
		if (cambioAutomatico) 
		{
			precoTotal+= 1250;
		}
		if(direcaoEletrica) 
		{
			precoTotal+= 1250;
		}
		return precoTotal;
	}

	public String toString() 
	{
		return "Nome: " + this.nome + "\n" + "Marca: " + this.marca + "\n" + "Cor: " + this.cor + "\n" + "Portas: "  + this.portas + "\n" + "Vidro Eletrico: " + (this.vidroEletrico == true? "sim": "nao") + "\n" + "Ar Condicionado: " + (this.arCondicionado==true? "sim": "não") + "\n" + "Cambio Automtico: " + (this.cambioAutomatico == true? "sim": "não") + "\n" + "Direcao eletrica: " + (this.direcaoEletrica == true? "sim":"não") + "\n" + "Preco: " + this.calculaPreco(); 	
	}
	
}
