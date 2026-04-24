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

    /*
     * Método que demuestra la complejidad O(1)
     *
     * Se accede directamente a una posición específica del arreglo,
     * sin necesidad de recorrerlo.
     */
    public void ejemplo() {

        // Se crea un arreglo con varios elementos
        int[] numeros = {10, 20, 30, 40, 50};

        /*
         * Se muestra el contenido del arreglo.
         * Esto permite visualizar los datos sobre los cuales se trabaja.
         */
        System.out.print("Arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        /*
         * Se indica desde dónde se realiza el acceso.
         * En este caso, directamente desde la posición 0 (inicio del arreglo).
         */
        System.out.println("Accediendo directamente a la posición 0 (inicio del arreglo)");

        /*
         * Acceso directo al elemento en la posición 0.
         *
         * No importa el tamaño del arreglo,
         * siempre se realiza una única operación.
         */
        System.out.println("Elemento en posición 0: " + numeros[0]);

        /*
         * ¿Por qué este algoritmo tiene complejidad O(1)?
         *
         * 1. El número de operaciones es fijo.
         * 2. No recorre el arreglo.
         * 3. No depende del tamaño de entrada.
         * 4. Siempre accede a la misma posición.
         * 5. El tiempo de ejecución permanece constante.
         */
    }}