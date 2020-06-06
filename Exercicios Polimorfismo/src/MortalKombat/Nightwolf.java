package MortalKombat;

public class Nightwolf extends Lutador 
{

	public Nightwolf() {
		super("Nightwolf", 100);
	}
	
	@Override
	public void atirar(Lutador l) 
	{
		l.vida-=15;
	}
	@Override
	public void lancarMagia(Lutador l) 
	{
		l.vida-=18;
	}

}
