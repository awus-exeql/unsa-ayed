package tp6.ejercicio1;

import tp5.recursos.Nodo;
import tp6.recursos.OperacionesCL4;
// Clase LISTA ORDENADA con nodo
public abstract class Lista2SLinkedList extends Lista0SLinkedList implements OperacionesCL4 {
    @Override
    public int buscar(Object elemento) {
        if(estaVacia()){
            System.out.println("Error buscar. Lista vacia...");
            return -1;
        }
        else{
            Nodo temp = this.frenteL;
            int j = 0;
            while(temp!=null && !iguales(elemento,temp.getNodoInfo())){
                temp = temp.getNextNodo();
                j++;
            }
            if(temp!=null)
                return j;
            else
                return -1;
        }
    }

    @Override
    public void insertar(Object elemento) {
        if(estaVacia()){
            this.frenteL = this.finalL = new Nodo(elemento);
        }
        else{
            if(esMenor(elemento,this.frenteL)){
                this.frenteL = new Nodo(elemento,this.frenteL);
            }
            else{
                if(esMayor(elemento,this.finalL) || iguales(elemento,this.finalL)){
                    this.finalL.setNextNodo(new Nodo(elemento));
                    this.finalL = this.finalL.getNextNodo();
                }
                else{
                    Nodo temp,nodo;
                    temp = this.frenteL;
                    boolean flag = false;
                    while(temp.getNextNodo()!=null && !flag){
                        if(esMayor(elemento,temp.getNextNodo().getNodoInfo()) || iguales(elemento,temp.getNextNodo().getNodoInfo()))
                            temp = temp.getNextNodo();
                        else
                            flag = true;
                    }
                    nodo = new Nodo(elemento,temp.getNextNodo());
                    temp.setNextNodo(nodo);
                }
            }
        }
        this.ultimo++;
    }

    public abstract boolean iguales(Object elemento1,Object elemento2);
    public abstract boolean esMayor(Object elemento1,Object elemento2);
    public abstract boolean esMenor(Object elemento1,Object elemento2);
}
