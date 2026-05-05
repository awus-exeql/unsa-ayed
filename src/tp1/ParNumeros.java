package tp1;

public class ParNumeros {
    private int a,b;

    public ParNumeros(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int cocienteNat(){
        int c,aux;
        if(a>=0 && b>0){
            c=0;
            aux=a;
            while(aux>=b){
                c++;
                aux-=b;
            }
            return c;
        }
        else{
            return -1;
        }
    }
    public int restoNat(){
        int aux;
        if(a>=0 && b>0){
            aux=a;
            while(aux>=b){
                aux-=b;
            }
            return aux;
        }
        else{
            return -1;
        }
    }

    public ParNumeros crNat(){
        ParNumeros cr;
        int c,aux;
        if(a>=0 && b>0){
            c=0;
            aux=a;
            while(aux>=b){
                c++;
                aux-=b;
            }
            cr = new ParNumeros(c,aux);
        }
        else{
            cr = new ParNumeros(-1,-1);
        }
        return cr;
    }

    public ParNumeros crEntero(){
        ParNumeros cr;
        int absA,absB,cociente,resto,mult;
        if(b==0){
            return cr = new ParNumeros(-1,-1);
        }
        absA=Math.abs(a);
        absB=Math.abs(b);
        cociente = 0;
        mult = 0;
        while(mult + absB <= absA){
            mult += absB;
            cociente++;
        }
        resto = absA-mult;
        if((a<0 && b>0) || (a>0 && b<0)) {
            cociente = -cociente;
        }
        if(a<0 && resto!=0){
            cociente--;
            resto = absB-resto;
        }
        return cr = new ParNumeros(cociente,resto);
    }

    public int mcd(){
        int resto;
        ParNumeros par;
        if(a==0 && b==0){
            return -1;
        }
        else {
            par = new ParNumeros(a, b);
            while (par.getB() != 0) {
                resto = par.restoNat();
                par.setA(par.getB());
                par.setB(resto);
            }
            return par.getA();
        }
    }
    public int mcm(){
        if (a == 0 || b == 0) return 0;
        return Math.abs((a*b)/mcd());
    }

    public ParNumeros euclidesExtendido(){
        int r0 = a;
        int r1 = b;
        int s0 = 1, s1 = 0;
        int t0 = 0, t1 = 1;
        int c,aux;
        ParNumeros parsito;
        ParNumeros auxc = new ParNumeros(r0,r1);
        while (r1 != 0){
            auxc.setA(r0);
            auxc.setB(r1);
            c= auxc.crEntero().getA();

            aux = r1;
            r1 = r0 - c * r1;
            r0 = aux;

            aux = s1;
            s1 = s0 - c * s1;
            s0 = aux;

            aux = t1;
            t1 = t0 - c * t1;
            t0 = aux;
        }
        parsito = new ParNumeros(s0,t0);
        return parsito;
    }
}