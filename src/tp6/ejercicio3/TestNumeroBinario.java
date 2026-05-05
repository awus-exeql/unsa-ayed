package tp6.ejercicio3;

public class TestNumeroBinario {
    public static void main(){
        NumeroBinario A = new NumeroBinario("a0a0");
        NumeroBinario B = new NumeroBinario("1");
        NumeroBinario C = A.suma(B);
        System.out.println(A+" + "+B+" = "+C);
    }
}
