package tp5.contenedores;

import tp5.recursos.OperacionesCL1;

public class ColaArr implements OperacionesCL1 {
    private Object[] cola;
    private int finalC,frenteC;
    private int tamCola;

    public ColaArr(int tamCola){
        this.tamCola = tamCola;
        this.cola = new Object[this.tamCola];
        limpiar();
    }

    @Override
    public void meter(Object elemento) {
        if(!estaLlena()){
            if(this.finalC==this.tamCola-1)
                this.finalC = 0;
            else
                incrementaFinal();
            this.cola[this.finalC] = elemento;
        }
        else{
            System.out.println("Error. Cola llena..");
        }
    }

    @Override
    public Object sacar() {
        Object elemento = null;
        if(!estaVacia()){
            if(this.frenteC==this.tamCola-1)
                this.frenteC = 0;
            else
                incrementaFrente();
            elemento = this.cola[this.frenteC];
        }
        else{
            System.out.println("Error. Cola vacia..");
        }
        return elemento;
    }

    @Override
    public void limpiar() {
        this.finalC = this.frenteC = this.tamCola-1;
    }

    @Override
    public boolean estaVacia() {
        return this.frenteC == this.finalC;
    }
    public boolean estaLlena(){
        int p;
        if (this.finalC == this.tamCola - 1){
            p = 0;
        }else{
            p = this.finalC + 1;
        }
        return (p == this.frenteC);
    }

    private void incrementaFinal() {
        this.finalC++;
    }
    private void incrementaFrente() {
        this.frenteC++;
    }


    public static void main(String[] args) {
        // 1. Inicializamos la cola con tamaño 4 (capacidad real = 3)
        ColaArr filaEntradas = new ColaArr(4);
        System.out.println("--- INICIO ---");
        System.out.println("¿La cola está vacía? " + filaEntradas.estaVacia()); // true

        // 2. Metemos 3 elementos (METER)
        System.out.println("\n--- LLEGAN PERSONAS ---");
        System.out.println("Llega Ana");
        filaEntradas.meter("Ana");

        System.out.println("Llega Beto");
        filaEntradas.meter("Beto");

        System.out.println("Llega Carlos");
        filaEntradas.meter("Carlos");

        // 3. Verificamos si está llena (ESTA LLENA)
        System.out.println("\n¿La cola está llena? " + filaEntradas.estaLlena()); // true

        // 4. Intentamos meter a un cuarto elemento (METER en cola llena)
        System.out.println("\nLlega Diego e intenta entrar:");
        filaEntradas.meter("Diego"); // Esto debería imprimir el mensaje de error

        // 5. Atendemos a las personas (SACAR)
        System.out.println("\n--- ATENDIENDO ---");
        System.out.println("Se atiende a: " + filaEntradas.sacar()); // Saca a Ana
        System.out.println("Se atiende a: " + filaEntradas.sacar()); // Saca a Beto

        // 6. Comprobamos la CIRCULARIDAD (METER después de sacar)
        // Al sacar a Ana y Beto, se liberó espacio al principio del arreglo.
        // Como es circular, los nuevos van a ocupar esos espacios físicos.
        System.out.println("\n--- LLEGAN NUEVAS PERSONAS (CIRCULARIDAD) ---");
        System.out.println("Llega Elena");
        filaEntradas.meter("Elena");
        System.out.println("Llega Facundo");
        filaEntradas.meter("Facundo");

        System.out.println("¿La cola está llena de nuevo? " + filaEntradas.estaLlena()); // true

        // 7. Vaciamos la cola por completo (LIMPIAR)
        System.out.println("\n--- CERRANDO BOLETERÍA ---");
        filaEntradas.limpiar();
        System.out.println("Se ejecutó limpiar(). ¿La cola está vacía? " + filaEntradas.estaVacia()); // true

        // 8. Intentamos sacar de una cola vacía (SACAR en cola vacía)
        System.out.println("\nIntentando sacar a alguien más:");
        filaEntradas.sacar(); // Esto debería imprimir el mensaje de error
    }
}
