package tp7.contenedores;

public class MatrizArr {
    protected Object[][] matriz;
    protected int nroFilas;
    protected int nroColumnas;

    public MatrizArr(int i, int j){
        this.nroFilas = i;
        this.nroColumnas = j;
        this.matriz = new Object[i][j];
    }

    public int getNroFilas() {
        return this.nroFilas;
    }
    public int getNroColumnas() {
        return this.nroColumnas;
    }

    public void actualizar(Object objElemento, int posicionFila, int posicionColumna){
        if(posicionFila>=getNroFilas() || posicionFila<0){
            System.out.println("Error actualizar. Posicion de fila inexistente");
        }
        else{
            if(posicionColumna>=getNroColumnas() || posicionColumna<0){
                System.out.println("Error actualizar. Posicion de columna inexistente");
            }
            else{
                this.matriz[posicionFila][posicionColumna] = objElemento;
            }
        }
    }

    public Object devolver(int posicionFila,int posicionColumna){
        Object objElemento = null;
        if(posicionFila>=getNroFilas() || posicionFila<0){
            System.out.println("Error devolver. Posicion de fila inexistente");
        }
        else{
            if(posicionColumna>=getNroColumnas() || posicionColumna<0){
                System.out.println("Error devolver. Posicion de columna inexistente");
            }
            else{
                objElemento = this.matriz[posicionFila][posicionColumna];
            }
        }
        return objElemento;
    }

    public void limpiaMatriz(){
        for (int i=0;i<getNroFilas();i++){
            for (int j=0;j<getNroColumnas();j++){
                this.matriz[i][j]=null;
            }
        }
    }

    public String toString(){
        String aux = "";
        for(int i = 0; i<getNroFilas(); i++){
            for(int j = 0; j<getNroColumnas(); j++){
                aux+=devolver(i,j)+"\t";
            }
            aux+="\n";
        }
        return aux;
    }
}
