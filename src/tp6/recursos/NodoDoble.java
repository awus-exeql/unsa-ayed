package tp6.recursos;

public class NodoDoble {
    private Object nodoInfo;
    private NodoDoble prevNodo,nextNodo;

    public NodoDoble(Object nodoInfo){
        this(nodoInfo,null,null);
    }
    public NodoDoble(Object nodoInfo,NodoDoble nextNodo){
        this(nodoInfo,null,nextNodo);
    }
    public NodoDoble(Object nodoInfo,NodoDoble prevNodo,NodoDoble nextNodo){
        this.nodoInfo = nodoInfo;
        this.prevNodo = prevNodo;
        this.nextNodo = nextNodo;
    }

    public Object getNodoInfo() {
        return nodoInfo;
    }

    public void setNodoInfo(Object nodoInfo) {
        this.nodoInfo = nodoInfo;
    }

    public NodoDoble getPrevNodo() {
        return prevNodo;
    }

    public void setPrevNodo(NodoDoble prevNodo) {
        this.prevNodo = prevNodo;
    }

    public NodoDoble getNextNodo() {
        return nextNodo;
    }

    public void setNextNodo(NodoDoble nextNodo) {
        this.nextNodo = nextNodo;
    }
}
