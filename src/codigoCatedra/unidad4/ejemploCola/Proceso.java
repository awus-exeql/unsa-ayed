package codigoCatedra.unidad4.ejemploCola;

import java.util.Random;

public class Proceso {
	private static int nextID = 1;
	private int id;
	private int tiempo;
	private int cantAtenciones;
	
	public Proceso(){
		this.id = nextID++;
		this.tiempo = new Random().nextInt(10) + 1;
		this.cantAtenciones = 0;
		System.out.println("Proceso ID: " + this.id + " tiempo " + this.tiempo);
	}
	
	public int getId(){
		return this.id;
	}
	
	public void incAtencion(){
		this.cantAtenciones++;
	}
	
	public int getTiempo(){
		return this.tiempo;
	}
	
	public void setTiempo(int tiempo){
		this.tiempo = tiempo;
	}
	
	public int getAtenciones(){
		return this.cantAtenciones;
	}
}
