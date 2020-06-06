package MortalKombat;

public class LiuKang extends Lutador
{
	public LiuKang() 
	{
		super("Liu Kang",100);
	}
	
	@Override
	public void chutar(Lutador l) 
	{
		l.vida-=14;
	}
	@Override
	public void lancarMagia(Lutador l) 
	{
		l.vida-=20;
	}
}
