
public class CampeonatoDeFutebol 
{
	String [] times;
	 void adicionarTimes(String time) 
	 {
		 this.times = time.split(" ");
	 }
	 
	 String[] criarCampeonato() 
	 {	 int qtdJogos = (this.times.length-1)*2;	
		 String[] campeonato = new String[qtdJogos];
		 int posicao = 0;
		 for (int i = 0; i < times.length-1; i++) 
		 {
			 for (int j = i+1; j < times.length; j++) 
			 {
				 campeonato[posicao++] = times[i] + " X "  + times[j]; 
			 }
			 
		 }
		 return campeonato;
	 }
}
