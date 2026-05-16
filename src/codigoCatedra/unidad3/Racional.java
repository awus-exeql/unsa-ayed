package tpTADS;

public class Racional implements Operaciones {
	//atributos
	private int num;
	private int den;
	
	public Racional(int numerador, int denominador) {
		num = numerador;
		den = denominador;//chequear que no sea cero
	}
	
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public int getDen() {
		return den;
	}



	public void setDen(int den) {
		this.den = den;
	}



	public void sumar(Object a, Object b) {
		// TODO Auto-generated method stub
		Racional r1 = (Racional)a;
		Racional r2 = (Racional)b;
		den = r1.getDen() * r2.getDen();
		num = r1.getNum()*r2.getDen() + r2.getNum()*r1.getDen();//Corregido!, se hizo mal en la Práctica
	}

	public void restar(Object a, Object b) {
		// TODO Auto-generated method stub
		
	}

	public void multiplicar(Object a, Object b) {
		// TODO Auto-generated method stub
		
	}
	
	public String mostrar(){
		return getNum() + "/" + getDen();
	}

}
