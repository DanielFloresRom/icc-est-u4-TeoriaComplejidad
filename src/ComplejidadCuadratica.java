complejidad cuadratica: public class ComplejidadCuadratica {

    /*
     * O(n²) - Complejidad Cuadrática
     *
     * Definición:
     * Este tipo de complejidad muestra cómo el tiempo de ejecución
     * crece proporcionalmente al cuadrado del tamaño de la entrada.
     *
     * Esto significa que si el tamaño de la entrada se duplica,
     * el número de operaciones se cuadruplica.
     *
     * Un ejemplo común es cuando se utilizan ciclos anidados,
     * como en algunos algoritmos de ordenamiento (ej: burbuja).
     */

    public void ejemplo() {

        // Arreglo de entrada
        int[] n = {5, 10, 3};
        int tam = n.length;

        int operaciones = 0;

        /*
         * Se muestra el arreglo sobre el cual se trabajará
         */
        System.out.print("Arreglo: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        /*
         * Se indica el inicio del proceso
         */
        System.out.println("Iniciando recorrido con ciclos anidados...");
        System.out.println("Tamaño del arreglo (n): " + tam);

        /*
         * Primer ciclo (externo)
         */
        for (int i = 0; i < tam; i++) {

            System.out.println("Iteración externa i = " + i);

            /*
             * Segundo ciclo (interno)
             */
            for (int j = 0; j < tam; j++) {

                System.out.println("   Comparando posición i=" + i + " con j=" + j);

                operaciones++;
            }
        }

        /*
         * Se muestra el total de operaciones realizadas
         */
        System.out.println("Total de operaciones: " + operaciones);

        /*
         * ¿Por qué este algoritmo es O(n²)?
         *
         * 1. Tiene dos ciclos anidados.
         * 2. Por cada iteración del ciclo externo,
         *    el ciclo interno se ejecuta completamente.
         * 3. El número total de operaciones es n * n.
         * 4. El crecimiento del algoritmo es cuadrático.
         */
    }}

