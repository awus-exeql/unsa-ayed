package taller03;

import taller01.Punto;

public class Circulo extends Figura {
	protected double radio;
	
	public Circulo(Punto p, double radio){
		super(p);
		this.radio = radio;
	}
	
	public double getPerimetro(){
		return Math.PI * this.radio * 2;
	}
	
	public double getArea() {
		return Math.PI * this.radio * this.radio;
	}
	
	public String mostrar(){
		return "Soy un circulo, estoy en : " + punto.mostrar();
	}
}
