package MortalKombat;

import java.util.ArrayList;
import java.util.List;

public class Personagem 
{
	public Lutador escolherPersonagem(int numero) {
	List<Lutador> lutadores = new ArrayList<Lutador>();
	Lutador personagem = null;
	lutadores.add(new Jax());
	lutadores.add(new LiuKang());
	lutadores.add(new Nightwolf());
	lutadores.add(new Rayden());
	lutadores.add(new Sonia());
	lutadores.add(new SubZero());
	
	switch (numero) 
	{
	case 1:
		personagem = lutadores.get(0);
		break ;
	case 2:
		personagem = lutadores.get(1);
		break;
	case 3:
		personagem = lutadores.get(2);
		break;
	case 4:
		personagem = lutadores.get(3);
		break;
	case 5:
		personagem = lutadores.get(4);
		break;
	case 6:
		personagem = lutadores.get(5);
	}
	return personagem;
	}
}
