package Zoológico;

public class Cavalo extends Animal
{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	@Override
	public void emitirSom() 
	{
		System.out.println("Innnriririri");
	}
	public void correr() 
	{
		System.out.println("Cavalo Trotando");
	}
	
}
