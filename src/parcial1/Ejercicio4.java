package parcial1;

import tp5.contenedores.ColaSLinkedList;
import tp5.contenedores.PilaSLinkedList;

public class Ejercicio4 {
    public static void ordenarCola(ColaSLinkedList cola) {
        PilaSLinkedList pila1 = new PilaSLinkedList();
        PilaSLinkedList pila2 = new PilaSLinkedList();
        int actual,tope;
        boolean posicionEncontrada;
        while (!cola.estaVacia()) {
            actual = (int) cola.sacar();
            posicionEncontrada = false;
            while (!pila1.estaVacia() && !posicionEncontrada) {
                tope = (int) pila1.sacar();
                if (tope < actual) {
                    pila2.meter(tope);
                } else {
                    pila1.meter(tope);
                    posicionEncontrada = true;
                }
            }
            pila1.meter(actual);
            while (!pila2.estaVacia()) {
                pila1.meter(pila2.sacar());
            }
        }
        while (!pila1.estaVacia()) {
            cola.meter(pila1.sacar());
        }
    }
}
