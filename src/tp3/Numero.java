package tp3;

import java.util.ArrayList;

public class Numero {
    public static void main(){
        int[] A = {20,40,12,7};
        System.out.println("Promedio: "+promedioArrayEnterosRec(A));
    }

    public static int restoNaturalR(int a,int b){
        if(a>=b)
            return restoNaturalR(a-b,b);
        else
            return a;
    }
    public static int cocienteNaturalR(int a,int b){
        if(a>=b){
            return 1+cocienteNaturalR(a-b,b);
        }
        else
            return 1;
    }

    private static ArrayList<Integer> facPrimos(ArrayList<Integer> A, int n, int d){
        if(n==1)
            return A;
        else{
            if(n%d==0){
                A.add(d);
                return facPrimos(A,n/d,d);
            }
            else
                return facPrimos(A,n,d+1);
        }
    }
    public static ArrayList<Integer> factoresPrimos(int n){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista = facPrimos(lista,n,2);
        return lista;
    }

    private static ArrayList<Integer> fac(ArrayList<Integer> A,int n,int d){
        if(d*d>n){
            A.add(n);
            return A;
        }
        else{
            if(n%d==0) {
                A.add(d);
                if(d != n/d)
                    A.add(n/d);
            }
            return fac(A,n,d+1);
        }
    }
    public static ArrayList<Integer> factores(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        if(n>1)
            list = fac(list,n,2);
        return list;
    }

    private static float promArrayEnterosRec(int[] E,int i){
        if(i>=E.length)
            return 0;
        else{
            return E[i]+promArrayEnterosRec(E,i+1);
        }
    }
    public static float promedioArrayEnterosRec(int[] E){
        return promArrayEnterosRec(E,0)/E.length;
    }
}
