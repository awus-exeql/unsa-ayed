package tp4;

public class Racional {
    private int num,den;

    public Racional(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getDen() {
        return den;
    }
    public void setDen(int den) {
        this.den = den;
    }

    public void sumar(Object a, Object b) {
        Racional r1 = (Racional)a;
        Racional r2 = (Racional)b;
        den=r1.getDen()* r2.getDen();
        num = r1.getNum()* r2.getDen()+ r1.getDen()* r2.getNum();
    }

    public void restar(Object a, Object b) {

    }
}
