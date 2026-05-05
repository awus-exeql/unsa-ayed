package tp5;

import tp5.contenedores.PilaSLinkedList;

public class PilAwuSLinkedList extends PilaSLinkedList {
    public PilAwuSLinkedList(){
        super();
    }
    public Object topePila(){
        Object tope = null;
        if(!this.estaVacia()){
            tope = this.sacar();
            this.meter(tope);
        }
        else
            System.out.println("Error. Pila Vacia..");
        return tope;
    }
}
