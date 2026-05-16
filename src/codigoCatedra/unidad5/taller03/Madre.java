package taller03;

public class Madre {
	//atributos
	protected int x;
	
	
	//constructores
	public Madre(int x){
		this.x = x;
	}
	
	public Madre(){
		this(0);
	}
	
	//metodos
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return this.x;
	}
	
	public String mostrar(){
		return "x: " + this.x;
	}
	
}
