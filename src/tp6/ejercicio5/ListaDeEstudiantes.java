package tp6.ejercicio5;

import tp6.contenedores.Lista1DLinkedList;

public class ListaDeEstudiantes extends Lista1DLinkedList {

    public ListaDeEstudiantes() {
        super();
    }

    @Override
    public boolean iguales(Object elemento1, Object elemento2) {
        if (elemento1 == null || elemento2 == null)
            return false;
        else
            return ((Estudiante) elemento1).equals(elemento2);
    }

}