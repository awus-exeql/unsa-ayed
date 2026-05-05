package tp6.ejercicio5;

public class Estudiante {
    private String nombre;
    private int minutoLlegada;
    private int tiempoConexion;

    public Estudiante(String nombre, int minutoLlegada) {
        this.nombre = nombre;
        this.minutoLlegada = minutoLlegada;
        // El tiempo de conexión se genera aleatoriamente entre 30 y 60
        this.tiempoConexion = (int)(Math.random() * 31) + 30;
    }

    // Getters necesarios para el informe final
    public String getNombre() {
        return nombre;
    }
    public int getMinutoLlegada() {
        return minutoLlegada;
    }
    public int getTiempoConexion() {
        return tiempoConexion;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Llegada: " + minutoLlegada + " min" + " | Conexión: " + tiempoConexion + " min";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Estudiante) {
            Estudiante otro = (Estudiante) obj;
            return this.nombre.equals(otro.getNombre());
        }
        return false;
    }
}
