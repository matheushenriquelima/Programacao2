package MortalKombat;

public class Rayden extends Lutador 
{
	public Rayden() 
	{
		super("Rayden",100);
	}
	
	@Override
	public void lancarMagia(Lutador l) 
	{
		l.vida-=21;
	}
	
}
