package MortalKombat;

public class SubZero extends Lutador
{
	public SubZero() 
	{
		super("SubZero",100);
	}
	@Override
	public void lancarMagia(Lutador l)
	{
		l.vida-=20;
	}
}
