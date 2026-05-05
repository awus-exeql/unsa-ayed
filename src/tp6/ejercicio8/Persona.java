package tp6.ejercicio8;

public class Persona {
    private int DNI;
    private char sexo;
    private String apenom;

    public Persona(int DNI, char sexo, String apenom) {
        this.DNI = DNI;
        this.sexo = sexo;
        this.apenom = apenom;
    }
    public Persona(){
        this(0,'N',"");
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getApenom() {
        return apenom;
    }

    public void setApenom(String apenom) {
        this.apenom = apenom;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Persona){
            return this.DNI == ((Persona)obj).getDNI();
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.apenom+" | DNI: "+this.DNI+" | Sexo: "+this.sexo;
    }
}
