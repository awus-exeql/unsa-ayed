package codigoCatedra.unidad3;

public class TestRacional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Racional racional1 = new Racional(1,2);
		Racional racional2 = new Racional(3,2);
		Racional racional3 = new Racional(0,1);

		racional3.sumar(racional1, racional2);
		
		System.out.println(racional1.mostrar());
		System.out.println(racional2.mostrar());
		System.out.println(racional3.mostrar());

	}

}
