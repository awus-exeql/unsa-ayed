package tp5.contenedores;

import tp5.recursos.OperacionesCL1;

public class PilaArr implements OperacionesCL1 {
    private Object[] pila;
    private int cabeza;
    private int tamPila;

    public PilaArr(int tamPila){
        this.pila = new Object[tamPila];
        this.tamPila = tamPila;
        limpiar();
    }
    public PilaArr(Object[] pila, int cabeza, int tamPila) {
        this.pila = pila;
        this.cabeza = cabeza;
        this.tamPila = tamPila;
    }

    @Override
    public void meter(Object elemento) {
        if(!estaLlena()){
            incrementaCabeza();
            this.pila[this.cabeza] = elemento;
        }
        else{
            System.out.println("Error. Pila llena..");
        }
    }

    @Override
    public Object sacar() {
        Object elemento = null;
        if(!estaVacia()){
            elemento = this.pila[this.cabeza];
            decrementaCabeza();
        }
        else{
            System.out.println("Error. Pila vacia..");
        }
        return elemento;
    }

    @Override
    public void limpiar() {
        this.cabeza = -1;
    }

    @Override
    public boolean estaVacia() {
        return this.cabeza == -1;
    }
    public boolean estaLlena(){
        return this.cabeza == this.tamPila-1;
    }

    public void incrementaCabeza(){
        this.cabeza++;
    }
    public void decrementaCabeza(){
        this.cabeza--;
    }
}
