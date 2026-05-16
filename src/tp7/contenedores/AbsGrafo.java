package tp7.contenedores;

import tp7.recursos.OperacionesG;

public abstract class AbsGrafo implements OperacionesG {
    protected MatrizGrafo matrizCosto;
    protected int ordenGrafo;
    protected static double infinito=10000;

    public AbsGrafo(int ordenGrafo){
        this.ordenGrafo = ordenGrafo;
        this.matrizCosto = new MatrizGrafo(getOrden());
    }

    public int getOrden(){
        return this.ordenGrafo;
    }

    public abstract void cargarGrafo();
    public abstract void muestraGrafo();


}
