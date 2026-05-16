package codigoCatedra.unidad1;

public class Test {

	public static int cociente(int a, int b){
		if (a >= 0 && b > 0) {
			int c = 0;
			while (a >= b) {
				c++;
				a -= b;
			}
			return c;
			
		} else {
			System.out.println("Error en datos");
			return -1;
		}
	}
	
	public static int resto(int a, int b){
		if (a >= 0 && b > 0) {
		
			while (a >= b) {
			
				a -= b;
			}
			return a;
			
		} else {
			System.out.println("Error en datos");
			return -1;
		}
	}
	
	public static ParOrdenado cr(int a, int b){
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
	
	/*
	 * Completar con crEntero, criba, mcd, mcm, st
	 * 
	 * ¿Cómo mejoraría esto para no tener en Test todas
	 * las funcionalidades?
	 * 		Tip: Pensar en una clase Numero y poner los métodos ahí
	 * 
	 */
	
	public static void main(String[] args){
		//System.out.println(cociente(13,7));
		//System.out.println(resto(13,7));
		
		byte peque = 127;
		byte peque2;
		peque2 = peque;
		peque2 = 8;
		System.out.println(peque2 + " " + peque);
		
	
		ParOrdenado par = new ParOrdenado(1, 1);
		ParOrdenado par2;
		par2 = par;//hacen referencia al mismo objeto
		par2.setX(3);//un cambio en par2 es un cambio en par
		
		System.out.println(par2.mostrar() + " " + par.mostrar());

		
		
		System.out.println(cr(13,7).mostrar());
		
		ParOrdenado resultado = cr(13,7);
		System.out.println(resultado.mostrar());
		
	}

}
