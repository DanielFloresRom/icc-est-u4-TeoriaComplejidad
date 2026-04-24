/**
 * Clase: ComplejidadLineal
 * 
 * Complejidad: O(n)
 * 
 * Descripción:
 * Esta clase implementa un ejemplo de búsqueda lineal.
 * La búsqueda lineal consiste en recorrer un arreglo elemento por elemento
 * desde el inicio hasta encontrar el valor deseado.
 * 
 * Justificación de la complejidad:
 * - Se revisa cada elemento uno por uno.
 * - En el peor caso, se recorre todo el arreglo.
 * - El número de operaciones depende directamente de n.
 */

class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class ComplejidadLineal {

    /*
     * Método que ejecuta la búsqueda lineal
     */
    public void ejemplo() {

        // Se crea un arreglo de objetos Persona
        Persona[] personas = {
            new Persona("Juan"),
            new Persona("Maria"),
            new Persona("Pedro")
        };

        // Elemento que se desea buscar
        String buscado = "Maria";

        /*
         * Se muestra el contenido del arreglo.
         * Esto permite visualizar sobre qué datos se realiza la búsqueda.
         */
        System.out.print("Personas: ");
        for (int i = 0; i < personas.length; i++) {
            System.out.print(personas[i].nombre + " ");
        }
        System.out.println();

        /*
         * Se indica desde dónde inicia la búsqueda.
         * Siempre comienza desde la posición 0.
         */
        System.out.println("Iniciando búsqueda desde la posición 0");

        /*
         * Se indica el elemento que se desea encontrar.
         */
        System.out.println("Buscando: " + buscado);

        /*
         * Recorrido del arreglo elemento por elemento.
         */
        for (int i = 0; i < personas.length; i++) {

            /*
             * Se muestra la posición actual y el valor evaluado.
             */
            System.out.println("Posición " + i + " -> Revisando: " + personas[i].nombre);

            /*
             * Comparación del elemento actual con el valor buscado.
             */
            if (personas[i].nombre.equals(buscado)) {

                System.out.println("Encontrado en posición: " + i);
                break; // Se detiene al encontrarlo
            }
        }

        /*
         * ¿Por qué este algoritmo es O(n)?
         *
         * 1. Recorre el arreglo desde el inicio.
         * 2. Puede revisar todos los elementos en el peor caso.
         * 3. El número de iteraciones depende del tamaño del arreglo.
         * 4. A mayor número de elementos, mayor tiempo de ejecución.
         * 5. El crecimiento del algoritmo es lineal.
         */
    }
}