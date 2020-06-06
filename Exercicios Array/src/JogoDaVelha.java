
public class JogoDaVelha 
{	
	char[][] tabuleiro;
	boolean jogador1;
	String aux = " ";
	
	public JogoDaVelha() 
	{
		this.tabuleiro = new char [3][3];
		this.jogador1 = true;
		this.iniciarJogo();
	}
	
	public void iniciarJogo() 
	{
		this.tabuleiro = new char[3][3];
		for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
            {
                tabuleiro[i][j] = ' ';
            }
		
		}
	}


	boolean jogar(int linha,int coluna) 
	{	char simbolo;
		
		if(jogador1) 
		{
			simbolo = 'x';
		}
		else 
		{
			simbolo = 'o';
		}
		if(linha < 3 && linha>=0) 
		{	if(coluna< 3 && coluna>=0 ) 
			{
			if(tabuleiro[linha][coluna] == ' ' && tabuleiro[linha][coluna] != simbolo ) 
			{
				tabuleiro[linha][coluna] = simbolo;
				aux ="\n" +"  | "+tabuleiro[0][0]+" | "+tabuleiro[0][1]+" | "+tabuleiro[0][2]+" | "
			     +"\n" +"  | "+tabuleiro[1][0]+" | "+tabuleiro[1][1]+" | "+tabuleiro[1][2]+" | "
				 +"\n" +"  | "+tabuleiro[2][0]+" | "+tabuleiro[2][1]+" | "+tabuleiro[2][2]+" | "+"\n";
				if(simbolo == 'o') 
				{
					jogador1 = true;
					System.out.println("\n"+"Vez Jogador 2");
				}
				else 
				{
					jogador1= false;
					System.out.println("\n"+"Vez Jogador 1");
				}
		}
			else 
			{
				System.out.println("Espaço preenchido, tente novamente!");
			}
			System.out.println(aux);
			
			}
		}
		return detectaFimDeJogo();
	}
	boolean detectaFimDeJogo() 
	{	if(tabuleiro[0][0] != ' ')
		{
        	if(tabuleiro[0][1] == tabuleiro[0][0] && tabuleiro[0][2] == tabuleiro[0][0] ||
	              tabuleiro[1][0] == tabuleiro[0][0] && tabuleiro[2][0] == tabuleiro[0][0] ||
	              tabuleiro[1][1] == tabuleiro[0][0] && tabuleiro[2][2] == tabuleiro[0][0]) 
        	{
        			return true; 
	        }
	       }
	       if(tabuleiro[0][1] != ' '){
	           if(tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][2] == tabuleiro[0][1] ||
	              tabuleiro[1][1] == tabuleiro[0][1] && tabuleiro[2][1] == tabuleiro[0][1]){
	        	   return true; 
	           }
	           
	       }
	       if(tabuleiro[0][2] != ' '){
	           if(tabuleiro[0][1] == tabuleiro[0][2] && tabuleiro[0][0] == tabuleiro[0][2] ||
	              tabuleiro[1][2] == tabuleiro[0][2] && tabuleiro[2][2] == tabuleiro[0][2] ||
	              tabuleiro[1][1] == tabuleiro[0][2] && tabuleiro[2][0] == tabuleiro[0][2]){
	        	   return true; 
	           }
	       }
	       
	       if(tabuleiro[1][0] != ' '){
	           if(tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[2][0] == tabuleiro[1][0] ||
	              tabuleiro[1][1] == tabuleiro[1][0] && tabuleiro[1][2] == tabuleiro[1][0]){
	        	   return true; 
	           }
	       }
	       if(tabuleiro[1][1] != ' '){
	           if(tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[2][1] == tabuleiro[1][1] ||
	              tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][2] == tabuleiro[1][1] ||
	              tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[2][2] == tabuleiro[1][1] ||
	              tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[1][1]){
	        	   return true; 
	           }
	       }
	       if(tabuleiro[1][2] != ' '){
	           if(tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[2][2] == tabuleiro[1][2] ||
	              tabuleiro[1][1] == tabuleiro[1][2] && tabuleiro[1][0] == tabuleiro[1][2]){
	        	   return true; 
	           }
	       }
	       
	       if(tabuleiro[2][0] != ' '){
	           if(tabuleiro[0][0] == tabuleiro[2][0] && tabuleiro[1][0] == tabuleiro[2][0] ||
	              tabuleiro[2][1] == tabuleiro[2][0] && tabuleiro[2][2] == tabuleiro[2][0] ||
	              tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] == tabuleiro[2][0]){
	        	   return true; 
	           }
	       }
	       if(tabuleiro[2][1] != ' '){
	           if(tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][2] == tabuleiro[2][1] ||
	              tabuleiro[1][1] == tabuleiro[2][1] && tabuleiro[0][1] == tabuleiro[2][1]){
	        	   return true; 
	           }
	       }
	       if(tabuleiro[2][2] != ' '){
	           if(tabuleiro[2][1] == tabuleiro[2][2] && tabuleiro[2][0] == tabuleiro[2][2] ||
	              tabuleiro[1][2] == tabuleiro[2][2] && tabuleiro[0][2] == tabuleiro[2][2]  ||
	              tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] == tabuleiro[2][2]){
	        	   return true; 
	           }
	       }
	       return false;
	}
}
