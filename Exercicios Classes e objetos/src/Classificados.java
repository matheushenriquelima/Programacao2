
public class Classificados 
{ 	
	public static void main(String[] args) {
		Imoveis casa1 =  new Imoveis("Falcão", 3,1,120,true,false,2);
		Imoveis apartamento1 = new Imoveis("Apartamento","Falcão",15,8,3,2,3,82,false,false,true);
		Imoveis casa2 =  new Imoveis("Altaman", 4,2,240,true,true,5);
		Imoveis casa3 =  new Imoveis("Leblon", 6,3,540,true,true,5);
		Imoveis apartamento2 = new Imoveis("Apartamento","Alto Branco",3,2,2,1,2,60,false,false,false);
		System.out.println(casa1);
		System.out.println(apartamento1);
		System.out.println(casa2);
		System.out.println(casa3);
		System.out.println(apartamento2);

}

}
