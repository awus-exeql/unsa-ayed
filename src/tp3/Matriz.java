package tp3;
import java.util.Arrays;

public class Matriz {
    private int[][] datos;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.datos = new int[filas][columnas];
    }
    public Matriz(){
        this.datos = new int[0][0];
        this.filas = 0;
        this.columnas = 0;
    }
    public Matriz(int[][] matriz) {
        this.datos = matriz;
        this.filas = matriz.length;
        if (matriz.length > 0) {
            this.columnas = matriz[0].length;
        } else {
            this.columnas = 0;
        }
    }

    public int getFilas() {
        return filas;
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getDato(int fila,int columna){
        return datos[fila][columna];
    }
    public void setDato(int fila, int columna,int valor){
        datos[fila][columna]=valor;
    }

    public boolean mismaDimension(Matriz B){
        return B.getFilas() == this.filas && B.getColumnas() == this.columnas;
    }

    private Matriz sumaRecursiva(Matriz B, Matriz C,int i,int j){
        if(i<this.filas){
            if(j<this.columnas){
                C.setDato(i,j,this.datos[i][j] + B.getDato(i,j));
                return sumaRecursiva(B,C,i,j+1);
            }
            else
                return sumaRecursiva(B,C,i+1,0);
        }
        else
            return C;
    }
    public Matriz suma(Matriz B){
        Matriz C;
        if(mismaDimension(B)){
            C = new Matriz(this.filas,this.columnas);
            C = sumaRecursiva(B,C,0,0);
        }
        else
            C = new Matriz();
        return C;
    }

    public boolean estaVacia(){
        return !(this.filas>0 && this.columnas>0);
    }

    private int sumaDeComponentesRec(int i,int j){
        if(i<this.filas){
            if(j<this.columnas){
                return this.datos[i][j] + sumaDeComponentesRec(i,j+1);
            }
            else
                return sumaDeComponentesRec(i+1,0);
        }
        else
            return 0;
    }
    public int sumaDeComponentes(){
        if( estaVacia() )
            return 0;
        else
            return sumaDeComponentesRec(0,0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < datos.length; i++) {
            sb.append(Arrays.toString(datos[i]));
            if (i < datos.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Matriz A,B,C;
        int[][] valoresA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        A = new Matriz(valoresA);
        System.out.println(A);
        int[][] valoresB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        B = new Matriz(valoresB);
        C = A.suma(B);
        System.out.println(C);
        System.out.println("Suma de componentes: "+A.sumaDeComponentes());
    }
}
