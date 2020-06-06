package Zoológico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico 
{
	private List<Animal> jaulas;
	
	public Zoologico() 
	{	jaulas = new ArrayList<Animal>();
		jaulas.add(new Cachorro("Bob",10));
		jaulas.add(new Cavalo("Pé de pano",5));
		jaulas.add(new Preguica("Bahiano",8));
		jaulas.add(new Cachorro("Snoop dog",9));
		jaulas.add(new Cavalo("Donatelo",7));
	}
	public void cutucar() 
	{
		for(Animal a:jaulas) 
		{	System.out.println(a);
			a.emitirSom();
			if(a instanceof Cachorro) 
			{
				Cachorro c = (Cachorro) a;
				c.correr();
			}
			else if(a instanceof Cavalo) 
			{
				Cavalo c = (Cavalo) a;
				c.correr();
			}
			else if(a instanceof Preguica) 
			{
				Preguica p = (Preguica) a;
				p.escalarArvore();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Zoologico z = new Zoologico();
		z.cutucar();
	}
}
