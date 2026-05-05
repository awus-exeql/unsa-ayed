package tp6.ejercicio1;

import tp5.recursos.Nodo;
import tp6.recursos.OperacionesCL2;

// Clase padre para LISTA SIMPLE y LISTA ORDENADA, implementado con NODO
public abstract class Lista0SLinkedList implements OperacionesCL2 {
    protected Nodo frenteL,finalL;
    protected int ultimo;

    @Override
    public abstract int buscar(Object elemento);

    @Override
    public Object devolver(int posicion) {
       Object elemento = null;
        if(estaVacia()){
            System.out.println("Error devolver. Lista vacia...");
        }
        else{
            if(posicion>=tamanio() || posicion<0){
                System.out.println("Error devolver. Posicion inexistente..");
            }
            else{
                if(posicion == 0){
                    elemento = this.frenteL.getNodoInfo();
                }
                else{
                    if(posicion == ultimo){
                        elemento = this.finalL.getNodoInfo();
                    }
                    else{
                        Nodo temp = this.frenteL;
                        for(int i = 1; i<posicion; i++){
                            temp = temp.getNextNodo();
                        }
                        elemento = temp.getNodoInfo();
                    }
                }
            }
        }
        return elemento;
    }

    @Override
    public void eliminar(int posicion) {
        if(estaVacia())
            System.out.println("Error eliminar. Lista vacia..");
        else{
            if(posicion >= tamanio() || posicion<0) {
                System.out.println("Error eliminar. Posicion inexistente");
            }
            else{
                if(posicion == 0){
                    if(this.frenteL == this.finalL){
                        limpiar();
                    }
                    else{
                        this.frenteL.setNextNodo(this.frenteL.getNextNodo());
                        this.ultimo--;
                    }
                }
                else{
                    Nodo prev,next;
                    prev = this.frenteL;
                    next = this.frenteL.getNextNodo();
                    for(int cont = 1; cont < posicion;cont++){
                        prev = prev.getNextNodo();
                        next = next.getNextNodo();
                    }
                    next = next.getNextNodo();
                    prev.setNextNodo(next);
                    this.ultimo--;
                }
            }
        }
    }

    @Override
    public void limpiar() {
        this.frenteL = this.finalL = null;
        this.ultimo = -1;
    }

    @Override
    public boolean estaVacia() {
        return (this.frenteL==null);
    }

    @Override
    public int tamanio() {
        return (this.ultimo+1);
    }
}
