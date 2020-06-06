package MortalKombat;
import java.util.Random;
import java.util.Scanner;

public class MortalKombat 
{
	protected Lutador lutador1,lutador2;
	
	
	public MortalKombat(Lutador lutador1,Lutador lutador2) 
	{
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
		fight();
	}
	public void fight() 
	{	
		Random sorteio = new Random();
		int daVez;
		while(lutador1.getVida() > 0 && lutador2.getVida()>0) 
		{	daVez = sorteio.nextInt(2);
			if(daVez ==0) 
			{	atacar(lutador1,lutador2);
			}
			else 
			{	atacar(lutador2,lutador1);
			}
		}
		System.out.println("-------WINS-------");
		if(lutador1.getVida()>0) 
		{
			System.out.println("Vencedor: "+ lutador1.getNome());
		}
		else 
		{
			System.out.println("Vencedor: "+ lutador2.getNome());
		}
	}
	public void atacar(Lutador l1,Lutador l2) 
	{
		Random sorteio = new Random();
		int ataque = sorteio.nextInt(4);
		if(ataque == 0) 
		{
			l1.atirar(l2);
			System.out.println(l1.getNome() + " atirou em: " + l2.getNome());
		}
		else if(ataque ==1) 
		{
			l1.chutar(l2);
			System.out.println(l1.getNome() + " chutou: " + l2.getNome());
		}
		else if (ataque==2) 
		{
			l1.lancarMagia(l2);
			System.out.println(l1.getNome() + " lançou magia em: " + l2.getNome());
		}
		else 
		{
			l1.socar(l2);
			System.out.println(l1.getNome() + " socou em: " + l2.getNome());
		}
	}
	public static void main(String[] args) 
	{	
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Escolha o seu personagem: \n" + "1.Jax \n"+"2.Liu Kang \n"+"3.Nightwolf \n"
		+"4.Rayden \n" + "5.Sonia \n"+ "6.SubZero");
		int player1 = input.nextInt();
		System.out.println("Escolha o seu personagem: \n" + "1.Jax \n"+"2.Liu Kang \n"+"3.Nightwolf \n"
		+"4.Rayden \n" + "5.Sonia \n"+ "6.SubZero");
		int player2 = input.nextInt();
		Personagem p = new Personagem();
		Lutador l1 = p.escolherPersonagem(player1);
		Lutador l2 = p.escolherPersonagem(player2);
		new MortalKombat(l1,l2);		
		input.close();
	}
}
