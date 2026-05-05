package tp6.contenedores;

import tp6.recursos.NodoDoble;
import tp6.recursos.OperacionesCL2;

// Superclase tanto para LISTA SIMPLE como para LISTA ORDENADA
public abstract class Lista0DLinkedList implements OperacionesCL2 {
    protected NodoDoble frenteL,finalL;
    protected int ultimo;

    public Lista0DLinkedList(){
        this.limpiar();
    }

    @Override
    public abstract int buscar(Object elemento);

    @Override
    public Object devolver(int posicion) {
        Object elemento = null;
        if(estaVacia())
            System.out.println("Error devolver. Lista vacia..");
        else{
            if(posicion>=tamanio() || posicion<0)
                System.out.println("Error devolver. La posicion no existe..");
            else{
                NodoDoble temp;
                temp = this.frenteL;
                for(int i = 0; i<posicion;i++)
                    temp = temp.getNextNodo();
                elemento = temp.getNodoInfo();
            }
        }
        return elemento;
    }

    @Override
    public void eliminar(int posicion) {
        if(estaVacia())
            System.out.println("Error eliminar. Lista vacia..");
        else{
            if(posicion >= tamanio() || posicion<0) {
                System.out.println("Error eliminar. Posicion inexistente");
            }
            else{
                if(posicion == 0){
                    if(this.frenteL == this.finalL)
                        limpiar();
                    else{
                        this.frenteL = this.frenteL.getNextNodo();
                        this.frenteL.setPrevNodo(null);
                        this.ultimo--;
                    }
                }
                else{
                    if(posicion == tamanio()-1){
                        this.finalL = this.finalL.getPrevNodo();
                        this.finalL.setNextNodo(null);
                    }
                    else{
                        NodoDoble prev,next;
                        prev = this.frenteL;
                        next = this.frenteL.getNextNodo();
                        for(int cont = 1; cont < posicion;cont++){
                            prev = prev.getNextNodo();
                            next = next.getNextNodo();
                        }
                        next = next.getNextNodo();
                        prev.setNextNodo(next);
                        next.setPrevNodo(prev);
                    }
                    this.ultimo--;
                }
            }
        }
    }

    @Override
    public void limpiar() {
        this.frenteL = this.finalL = null;
        this.ultimo = -1;
    }

    @Override
    public boolean estaVacia() {
        return (this.frenteL == null);
    }

    @Override
    public int tamanio() {
        return (this.ultimo+1);
    }
}
