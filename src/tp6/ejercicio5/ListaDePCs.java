package tp6.ejercicio5;

import tp6.contenedores.Lista1DLinkedList;

public class ListaDePCs extends Lista1DLinkedList {
    public ListaDePCs(){
        super();
    }
    @Override
    public boolean iguales(Object elementoL, Object elemento) {
        PC pc1 = (PC)elementoL;
        PC pc2 = (PC)elemento;
        return pc1.getNro()==pc2.getNro();
    }
}
