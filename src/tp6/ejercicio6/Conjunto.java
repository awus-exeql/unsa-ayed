package tp6.ejercicio6;

public interface Conjunto {
    public void limpiar();
    public boolean estaVacia();
    public boolean esta(Object elemento);
    public void meter(Object elemento);
    public void sacar(Object elemento);

    public int tamanio();
    public Object devolver(int posicion);
}
