package codigoCatedra.unidad4.ejemploCola;

public class TestMiCPU {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CPU cpu = new CPU(5, 8);
		cpu.cargar();
		System.out.println();
		cpu.atender();

	}

}
