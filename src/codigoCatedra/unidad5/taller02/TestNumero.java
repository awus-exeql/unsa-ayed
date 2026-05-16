package codigoCatedra.unidad5.taller02;

public class TestNumero {

	public static void main(String[] args) {
		
		Numero num = new Numero(50);
		Numero num2 = new Numero(45);
		//num.valor = 1000;
		num.setValor(1000);
		
		System.out.println(num.getValor());
		System.out.println(num2.getValor());
	}

}
