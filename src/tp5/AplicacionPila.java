package tp5;

import tp5.contenedores.ColaSLinkedList;
import tp5.contenedores.PilaArr;
import tp5.contenedores.PilaSLinkedList;
import tp5.recursos.OperacionesCL1;

public class AplicacionPila {
    public static Object topePila(OperacionesCL1 pila){
        Object tope = null;
        if(!pila.estaVacia()){
            tope = pila.sacar();
            pila.meter(tope);
        }
        else
            System.out.println("Error. Pila vacia..");
        return tope;
    }
    public static void reemplazarValor(OperacionesCL1 pila, int valorViejo, int valorNuevo){
        OperacionesCL1 pilaAux;
        Object elemento;
        if(!pila.estaVacia()){
            pilaAux = new PilaSLinkedList();
            while(!pila.estaVacia()){
                elemento = pila.sacar();
                if(elemento!=null && (int)elemento==valorViejo)
                    pilaAux.meter(valorNuevo);
                else
                    pilaAux.meter(elemento);
            }
            while(!pilaAux.estaVacia())
                pila.meter(pilaAux.sacar());
        }
        else
            System.out.println("Error. Pila vacia..");
    }
    public static boolean estaBalanceada(String cadena){
        OperacionesCL1 pila = new PilaSLinkedList();
        char caracter;
        for(int i = 0; i<cadena.length(); i++){
            caracter = cadena.charAt(i);
            if(caracter == '(')
                pila.meter(caracter);
            else{
                if(caracter == ')'){
                    if(pila.estaVacia())
                        return false;
                    else
                        pila.sacar();
                }
            }
        }
        return pila.estaVacia();
    }
    private static boolean esCapicua(int Numero){
        int numOriginal = Math.abs(Numero);
        int numInvertido = 0;
        int aux = numOriginal;
        int dig = 0;
        while(aux!=0){
            dig = aux%10;
            numInvertido = numInvertido*10 + dig;
            aux /=10;
        }
        return numOriginal == numInvertido;
    }
    public static OperacionesCL1 separarCapicuas(OperacionesCL1 pilaOriginal){
        OperacionesCL1 colaCapicuas = new ColaSLinkedList();
        OperacionesCL1 pilAux = new PilaSLinkedList();
        Object elemento;
        if(!pilaOriginal.estaVacia()){
            while(!pilaOriginal.estaVacia()){
                elemento = pilaOriginal.sacar();
                if(esCapicua( (int)elemento) )
                    colaCapicuas.meter(elemento);
                else
                    pilAux.meter(elemento);
            }
        }
        else
            System.out.println("Error. Pila vacia..");
        while(!pilAux.estaVacia())
            pilaOriginal.meter(pilAux.sacar());
        return colaCapicuas;
    }
    public static void main(String[] args){
        // Ejercicio 7
        PilaSLinkedList miPila = new PilaSLinkedList();

        miPila.meter("Awus");
        miPila.meter("Wachiwachiwa");
        miPila.meter("Me pinto yoo gilee");

        System.out.println("El valor en el tope es: "+topePila(miPila));
        miPila.sacar();
        System.out.println("El valor en el tope es: "+topePila(miPila));

        // Ejercicio 8
        System.out.println("--- Prueba con Array Estático ---");
        OperacionesCL1 pilaArray = new PilaArr(4);
        pilaArray.meter(10);
        pilaArray.meter(5);
        pilaArray.meter(10); // El tope será 10

        reemplazarValor(pilaArray, 10, 99);
        // La pilaArray ahora tendrá: 99 (fondo), 5 (medio), 99 (tope).

        System.out.println("--- Prueba con Lista Enlazada ---");
        OperacionesCL1 pilaLista = new PilaSLinkedList();
        pilaLista.meter(1);
        pilaLista.meter(2);
        pilaLista.meter(1); // El tope será 1

        reemplazarValor(pilaLista, 1, 88);
        // La pilaLista ahora tendrá: 88 (fondo), 2 (medio), 88 (tope).


        // Ejercicio 9
        String caso1 = "abc(defg(ijk))(l(mn)op)qr";
        String caso2 = "abc(def))ghij(kl)m";

        System.out.println("Cadena 1: " + caso1);
        System.out.println("Balanceada? Respuesta: " + (estaBalanceada(caso1) ? "Si" : "No"));

        System.out.println("\nCadena 2: " + caso2);
        System.out.println("Balanceada? Respuesta: " + (estaBalanceada(caso2) ? "Si" : "No"));

        // Ejercicio 11
        OperacionesCL1 miPila2 = new PilaArr(6);

        // Llenamos la pila (Fondo -> Tope)
        miPila2.meter(10);
        miPila2.meter(101); // Capicúa
        miPila2.meter(25);
        miPila2.meter(33);  // Capicúa
        miPila2.meter(40);

        // Ejecutamos el método
        OperacionesCL1 miCola = separarCapicuas(miPila2);

        // Resultado esperado en miPila: [Fondo: 10, 25, Tope: 40]
        // Resultado esperado en miCola: [Frente: 33, Final: 101]
        // (Nota: el 33 entra primero a la cola porque estaba más cerca del tope de la pila)
    }
}
