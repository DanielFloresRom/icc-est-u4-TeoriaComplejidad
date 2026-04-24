public class EjemploNlogN {

    /*
     * Método: ejecutar
     * Ejecuta el algoritmo que combina un ciclo lineal con uno logarítmico.
     */
    public void ejecutar() {
        // Arreglo de entrada con datos de ejemplo
        int[] numeros = {5, 3, 8, 4, 2, 7, 1, 6};
        // Tamaño del arreglo (n)
        int n = numeros.length;
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
             * Ciclo interno (while):
             * Divide el valor entre 2 en cada iteración
             * Esto reduce el problema progresivamente
             * Complejidad: O(log n)
             */
            while (valor > 1) {
                System.out.println("Procesando valor: " + valor);

                // División que genera comportamiento logarítmico
                valor = valor / 2;
            }
        }
        System.out.println("Fin del proceso");
    }
}