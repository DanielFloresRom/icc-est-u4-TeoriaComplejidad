public class ComplejidadLogaritmica {

    /**
     * Clase: ComplejidadLogaritmica
     * 
     * Complejidad: O(log n)
     * 
     * Descripción:
     * Esta clase implementa un ejemplo de búsqueda binaria.
     * La búsqueda binaria consiste en encontrar un elemento dentro de un arreglo ordenado,
     * reduciendo el tamaño del problema a la mitad en cada iteración.
     * 
     * Justificación de la complejidad:
     * - En cada paso se divide el arreglo en dos partes.
     * - Se descarta una mitad completa del problema.
     * - Por eso, el número de operaciones crece de forma logarítmica.
     */

    /**
     * Método ejemplo:
     * Realiza la búsqueda de un elemento (Persona 4) dentro de un arreglo ordenado.
     */
    public void Ejemplo() {

        // Lista ordenada (requisito para búsqueda binaria)
        int[] personas = {1, 2, 3, 4, 5, 6, 7};

        int objetivo = 4; // Persona 4
        int inicio = 0;
        int fin = personas.length - 1;

        /*
         * Se muestra el arreglo sobre el cual se va a trabajar.
         */
        System.out.print("Arreglo (Personas): ");
        for (int i = 0; i < personas.length; i++) {
            System.out.print(personas[i] + " ");
        }
        System.out.println();

        /*
         * Se indica desde dónde inicia la búsqueda.
         */
        System.out.println("Iniciando búsqueda binaria desde posición " + inicio + " hasta " + fin);

        System.out.println("Buscando Persona: " + objetivo);

        /**
         * Ciclo principal:
         * Este while representa la complejidad O(log n)
         * porque en cada iteración reduce el rango de búsqueda a la mitad.
         */
        while (inicio <= fin) {

            /*
             * Se calcula la posición media del arreglo.
             */
            int medio = (inicio + fin) / 2;

            /*
             * Se muestra el estado actual de la búsqueda.
             */
            System.out.println("Rango actual: [" + inicio + " - " + fin + "]");
            System.out.println("Posición media: " + medio + " -> Valor: " + personas[medio]);

            /*
             * Comparación con el objetivo.
             */
            if (personas[medio] == objetivo) {
                System.out.println("Persona encontrada en posición: " + medio);
                return;
            } 
            else if (personas[medio] < objetivo) {

                /*
                 * Se descarta la mitad izquierda.
                 */
                System.out.println("El valor es menor al objetivo → se busca en la mitad derecha");

                inicio = medio + 1;
            } 
            else {

                /*
                 * Se descarta la mitad derecha.
                 */
                System.out.println("El valor es mayor al objetivo → se busca en la mitad izquierda");

                fin = medio - 1;
            }
        }

        System.out.println("Persona no encontrada");
    }}