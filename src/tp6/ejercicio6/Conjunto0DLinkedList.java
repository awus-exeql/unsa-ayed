package tp6.ejercicio6;

import tp6.contenedores.Lista0DLinkedList;
import tp6.recursos.NodoDoble;

public abstract class Conjunto0DLinkedList extends Lista0DLinkedList implements Conjunto{
    public Conjunto0DLinkedList(){
        super();
    }

    public abstract boolean iguales(Object obj1,Object obj2);

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
// COMPORTAMIENTO DEL CONJUNTO
    @Override
    public boolean esta(Object elemento) {
        return this.buscar(elemento)!=-1;
    }

    @Override
    public void meter(Object elemento) {
        if(!this.esta(elemento)){
            if(estaVacia()){
                this.frenteL = this.finalL = new NodoDoble(elemento);
            }
            else{
                this.finalL.setNextNodo( new NodoDoble(elemento,this.finalL,null) );
                this.finalL = this.finalL.getNextNodo();
            }
            this.ultimo++;
        }
        else
            System.out.println("Error meter. Elemento repetido..");
    }

    @Override
    public void sacar(Object elemento) {
        int i;
        if(esta(elemento)){
            i = buscar(elemento);
            this.eliminar(i);
        }
        else
            System.out.println("Error sacar. Elemento no encontrado..");
    }
}
