package taller03;
import taller01.Punto;


public class Rectangulo extends Figura {
	protected double base, altura;
	
	public Rectangulo(Punto p, double base, double altura){
		super(p);
		this.base = base;
		this.altura = altura;
	}
	
	public double getArea(){
		return this.base*this.altura;
	}
	
	public double getPerimetro(){
		return this.base*2 + this.altura*2;
	}
	
	public String mostrar(){
		return "Soy un rectángulo, estoy en: " + this.punto.mostrar();
	}
	
}
