package tp5;

import tp5.contenedores.ColaSLinkedList;
import tp5.contenedores.PilaSLinkedList;
import tp5.recursos.OperacionesCL1;

public class ColAwuSLinkedList extends ColaSLinkedList {
    public ColAwuSLinkedList(){
        super();
    }
    public int obtenerCardinal(){
        int cont = 0;
        OperacionesCL1 pilAux = new ColaSLinkedList();
        while(!this.estaVacia()){
            pilAux.meter(this.sacar());
            cont++;
        }
        while(!pilAux.estaVacia())
            this.meter(pilAux.sacar());
        return cont;
    }
    public void invertir(){
        OperacionesCL1 pilAux = new PilaSLinkedList();
        while(!this.estaVacia())
            pilAux.meter(this.sacar());
        while(!pilAux.estaVacia())
            this.meter(pilAux.sacar());
    }
    public void concatenar(OperacionesCL1 Cola2){
        if(!Cola2.estaVacia()){
            while(!Cola2.estaVacia())
                this.meter(Cola2.sacar());
        }
        else
            System.out.println("Error. No hay nada que concatenar..");
    }
}
