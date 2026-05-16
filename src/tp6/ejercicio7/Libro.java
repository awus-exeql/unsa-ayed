package tp6.ejercicio7;

public class Libro {
    private int ID;
    private double peso;
    private int beneficio;

    public Libro(int ID, double peso, int beneficio) {
        this.ID = ID;
        this.peso = peso;
        this.beneficio = beneficio;
    }

    public Libro(double peso, int beneficio) {
        this(0,peso,beneficio);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Libro){
            return this.ID == ((Libro)obj).getID();
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "ID: "+this.ID+" | Peso: "+this.peso+" | Beneficio: "+this.beneficio;
    }
}
