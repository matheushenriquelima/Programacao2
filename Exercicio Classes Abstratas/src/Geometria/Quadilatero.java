package Geometria;
public class Quadilatero extends Figura
{	
	protected double lado1,lado2,lado3,lado4;

	public Quadilatero(Cor cor,double lado1,double lado2,double lado3,double lado4) 
	{
		super(cor);
		this.lado1 =lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}


	@Override
	public double calculaArea() {
		double area = lado1*lado2;
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = lado1+lado2+lado3+lado4;
		return perimetro;
	}
	
}
