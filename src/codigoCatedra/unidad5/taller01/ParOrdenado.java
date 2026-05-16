package taller01;

public class ParOrdenado {
	//atributos o datos
	protected int x;
	protected int y;
	
	
	//constructor
	public ParOrdenado(int x, int y){
		setX(x);
		setY(y);
	}
	
	
	//sobrecarga de constructor:
	public ParOrdenado(){
		x=0;
		y=0;
	}
	
	//métodos:
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int elX){
		x = elX;
	}
	
	public void setY(int elY) {
		y = elY;
	}
	
	public String mostrar(){
		return "(" + getX() + " , " + y + ")";
	}

}
