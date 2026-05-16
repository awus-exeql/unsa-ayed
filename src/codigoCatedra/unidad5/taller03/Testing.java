package codigoCatedra.unidad5.taller03;

public class Testing {


	public static void main(String[] args) {
		/*Madre m1 = new Madre(111);
		Madre m2 = new Madre();
		System.out.println(m1.mostrar());
		m1.setX(-321);
		System.out.println(m1.mostrar());
		System.out.println(m2.mostrar());*/
		Hija h1 = new Hija();
		System.out.println(h1.mostrar());
		h1.setX(11);
		h1.setW(-78.99);
		System.out.println(h1.mostrar());
	}

}
