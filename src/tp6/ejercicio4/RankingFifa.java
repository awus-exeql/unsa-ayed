package tp6.ejercicio4;

import tp6.contenedores.Lista2DLinkedList;

public class RankingFifa extends Lista2DLinkedList {
    public RankingFifa(){
        super();
    }
    public RankingFifa(SeleccionFut sf){
        this.insertar(sf);
    }
    @Override
    public boolean iguales(Object elemento1, Object elemento2) {
        return ((SeleccionFut)elemento1).equals( elemento2 );
    }

    @Override
    public boolean esMayor(Object elemento1, Object elemento2) {
        return !esMenor(elemento1, elemento2) && !iguales(elemento1, elemento2);
    }

    @Override
    public boolean esMenor(Object elemento1, Object elemento2) {
        SeleccionFut s1 = (SeleccionFut)elemento1;
        SeleccionFut s2 = (SeleccionFut)elemento2;

        int diff1 = s1.getDiferenciaRanking();
        int diff2 = s2.getDiferenciaRanking();

        if (diff1 != diff2)
            return diff1 > diff2;
        else
            return s1.getNombre().compareTo(s2.getNombre()) < 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- RANKING FIFA ---\n");
        for (int i = 0; i < this.tamanio(); i++) {
            sb.append(i + 1).append(". ").append(this.devolver(i)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void insertar(Object elemento) {
        if(this.tamanio()>0){
            if(this.buscar(elemento)==-1)
                super.insertar(elemento);
            else
                System.out.println("Error insertar. Seleccion de futbol repetida...");
        }
        else
            super.insertar(elemento);
    }
}
