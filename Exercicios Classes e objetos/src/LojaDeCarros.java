
public class LojaDeCarros {

	public static void main(String[] args) {
		Carro palio = new Carro("Palio", "FIAT", 35000);
		Carro palioPrata = new Carro("Palio", "FIAT", "PRATA", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "HONDA", "BRANCA", 4, true, true, true, true, 110000);
		Carro corolla = new Carro("Corolla", "TOYOTA"," PRETA", 4,true,true,false,true, 110000);
		//Carro gol = new Carro();
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(civic);
		System.out.println(corolla);

	
	}

}
