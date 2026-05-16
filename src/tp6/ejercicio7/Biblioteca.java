package tp6.ejercicio7;

import tp6.contenedores.Lista1DLinkedList;

public class Biblioteca extends Lista1DLinkedList {
    @Override
    public boolean iguales(Object elementoL, Object elemento) {
        Libro lb1 = (Libro) elementoL;
        Libro lb2 = (Libro) elemento;
        return lb1.equals(lb2);
    }
}
