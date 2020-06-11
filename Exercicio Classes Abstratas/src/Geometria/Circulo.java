package Geometria;
public class Circulo extends Figura 
{
	private double raio;
	public Circulo(Cor cor,double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		double area = Math.PI * raio;
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = Math.PI * Math.sqrt(raio);
		return perimetro;
	}

}
