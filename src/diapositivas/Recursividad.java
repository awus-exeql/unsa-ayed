package diapositivas;

public class Recursividad {
    /*
    (n) es la cantidad de discos,
    (O) es el lugar de inicio 1,
    (aux) lugar numero 2,
    (D) lugar numer
    */
    public static void hanoi(int n, int O, int D, int aux){
        if(n==1)
            System.out.println("Mover disco de "+O+" a "+D);
        else{
            hanoi(n-1,O,aux,D);
            System.out.println("Mover disco de "+O+" a "+D);
            hanoi(n-1,aux,D,O);
        }
    }
}
