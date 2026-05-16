package codigoCatedra.unidad5.taller01;
import codigoCatedra.unidad5.taller03.IMovible;

public class Punto extends ParOrdenado implements IMovible {
	
	public Punto(int x, int y){
		super(x, y);
	}
	
	public Punto(){
		super();
	}
	
	public double distanciaOrigen(){
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
	}

	public void moverArriba() {
		// TODO Auto-generated method stub
		
	}

	public void moverAbajo() {
		// TODO Auto-generated method stub
		
	}

	public void moverDerecha() {
		// TODO Auto-generated method stub
		this.x++;
	}

	public void moverIzquierda() {
		// TODO Auto-generated method stub
		
	}
	
	
}
