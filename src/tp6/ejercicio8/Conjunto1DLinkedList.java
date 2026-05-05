package tp6.ejercicio8;

import tp6.ejercicio6.Conjunto;
import tp6.ejercicio6.Conjunto0DLinkedList;
import tp6.recursos.NodoDoble;

public abstract class Conjunto1DLinkedList extends Conjunto0DLinkedList {
    public Conjunto1DLinkedList(){
        super();
    }

    public abstract Conjunto createNewSet();

    public Conjunto union(Conjunto B){
        Conjunto C = createNewSet();
        NodoDoble act = this.frenteL;
        while(act!=null){
            C.meter(act.getNodoInfo());
            act = act.getNextNodo();
        }
        for(int i = 0; i<B.tamanio(); i++){
            C.meter(B.devolver(i));
        }
        return C;
    }
    public Conjunto interseccion(Conjunto B){
        Conjunto C = createNewSet();
        NodoDoble act = this.frenteL;
        while(act!=null){
            if(B.esta(act.getNodoInfo())){
                C.meter(act.getNodoInfo());
            }
            act = act.getNextNodo();
        }
        return C;
    }
}
