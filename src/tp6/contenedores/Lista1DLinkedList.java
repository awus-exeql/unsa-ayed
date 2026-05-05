package tp6.contenedores;

import tp6.recursos.NodoDoble;
import tp6.recursos.OperacionesCL3;
// LISTA SIMPLE
public abstract class Lista1DLinkedList extends Lista0DLinkedList implements OperacionesCL3 {

    public Lista1DLinkedList(){
        super();
    }

    @Override
    public int buscar(Object elemento) {
        int posicion = -1;
        int contador = 0;
        Object unElemento;
        NodoDoble temp;
        temp = this.frenteL;
        while(temp!=null && posicion==-1) {
            unElemento = temp.getNodoInfo();
            if (iguales(unElemento, elemento)){
                posicion = contador;
            }else{
                temp = temp.getNextNodo();
                contador++;
            }
        }
        return posicion;
    }

    @Override
    public void insertar(Object elemento, int posicion) {
        if(posicion>tamanio() || posicion<0)
            System.out.println("Error insertar. Posicion inexistente..");
        else{
            if(posicion == 0){
                if(!estaVacia()){
                    this.frenteL = new NodoDoble(elemento,this.frenteL);
                    this.frenteL.getNextNodo().setPrevNodo(this.frenteL);
                }
                else
                    this.frenteL = this.finalL = new NodoDoble(elemento);
            }
            else{
                if(posicion == tamanio()){
                    this.finalL = new NodoDoble(elemento,this.finalL,null);
                    this.finalL.getPrevNodo().setNextNodo(this.finalL);
                }
                else{
                    NodoDoble prev,next,nodo;
                    prev = this.frenteL;
                    next = this.frenteL.getNextNodo();
                    for(int cont = 1; cont<posicion; cont++){
                        prev = prev.getNextNodo();
                        next = next.getNextNodo();
                    }
                    nodo = new NodoDoble(elemento,prev,next);
                    prev.setNextNodo(nodo);
                    next.setPrevNodo(nodo);
                }
            }
            this.ultimo++;
        }
    }

    @Override
    public void reemplazar(Object elemento, int posicion) {
        if(estaVacia()){
            System.out.println("Error reemplazar. Lista vacia...");
        }
        else{
            if(posicion>=tamanio() || posicion<0){
                System.out.println("Error reemplazar. La posicion no existe...");
            }
            else{
                if(posicion == 0){
                    this.frenteL.setNodoInfo(elemento);
                }
                else{
                    if(posicion == tamanio()-1){
                        this.finalL.setNodoInfo(elemento);
                    }
                    else{
                        NodoDoble temp = this.frenteL;
                        for(int cont = 1; cont<posicion; cont++){
                            temp = temp.getNextNodo();
                        }
                        temp.setNodoInfo(elemento);
                    }
                }
            }
        }
    }

    public abstract boolean iguales(Object elementoL,Object elemento);
}
