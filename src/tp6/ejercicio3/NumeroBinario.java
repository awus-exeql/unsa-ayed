package tp6.ejercicio3;

import tp6.contenedores.Lista1DLinkedList;

public class NumeroBinario extends Lista1DLinkedList{
    public NumeroBinario(){
        super();
    }
    public NumeroBinario(String Nro){
        boolean bit;
        for(int i = Nro.length()-1; i>=0;i--){
            bit = charToBoolean( Nro.charAt(i) );
            insertarXCabeza(bit);
        }
    }

    public void insertarXCabeza(Object elemento){
        this.insertar(elemento,0);
    }

    @Override
    public boolean iguales(Object elementoL, Object elemento){
        NumeroBinario A = (NumeroBinario) elementoL;
        NumeroBinario B = (NumeroBinario) elemento;
        for(int i = 0; i<A.tamanio();i++){
            if((boolean)A.devolver(i) != (boolean)B.devolver(i))
                return false;
        }
        return true;
    }

    private boolean charToBoolean(char c){
        return c != '0';
    }

    public NumeroBinario suma(NumeroBinario B){
        NumeroBinario C = new NumeroBinario();

        boolean Cio = false;
        boolean suma,bitA,bitB,newC;

        int i = this.ultimo;
        int j = B.ultimo;

        int cont = 0;

        while(i>=0 || j>=0 || Cio){
            bitA = false;
            bitB = false;
            if(i>=0)
                bitA = (boolean)this.devolver(i);
            if(j>=0)
                bitB = (boolean)B.devolver(j);
            suma = bitA ^ bitB ^ Cio;
            newC = (bitA && bitB) || (bitA && Cio) || (bitB && Cio);
            C.insertarXCabeza(suma);
            Cio = newC;
            i--;
            j--;
        }
        return C;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tamanio(); i++) {
            boolean bit = (boolean) this.devolver(i);
            sb.append(bit ? "1" : "0");
        }
        return sb.toString();
    }
}
