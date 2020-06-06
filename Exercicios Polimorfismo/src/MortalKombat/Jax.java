package MortalKombat;

public class Jax extends Lutador
{

	public Jax() 
	{	super("Jax", 100);
	}
	
	@Override
	public void socar(Lutador l) 
	{
		l.vida-=17;
	}
	
}
