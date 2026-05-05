package tp6.ejercicio5;

/**
 * Clase de prueba para la simulación del Laboratorio 1.
 * Representa el Nivel Usuario: el main solo orquesta la ejecución [1].
 */
public class TestLab1 {
    public static void main(String[] args) {
        // 1. Instanciación: Al crear el objeto, el constructor se encarga de preparar
        // el estado interno (las 15 PCs, la cola y la lista de informe) [4, 5].
        SimuladorLaboratorio1 laboratorio = new SimuladorLaboratorio1();

        System.out.println("====================================================");
        System.out.println("SIMULACIÓN DE UTILIZACIÓN - LABORATORIO 1");
        System.out.println("Horario: 10:00 hs a 20:00 hs (600 minutos)");
        System.out.println("====================================================\n");

        // 2. Ejecución: Se delega toda la lógica de simulación de eventos discretos
        // (probabilidades, manejo de cola FIFO y liberación de máquinas) al objeto [6, 7].
        laboratorio.simularDia();

        // 3. Certificación: Se solicita el informe final para validar que los
        // TADs implementados funcionaron según lo esperado [8, 9].
        laboratorio.mostrarInforme();
    }
}
