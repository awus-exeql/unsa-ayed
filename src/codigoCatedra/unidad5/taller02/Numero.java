package codigoCatedra.unidad5.taller02;

import codigoCatedra.unidad5.taller01.ParOrdenado;

public class Numero {
	//atributo o dato:
	private int valor;
	
	//constructor
	public Numero(int elValor){
		valor = elValor;
	}
	
	//metodos:
	public int getValor(){
		return valor;
	}
	
	public void setValor(int elValor){
		valor = elValor;
	}
	
	public ParOrdenado cr(int b){
		int a = valor;
		if (a >= 0 && b > 0) {
			int c = 0;
			while (a >= b) {
				c++;
				a -= b;
			}
			return new ParOrdenado(c, a);
			
		} else {
			System.out.println("Error en datos");
			return new ParOrdenado(-1, -1);
		}
	}
	
//	public int mcd(int b){
//		int a = Math.abs(valor);
//		b = Math.abs(b);
//		if (a == 0 && b == 0) {
//			System.out.println("mcd no definido");
//			return -1;
//		} else {
//			int aux;
//			while (b != 0) {
//				aux = b;
//				b = a % b;///bue pero puede mejorar, cómo????
//				///USAR OTRO NUMERO COMO AUXILIAR PARA ESTO...
//				a = aux;
//			}
//			return a;
//		}
		
		
//		
//		if(valor == 0 && b == 0)
//	}

}
