
public class CampeonatoDeFutebolApp {

	public static void main(String[] args) {
		CampeonatoDeFutebol campeonato = new CampeonatoDeFutebol();
		campeonato.adicionarTimes("Treze Campinense Botafogo AutoEsporte");
		String[] liga = campeonato.criarCampeonato();
		StringBuilder array = new StringBuilder();
		for (int i = 0; i < liga.length; i++) 
		{
			array.append(liga[i]+ " ");
		}
		array.insert(0, '{');
		array.insert(array.length(), '}');
		System.out.println(array);

	}

}
