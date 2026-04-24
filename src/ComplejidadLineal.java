/**
 * Clase: ComplejidadLineal
 * 
 * Complejidad: O(n)
 * 
 * Descripción:
 * Esta clase implementa un ejemplo de búsqueda lineal.
 * La búsqueda lineal consiste en recorrer un arreglo elemento por elemento
 * hasta encontrar el valor deseado.
 * 
 * Justificación de la complejidad:
 * - Se revisa cada elemento uno por uno.
 * - En el peor caso, se recorre todo el arreglo.
 * - Por eso, el número de operaciones crece proporcionalmente a n.
 */
class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class ComplejidadLineal {
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Juan"),
            new Persona("Maria"),
            new Persona("Pedro")
        };

        String buscado = "Maria";

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].nombre.equals(buscado)) {
                System.out.println("Encontrado en posición: " + i);
                break;
            }
        }
    }
}