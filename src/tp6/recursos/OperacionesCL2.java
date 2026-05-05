package tp6.recursos;
// Operaciones en comun para LISTA SIMPLE y LISTA ORDENADA
public interface OperacionesCL2 {
    public int buscar(Object elemento);
    public Object devolver(int posicion);
    public void eliminar(int posicion);
    public void limpiar();
    public boolean estaVacia();
    public int tamanio();
}
