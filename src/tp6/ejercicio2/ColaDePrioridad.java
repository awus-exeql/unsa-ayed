package tp6.ejercicio2;

import tp5.contenedores.ColaSLinkedList;
import tp5.recursos.Nodo;

public abstract class ColaDePrioridad extends ColaSLinkedList{

    public ColaDePrioridad(){
        super();
    }

    public abstract boolean iguales(Object elemento1,Object elemento2);
    public abstract boolean esMayor(Object elemento1,Object elemento2);
    public abstract boolean esMenor(Object elemento1,Object elemento2);

    @Override
    public void meter(Object elemento) {
        if(!estaVacia()){
            if(esMayor(elemento,this.getFrenteC().getNodoInfo())){
                this.setFrenteC(new Nodo(elemento,this.getFrenteC()));
            }
            else{
                if(esMenor(elemento,this.getFinalC().getNodoInfo()) || iguales(elemento,this.getFinalC().getNodoInfo())){
                    this.getFinalC().setNextNodo(new Nodo(elemento));
                    this.setFinalC(this.getFinalC().getNextNodo());
                }
                else{
                    Nodo act = this.getFrenteC();
                    while(!esMayor(elemento,act.getNextNodo().getNodoInfo()))
                        act = act.getNextNodo();
                    act.setNextNodo(new Nodo(elemento,act.getNextNodo()));
                }
            }
        }
        else{
            this.setFrenteC(new Nodo(elemento));
            this.setFinalC(this.getFrenteC());
        }
    }
}
