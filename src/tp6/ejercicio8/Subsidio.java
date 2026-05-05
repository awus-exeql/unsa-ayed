package tp6.ejercicio8;

import tp6.ejercicio6.Conjunto;

public class Subsidio extends Conjunto1DLinkedList{
    public Subsidio(){
        super();
    }

    @Override
    public Conjunto createNewSet() {
        return new Subsidio();
    }

    @Override
    public boolean iguales(Object obj1, Object obj2) {
        Persona p1 = (Persona) obj1;
        Persona p2 = (Persona) obj2;
        return p1.equals(p2);
    }
}
