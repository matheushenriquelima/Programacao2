import java.util.List;
import java.util.ArrayList;
public class ListaApp {

	public static void main(String[] args) 
	{
		ListaMathUtils lista = new ListaMathUtils();
		List<Integer> divisores = lista.calculaDivisores(32);
		for(int divisor: divisores) 
		{
			System.out.print(divisor+" ");
		}
		System.out.println("");
		List<Double> numeros = new ArrayList<Double>();
		numeros.add(12.4);
		numeros.add(43.1);
		numeros.add(4.3);
		numeros.add(54.0);
		numeros.add(6.7);
		System.out.println(lista.computaMaior(numeros));
		System.out.println(lista.computaMenor(numeros));
		System.out.println(lista.computaMedia(numeros));
		System.out.println(lista.temNumRepetido(numeros));
	}

}
