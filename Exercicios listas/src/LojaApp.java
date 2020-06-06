
public class LojaApp {

	public static void main(String[] args) {
		LojaDeCarros loja = new LojaDeCarros();
		Carro palio = new Carro("Palio", "FIAT", 35000);
		Carro palioPrata = new Carro("Palio", "FIAT", "PRATA", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "HONDA", "BRANCA", 4, true, true, true, true, 110000);
		Carro corolla = new Carro("Corolla", "TOYOTA"," PRETA", 4,true,true,false,true, 110000);
		//adicionando os carros a loja
		loja.adicionarCarro(palio);
		loja.adicionarCarro(palioPrata);
		loja.adicionarCarro(civic);
		loja.adicionarCarro(corolla);
		//verificando seus id
		//int id1 = palio.id;
		//int id2 = palioPrata.id;
		int id3 = civic.id;
		int id4 = corolla.id;
		//exibir carros disponiveis
		System.out.println("Carros disponiveis: ");
		loja.exibirCarrosDisponiveis();
		System.out.println(" ");
		// vendendo o carro 3
		loja.venderCarro(id3);
		// adicionando promocao no carro 4
		loja.adicionarPromocao(id4);
		// vendendo o carro 4
		loja.venderCarro(id4);
		// computando o apurado das vendas realizadas
		System.out.println("Apurados: " + loja.computaApuradoDasVendas());
		System.out.println(" ");
		//exibindo a lista de vendidos para logo apos verificar se foram apagados
		System.out.println("Carros Vendidos: ");
		for(Carro carro: loja.carrosVendidos) 
		{
			System.out.println(carro);
		}
		// verificando se os carros foram removidos da lista de vendidos
		System.out.print("[ ");
		loja.limparVendidos();
		for(Carro carro: loja.carrosVendidos) 
		{
			System.out.print(carro);
		}
		System.out.print(" ]");
		
	}

}
