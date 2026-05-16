
package taller03;
import taller01.Punto;

public abstract class Figura implements IMovible {
	protected Punto punto;
	
	public Figura(Punto punto){
		this.punto = punto;
	}
	
	public Figura(){
		this.punto = new Punto();
	}
	
	public abstract double getPerimetro();
	
	public abstract double getArea();
	
	public double getAreaPorK(int k){
		return k*getArea();
	}
	
	public abstract String mostrar();
	
	public void moverArriba(){
		this.punto.setY(this.punto.getY() + 1);
	}
	public void moverAbajo(){
		
	}
	public void moverDerecha(){
		this.punto.moverDerecha();
	}
	public void moverIzquierda(){
		
	}
}
