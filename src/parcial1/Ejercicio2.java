package parcial1;

public class Ejercicio2 {
    public static int resto(int a,int b){
        while(a>=b)
            a-=b;
        return a;
    }
    public static int cociente(int a,int b){
        int cont = 0;
        while(a>=b){
            a-=b;
            cont++;
        }
        return cont;
    }
    public static int difDigImpPar(int k){
        if(k<10){
            if(resto(k,2)==0)
                return -k;
            else
                return k;
        }
        if(resto(k,10)%2 == 0)
            return -resto(k,10)+difDigImpPar(cociente(k,10));
        else
            return resto(k,10)+difDigImpPar(cociente(k,10));
    }
}
