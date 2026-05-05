package tp1;

import java.util.ArrayList;

public class Numero {

    public static boolean esPrimo(int valor){
        int i;
        ParNumeros A = new ParNumeros(valor,2);
        ParNumeros B = new ParNumeros(valor,3);
        if (valor < 2) {
            return false;
        }
        if (valor == 2 || valor == 3){
            return true;
        }
        if ( (A.restoNat() == 0) || (B.restoNat() == 0) ){
            return false;
        }
        i = 5;
        while (i * i <= valor){
            A.setB(i);
            B.setB(i+2);
            if ( (A.restoNat() == 0) || (B.restoNat() == 0) ){
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static int sigNumPrimo(int valor){
        do {
            valor++;
        }while ( !(esPrimo(valor)) );
        return valor;
    }

    public static boolean[] cribaEr(int n){
        int i,j;
        boolean[] vec = new boolean[n+1];
        vec[0]=false;
        vec[1]=false;
        for(i=2;i<=n;i++){
            vec[i]=true;
        }
        for(i=2; i*i<=n; i++){
            if(vec[i]){
                for(j=i*i; j<=n; j+=i){
                    vec[j]=false;
                }
            }
        }
        return vec;
    }

    public static boolean[] cribaErintervalo(int m,int n){
        int i;
        boolean[] base,intervalo;
        base=cribaEr(n);
        intervalo = new boolean[n-m+1];
        for(i=m;i<=n;i++){
            intervalo[i-m]=base[i];
        }
        return intervalo;
    }

    public static int invPorModulo(int a, int m){
        int d;
        ParNumeros st;
        ParNumeros aux = new ParNumeros(a,m);
        d=aux.mcd();
        if(d==1) {
            st = aux.euclidesExtendido();
            if (st.getA() < 0 || st.getA() >= m) {
                aux.setA(st.getA());
                //aux.setB(m);
                st.setA(aux.crEntero().getB());
            }
            return st.getA();
        }
        else{
            return 0;
        }
    }
    public static int ecuacionCongr(int a,int b,int m){
        int i = Numero.invPorModulo(a,m);
        if(i!=0){
            i = i % m;
            return (i*b)%m;
        }
        else{
            System.out.println("No tiene solución con "+a+" y "+m+" siendo coprimos.");
            return 0;
        }
    }

    public static int potenciaRecursivaNat(int a,int b){
        if(b>0){
            return a * potenciaRecursivaNat(a,b-1);
        }
        else{
            return 1;
        }
    }

    private static boolean esPrimoRec(int a,int d){
        if(d*d>a)
            return true;
        if(a%d == 0)
            return false;
        return esPrimoRec(a,d+2);
    }
    public static boolean esPrimoRecursivo(int a){
        a = Math.abs(a);
        if(a<=1)
            return false;
        if(a%2==0)
            return a==2;
        return esPrimoRec(a,3);
    }

    public static int cantDig(int a){
        if(a/10!=0)
            return 1+cantDig(a/10);
        else
            return 1;
    }

    public static int mcdRecursivo(int a,int b){
        if(a%b==0)
            return b;
        else
            return mcdRecursivo(b,a%b);
    }
}