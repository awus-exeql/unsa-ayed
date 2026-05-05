package tp5.contenedores;

import tp5.recursos.Nodo;
import tp5.recursos.OperacionesCL1;

public class ColaSLinkedList implements OperacionesCL1 {
    private Nodo frenteC,finalC;

    public ColaSLinkedList(){
        limpiar();
    }

    public void meter(Object elemento){
        if(!estaVacia()){
            this.finalC.setNextNodo(new Nodo(elemento));
            this.finalC = this.finalC.getNextNodo();
        }
        else
            this.frenteC = this.finalC = new Nodo(elemento);
    }
    public Object sacar(){
        Object elemento = null;
        if(!estaVacia()){
            elemento = this.frenteC.getNodoInfo();
            this.frenteC = this.frenteC.getNextNodo();
            if(estaVacia())
                this.finalC = null;
        }
        else
            System.out.println("Error. Lista vacia..");
        return elemento;
    }

    public boolean estaVacia(){
        return this.frenteC==null;
    }
    public void limpiar(){
        this.frenteC = this.finalC = null;
    }

    public Nodo getFrenteC() {
        return frenteC;
    }
    public void setFrenteC(Nodo frenteC) {
        this.frenteC = frenteC;
    }
    public Nodo getFinalC() {
        return finalC;
    }
    public void setFinalC(Nodo finalC) {
        this.finalC = finalC;
    }
}
