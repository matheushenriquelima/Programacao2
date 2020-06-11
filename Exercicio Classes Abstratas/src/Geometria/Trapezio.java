package Geometria;
public class Trapezio extends Quadilatero 
{
	private double altura;
	private double ladoMaior,ladoMenor;
	public Trapezio(Cor cor, double ladoMaior, double ladoMenor, double lado1, double lado2,double altura) 
	{
		super(cor, ladoMaior, ladoMenor,lado1,lado2 );
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() 
	{
		double area = ((ladoMaior+ladoMenor)*altura)/2;
		return area;
	}
}
