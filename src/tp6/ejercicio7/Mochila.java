package tp6.ejercicio7;

import tp6.ejercicio6.Conjunto;
import tp6.ejercicio8.Conjunto1DLinkedList;

public class Mochila extends Conjunto1DLinkedList {
    private double capacidadK;
    private double pesoActual;

    public Mochila(double capacidadK){
        super();
        this.capacidadK = capacidadK;
        this.pesoActual = 0;
    }
    public Mochila(){
        this(0);
    }

    @Override
    public Conjunto createNewSet() {
        return new Mochila();
    }

    @Override
    public boolean iguales(Object obj1, Object obj2) {
        Libro lb1 = (Libro) obj1;
        Libro lb2 = (Libro) obj2;
        return lb1.equals(lb2);
    }

    @Override
    public void meter(Object elemento) {
        Libro libro = (Libro) elemento;
        if(!this.esta(libro) && (this.pesoActual + libro.getPeso()) <= this.capacidadK){
            super.meter(libro);
            this.pesoActual += libro.getPeso();
        }
        else{
            if( (this.pesoActual + libro.getPeso()) > this.capacidadK )
                System.out.println("Error meter. Capacidad excedida...");
        }
    }

    @Override
    public void sacar(Object elemento) {
        if(this.esta(elemento)){
            Libro libro = (Libro) elemento;
            super.sacar(elemento);
            this.pesoActual -= libro.getPeso();
        }
        else
            System.out.println("Error sacar. Libro no encontrado..");
    }

}
