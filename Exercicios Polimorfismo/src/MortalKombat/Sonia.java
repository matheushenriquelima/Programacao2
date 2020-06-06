package MortalKombat;

public class Sonia extends Lutador
{
	public Sonia() 
	{
		super("Sonia",100);
	}
	public void chutar(Lutador l) 
	{
		l.vida-=13;
	}
	public void socar(Lutador l) 
	{
		l.vida-=15;
	}
}
