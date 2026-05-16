package taller03;

import taller01.Punto;

public class Cuadrado extends Figura {
	protected double lado;
	
	public Cuadrado(Punto p, double lado){
		super(p);
		this.lado = lado;
	}
	
	public double getPerimetro(){
		return this.lado * 4;
	}
	
	public double getArea() {
		return this.lado * this.lado;
	}
	
	public String mostrar(){
		return "Soy un cuadrado, estoy en : " + punto.mostrar();
	}
}
