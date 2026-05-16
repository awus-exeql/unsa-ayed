package taller03;

public class Hija extends Madre {
	private double w;
	
	public Hija(int x, double w){
		super(x);
		this.w = w;
	}
	
	public Hija(){
		this(0, 0);
		//super();
		//this.w = 0;
	}
	
	public void setW(double w){
		this.w = w;
	}
	
	public double getW(){
		return this.w;
	}
	
	public String mostrar(){
		//quiero mostar x: valordex w: valordew
		return "x: " + this.x + " w: " + this.w;
	}
}
