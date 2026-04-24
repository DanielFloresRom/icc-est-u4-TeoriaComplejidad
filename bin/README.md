# 1. Complejidad O(log n) – Logarítmica
La complejidad O(log n) (logarítmica) describe algoritmos cuyo tiempo de ejecución crece de forma muy lenta a medida que aumenta el tamaño de los datos.

En este caso, se implementa una búsqueda binaria, que es un algoritmo eficiente para encontrar un elemento dentro de un arreglo ordenado. En lugar de recorrer todos los elementos uno por uno, el algoritmo analiza el elemento central y, dependiendo del resultado, descarta la mitad de los datos en cada iteración.

public class ComplejidadLogaritmica {

    public void ejemplo() {

        // Arreglo ordenado (requisito para usar búsqueda binaria)
        // Cada número representa una "persona"
        int[] personas = {1, 2, 3, 4, 5, 6, 7};

        // Valor que queremos buscar (Persona 4)
        int objetivo = 4;

        // Variable que indica el inicio del rango de búsqueda
        int inicio = 0;

        // Variable que indica el final del rango de búsqueda
        int fin = personas.length - 1;

        // Este ciclo es donde ocurre la complejidad O(log n)
        // Se repite mientras exista un rango válido
        while (inicio <= fin) {

            // Se calcula el punto medio del arreglo
            // Sirve para dividir el problema en dos partes
            int medio = (inicio + fin) / 2;

            // Se compara el valor del medio con el objetivo
            if (personas[medio] == objetivo) {

                // Si coincide, se encontró el elemento
                // El algoritmo termina aquí
                System.out.println("Persona encontrada en posición: " + medio);
                return;
            } 
            
            // Si el valor del medio es menor que el objetivo
            else if (personas[medio] < objetivo) {

                // Significa que el objetivo está en la mitad derecha
                // Se descarta toda la mitad izquierda
                inicio = medio + 1;
            } 
            
            // Si el valor del medio es mayor que el objetivo
            else {

                // Significa que el objetivo está en la mitad izquierda
                // Se descarta toda la mitad derecha
                fin = medio - 1;
            }
        }

        // Si termina el ciclo sin encontrar el elemento
        System.out.println("Persona no encontrada");
    }
}

## 2.Complejidad O(n) – Lineal

La complejidad O(n) (lineal) describe algoritmos cuyo tiempo de ejecución crece de forma proporcional al tamaño de los datos.

En este caso, se implementa una búsqueda lineal, que consiste en recorrer todos los elementos de un arreglo hasta encontrar el valor deseado. A diferencia de la búsqueda binaria, aquí no se descartan elementos, sino que se revisan uno por uno.

public class ComplejidadLineal {

    public void ejemplo() {

        // Arreglo de personas (no necesita estar ordenado)
        // Cada número representa una "persona"
        int[] personas = {1, 2, 3, 4, 5, 6, 7};

        // Valor que queremos buscar (Persona 4)
        int objetivo = 4;

        // Este ciclo es donde ocurre la complejidad O(n)
        // Se recorre el arreglo completo si es necesario
        for (int i = 0; i < personas.length; i++) {

            // Se compara cada elemento con el objetivo
            if (personas[i] == objetivo) {

                // Si coincide, se encontró el elemento
                System.out.println("Persona encontrada en posición: " + i);
                return;
            }
        }

        // Si termina el ciclo sin encontrar el elemento
        System.out.println("Persona no encontrada");
    }
}

### 3.Complejidad O(1) – Constante

La complejidad O(1), también conocida como complejidad constante, describe algoritmos cuyo tiempo de ejecución permanece igual sin importar el tamaño de los datos de entrada.

Esto significa que el algoritmo siempre ejecuta la misma cantidad de operaciones, independientemente de si trabaja con pocos o muchos elementos.

En este caso, se implementa un ejemplo simple de acceso directo a un elemento dentro de un arreglo. El algoritmo no necesita recorrer toda la estructura de datos, ya que accede inmediatamente a una posición específica mediante su índice.

public class ComplejidadConstante {

    public void ejemplo() {

        // Se crea un arreglo con varios números
        // Cada posición almacena un valor específico
        int[] numeros = {10, 20, 30, 40, 50};

        /*
         * Acceso directo a la posición 0 del arreglo.
         *
         * Aquí ocurre la complejidad O(1),
         * porque el programa obtiene el dato
         * inmediatamente sin recorrer el arreglo.
         */
        System.out.println(numeros[0]);

        /*
         * ¿Por qué es O(1)?
         *
         * - El número de operaciones es fijo.
         * - No existen ciclos ni repeticiones.
         * - No importa cuántos elementos tenga el arreglo.
         * - El acceso al dato siempre es inmediato.
         *
         * Aunque el arreglo tenga:
         * 5 elementos,
         * 100 elementos,
         * o 1 millón,
         * el tiempo de ejecución prácticamente no cambia.
         */
    }
}

#### 4.Complejidad O(n²) – Cuadrática

La complejidad O(n²) (cuadrática) describe algoritmos cuyo tiempo de ejecución crece proporcionalmente al cuadrado del tamaño de los datos.

En este caso, se utilizan dos bucles anidados, lo que provoca que por cada elemento del arreglo se recorran nuevamente todos los elementos. Esto hace que el número de operaciones aumente rápidamente.

public class ComplejidadCuadratica {

    public void ejemplo() {

        // Arreglo de datos (n es el tamaño de la entrada)
        int[] n = {5, 10, 3};

        int tam = n.length;

        // Contador de operaciones
        int operaciones = 0;

        // Este doble ciclo es donde ocurre la complejidad O(n²)
        for (int i = 0; i < tam; i++) {

            // Por cada elemento, se recorre todo el arreglo otra vez
            for (int j = 0; j < tam; j++) {

                // Se incrementa el contador en cada iteración
                operaciones++;
            }
        }

        // Se muestra el total de operaciones realizadas
        System.out.println("Operaciones: " + operaciones);
    }
}
##### 5.Complejidad O(n log n) – Lineal Logarítmica

La complejidad O(n log n) describe algoritmos cuyo tiempo de ejecución combina un crecimiento lineal con uno logarítmico.

En este caso, el algoritmo recorre todos los elementos del arreglo (O(n)) y, por cada uno, realiza un proceso que reduce el valor a la mitad en cada iteración (O(log n)). Esto genera una complejidad total de O(n log n).

public class EjemploNlogN {

    public static void main(String[] args) {

        // Arreglo de datos de entrada
        int[] numeros = {5, 3, 8, 4, 2, 7, 1, 6};
        int n = numeros.length;

        System.out.println("Inicio del proceso:");

        // Ciclo externo: recorre todos los elementos del arreglo (O(n))
        for (int i = 0; i < n; i++) {

            int valor = numeros[i];

            // Ciclo interno: divide el valor entre 2 en cada iteración (O(log n))
            while (valor > 1) {
                System.out.println("Procesando valor: " + valor);
                valor = valor / 2;
            }
        }

        System.out.println("Fin del proceso");
    }
}