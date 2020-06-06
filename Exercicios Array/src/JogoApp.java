import java.util.Scanner;

public class JogoApp {

	public static void main(String[] args) 
	{	System.out.println("--------------- JOGO DA VELHA ---------------");
		JogoDaVelha jogo = new JogoDaVelha();
		Scanner teclado = new Scanner(System.in);
		do 
		{	System.out.print("Infome a linha: ");
			int linha = teclado.nextInt();
			System.out.print("Informe a Coluna: ");
			int coluna = teclado.nextInt();
			jogo.jogar(linha, coluna);
		}
		while(!jogo.detectaFimDeJogo());
		if(jogo.detectaFimDeJogo() == true) 
		{
			System.out.println("FIM DE JOGO");
		}
		teclado.close();
		
	}

}
