package Zoológico;

public class Preguica extends Animal 
{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	public void emitirSom() 
	{
		System.out.println("ZZzzzzZZZZzzzz");
	}
	public void escalarArvore() 
	{
		System.out.println("Nao");
	}
}
