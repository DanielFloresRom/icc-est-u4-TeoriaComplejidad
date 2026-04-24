public class ComplejidadNlogN {

    /*
     * O(n log n) - Complejidad N log N
     *
     * Definición:
     * Este tipo de complejidad combina un proceso lineal con uno logarítmico.
     *
     * - Se recorren todos los elementos del arreglo (O(n))
     * - Para cada elemento, se reduce el problema a la mitad (O(log n))
     *
     * Por eso, la complejidad total es O(n log n).
     */

    /*
     * Método: ejecutar
     * Ejecuta el algoritmo que combina un ciclo lineal con uno logarítmico.
     */
    public void ejecutar() {

        // Arreglo de entrada con datos de ejemplo
        int[] numeros = {5, 3, 8, 4, 2, 7, 1, 6};

        // Tamaño del arreglo (n)
        int n = numeros.length;

        /*
         * Se muestra el arreglo sobre el cual se trabajará
         */
        System.out.print("Arreglo: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Inicio del proceso:");

        /*
         * Ciclo externo (for):
         * Recorre todos los elementos del arreglo
         * Complejidad: O(n)
         */
        for (int i = 0; i < n; i++) {

            // Se toma el valor actual del arreglo
            int valor = numeros[i];

            /*
             * Se indica desde qué posición se está trabajando
             */
            System.out.println("\nPosición " + i + " -> Valor inicial: " + valor);

            /*
             * Ciclo interno (while):
             * Divide el valor entre 2 en cada iteración
             * Esto reduce el problema progresivamente
             * Complejidad: O(log n)
             */
            while (valor > 1) {

                System.out.println("   Procesando valor: " + valor);

                // División que genera comportamiento logarítmico
                valor = valor / 2;
            }

            /*
             * Se muestra el valor final después de las divisiones
             */
            System.out.println("   Valor final (<=1): " + valor);
        }

        System.out.println("\nFin del proceso");
    }}