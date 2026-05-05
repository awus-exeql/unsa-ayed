package tp6.ejercicio5;

public class PC {
    private int nro;
    private Estudiante estudiante;
    private int minutoLiberacion;

    public PC(int nro){
        this.nro = nro;
        this.minutoLiberacion = 0;
    }

    public void ocuparPc(Estudiante estudiante,int minActual){
        this.estudiante = estudiante;
        this.minutoLiberacion = minActual+estudiante.getTiempoConexion();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getMinutoLiberacion(){
        return this.minutoLiberacion;
    }

    public int getNro() {
        return nro;
    }

    public boolean estaLibre(){
        return this.minutoLiberacion == 0;
    }

    public void liberarPc(){
        this.minutoLiberacion = 0;
        this.estudiante = null;
    }
}
