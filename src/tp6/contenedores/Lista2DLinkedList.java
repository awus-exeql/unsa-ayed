package tp6.contenedores;

import tp6.recursos.NodoDoble;
import tp6.recursos.OperacionesCL4;

// LISTA ORDENADA
public abstract class Lista2DLinkedList extends Lista0DLinkedList implements OperacionesCL4 {

    @Override
    public int buscar(Object elemento) { // REVISAR SI ESTA BIEN
        if(estaVacia()){
            System.out.println("Error buscar. Lista vacia..");
            return -1;
        }
        else{
            NodoDoble temp = this.frenteL;
            int j = 0;
            while(temp!=null && !iguales(temp.getNodoInfo(),elemento)){
                j++;
                temp = temp.getNextNodo();
            }
            if(temp==null)
                return -1;
            else
                return j;
        }
    }

    @Override
    public void insertar(Object elemento) {
        if(estaVacia()){
            this.frenteL = this.finalL = new NodoDoble(elemento);
        }
        else{
            if(esMenor(elemento,this.frenteL.getNodoInfo())){
                this.frenteL = new NodoDoble(elemento,null,this.frenteL);
                this.frenteL.getNextNodo().setPrevNodo(this.frenteL);
            }
            else{
                if(esMayor(elemento,this.finalL.getNodoInfo()) || iguales(elemento,this.finalL.getNodoInfo())){
                    this.finalL.setNextNodo(new NodoDoble(elemento,this.finalL,null));
                    this.finalL = this.finalL.getNextNodo();
                }
                else{
                    NodoDoble temp,nodo;
                    boolean flag = false;
                    temp = this.frenteL;
                    while(temp.getNextNodo()!=null && !flag){
                        if(esMayor(elemento,temp.getNextNodo().getNodoInfo()) || iguales(elemento,temp.getNextNodo().getNodoInfo())){
                            temp = temp.getNextNodo();
                        }
                        else{
                            flag = true;
                        }
                    }
                    nodo = new NodoDoble(elemento,temp,temp.getNextNodo());
                    temp.setNextNodo(nodo);
                    temp.getNextNodo().setPrevNodo(nodo);
                }
            }
        }
        this.ultimo++;
    }

    public abstract boolean iguales(Object elemento1,Object elemento2);
    public abstract boolean esMayor(Object elemento1,Object elemento2);
    public abstract boolean esMenor(Object elemento1,Object elemento2);
}
