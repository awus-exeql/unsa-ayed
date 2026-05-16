package codigoCatedra.unidad4.ejemploCola;

import codigoCatedra.unidad4.contenedores.ColaArr;
import codigoCatedra.unidad4.ejemploCola.Proceso;

public class CPU {
	private ColaArr cola;
	private int tiempo;
	
	public CPU(int tiempo, int tam){
		this.cola = new ColaArr(tam);
		this.tiempo = tiempo;
	}
	
	public void cargar(){
		while(!this.cola.estaLlena()) {
			this.cola.meter(new Proceso());
		}
	}
	
	public void atender(){
		while (!this.cola.estaVacia()) {
			 Proceso p = (Proceso)this.cola.sacar();
			 p.incAtencion();
			 if (p.getTiempo() > this.tiempo) {
				 p.setTiempo(p.getTiempo()-tiempo);
				 this.cola.meter(p);
			 }else{
				 System.out.println("Proceso ID " + p.getId()
						 +" atendido " + p.getAtenciones() + 
						 " tiempo ocioso " + (tiempo-p.getTiempo()));
			 }
		}
	}
}
