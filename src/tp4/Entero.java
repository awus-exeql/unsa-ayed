package tp4;

public class Entero implements Operaciones{
    private int num;

    public Entero(){
        this(0);
    }
    public Entero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void sumar(Object a, Object b) {
        Entero c = (Entero)a;
        Entero d = (Entero)b;
       this.num = c.getNum()+d.getNum();
    }

    @Override
    public void restar(Object a, Object b) {
        Entero c = (Entero)a;
        Entero d = (Entero)b;
        this.num = c.getNum()-d.getNum();
    }

    @Override
    public void multiplicar(Object a, Object b) {
        Entero c = (Entero)a;
        Entero d = (Entero)b;
        this.num = c.getNum()*d.getNum();
    }

    @Override
    public void potenciacion(Object a, Object b) {
        Entero c = (Entero)a;
        Entero d = (Entero)b;
        this.num = Math.powExact(c.getNum(),d.getNum());
    }

    @Override
    public boolean iguales(Object a, Object b) {
        Entero c = (Entero)a;
        Entero d = (Entero)b;
        return c.getNum()==d.getNum();
    }

    public Entero restoNat(Object b){
        Entero c = new Entero();

        int a = this.getNum();
        Entero d = (Entero)b;

        while(a>=d.getNum())
            a -= d.getNum();

        c.setNum(a);
        return c;
    }

    public Entero mcd(Object b){
        Entero a = new Entero();
        return a;
    }

    @Override
    public String toString() {
        return ""+num;
    }

    public static void main(String[] args){
        Entero a = new Entero(15);
        Entero b = new Entero(3);
        System.out.println("a = "+a+" b = "+b+" resto = "+a.restoNat(b));
    }
}
