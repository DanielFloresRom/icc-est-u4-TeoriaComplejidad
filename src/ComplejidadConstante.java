/*
 * O(1) - Complejidad Constante
 *
 * Definición:
 * La complejidad O(1) significa que el tiempo de ejecución
 * del algoritmo no cambia aunque aumente el tamaño de los datos.
 *
 * Esto ocurre porque el algoritmo realiza siempre
 * la misma cantidad de operaciones.
 */

public class ComplejidadConstante {

    public static void main(String[] args) {

        // Se crea un arreglo con varios elementos
        int[] numeros = {10, 20, 30, 40, 50};

        /*
         * Acceso directo a una posición específica del arreglo.
         *
         * En este caso se accede únicamente al elemento
         * ubicado en la posición 0.
         *
         * No importa si el arreglo tiene 5 elementos,
         * 100 o 1 millón, el acceso sigue siendo inmediato.
         */
        System.out.println(numeros[0]);

        /*
         * ¿Por qué este algoritmo tiene complejidad O(1)?
         *
         * 1. El número de operaciones es fijo.
         * 2. No recorre todo el arreglo.
         * 3. No depende del tamaño de entrada.
         * 4. Siempre ejecuta las mismas líneas.
         * 5. El tiempo de ejecución permanece constante.
         */

    }
}