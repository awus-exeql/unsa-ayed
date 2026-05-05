package tp6.ejercicio4;

public class TestRankingFifa {
    public static void main(String[] args) {
        // 1. Instanciamos el Ranking (TAD Lista Ordenada)
        RankingFifa ranking = new RankingFifa();

        System.out.println("Cargando selecciones para validar el nuevo criterio FIFA...");

        /*
         PRUEBA 1: Diferencias PG - PEP distintas
         Argentina: 15 - 5 = 10 (Debería ser 1°)
         Brasil: 5 - 10 = -5    (Debería ser último)
        */
        ranking.insertar(new SeleccionFut("Argentina", 15, 5));
        ranking.insertar(new SeleccionFut("Brasil", 5, 10));

        /*
         PRUEBA 2: Empate en diferencia (PG - PEP = 8), desempate Alfabético
         Chile:    12 - 4 = 8  ('Ch' va primero)
         Colombia: 12 - 4 = 8  ('Co' va segundo)
         Uruguay:  10 - 2 = 8  ('U' va tercero)
        */
        ranking.insertar(new SeleccionFut("Uruguay", 10, 2));
        ranking.insertar(new SeleccionFut("Colombia", 12, 4));
        ranking.insertar(new SeleccionFut("Chile", 12, 4));
        ranking.insertar(new SeleccionFut("Argentina",0,0));

        // 2. Mostramos el ranking final utilizando el toString()
        // El orden esperado es: Argentina, Chile, Colombia, Uruguay, Brasil.
        System.out.println("\n--- RESULTADO DEL RANKING ANUAL ---");
        System.out.println(ranking);

        // 3. Verificación de tamaño (Certificación de funcionamiento [2])
        System.out.println("Cantidad de selecciones registradas: " + ranking.tamanio());
    }
}
