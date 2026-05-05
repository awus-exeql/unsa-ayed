package tp6.ejercicio4;

public class SeleccionFut {
    private String nombre;
    private int PG,PEP;

    public SeleccionFut(String nombre, int PG, int PEP) {
        this.nombre = nombre;
        this.PG = PG;
        this.PEP = PEP;
    }

    public SeleccionFut(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPG() {
        return PG;
    }

    public void setPG(int PG) {
        if (PG >= 0) {
            this.PG = PG;
        } else {
            System.out.println("Error: Los partidos ganados no pueden ser negativos.");
        }
    }

    public int getPEP() {
        return PEP;
    }

    public void setPEP(int PEP) {
        this.PEP = PEP;
    }

    public int getDiferenciaRanking() {
        return this.PG - this.PEP;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SeleccionFut){
            SeleccionFut oS = (SeleccionFut)obj;
            return this.nombre.equals( oS.getNombre() );
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return String.format("[%s | PG: %d | PEP: %d]", this.nombre, this.PG, this.PEP);
    }
}
