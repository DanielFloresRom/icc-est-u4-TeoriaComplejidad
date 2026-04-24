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

     public void Ejemplo(){

     /**
     * Método ejemplo:
     * Realiza la búsqueda de un elemento (Persona 4) dentro de un arreglo ordenado.
     */

        // Lista ordenada (requisito para búsqueda binaria)
        int[] personas = {1, 2, 3, 4, 5, 6, 7};

        int objetivo = 4; // Persona 4
        int inicio = 0;
        int fin = personas.length - 1;

        System.out.println("Buscando Persona " + objetivo);


        /**
         * Ciclo principal:
         * Este while representa la complejidad O(log n)
         * porque en cada iteración reduce el rango de búsqueda a la mitad.
         */
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            System.out.println("Revisando posición: " + medio);

            if (personas[medio] == objetivo) {
                System.out.println("Persona encontrada en posición: " + medio);
                return;
            } 
            else if (personas[medio] < objetivo) {
                inicio = medio + 1;
            } 
            else {
                fin = medio - 1;
            }
        }

        System.out.println("Persona no encontrada");
    }
}