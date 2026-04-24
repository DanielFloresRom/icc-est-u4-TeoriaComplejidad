# Complejidad O(n) – Lineal

La complejidad O(n) (lineal) describe algoritmos cuyo tiempo de ejecución crece de forma proporcional a medida que aumenta el tamaño de los datos.

En este caso, se implementa una búsqueda lineal, que es un algoritmo básico para encontrar un elemento dentro de un arreglo. A diferencia de la búsqueda binaria, este método no requiere que los datos estén ordenados, ya que revisa cada elemento uno por uno desde el inicio.

El programa trabaja con un arreglo de objetos `Persona`, donde cada objeto contiene un nombre. El algoritmo compara cada nombre con el valor que se desea encontrar.

En lugar de dividir el problema como en la búsqueda binaria, aquí el algoritmo recorre todo el arreglo secuencialmente hasta encontrar el elemento o llegar al final.

## Funcionamiento del algoritmo

1. Se crea un arreglo de personas con nombres.
2. Se define el nombre que se desea buscar.
3. Se inicia el recorrido desde la posición 0.
4. En cada iteración:
   - Se muestra el elemento actual.
   - Se compara con el valor buscado.
5. Si se encuentra coincidencia:
   - Se imprime la posición.
   - El algoritmo se detiene con `break`.
6. Si no se encuentra:
   - El recorrido continúa hasta el final del arreglo.

## Justificación de la complejidad O(n)

- El algoritmo revisa los elementos uno por uno.
- En el peor de los casos, recorre todo el arreglo.
- El número de operaciones depende directamente del tamaño del arreglo (n).
- A mayor número de elementos, mayor tiempo de ejecución.
- El crecimiento del algoritmo es lineal.

## Ejemplo

Arreglo:
```
Juan, Maria, Pedro
```

Elemento buscado:
```
Maria
```

Proceso:
```
Posición 0 → Juan (no coincide)
Posición 1 → Maria (coincide → se detiene)
```

Resultado:
```
Encontrado en posición: 1
```

# 2. Complejidad O(1) – Constante

La complejidad O(1) (constante) describe algoritmos cuyo tiempo de ejecución no cambia, sin importar el tamaño de los datos.

En este caso, se implementa un acceso directo a un elemento dentro de un arreglo. A diferencia de otros algoritmos como la búsqueda lineal o binaria, aquí no es necesario recorrer ni analizar múltiples elementos, ya que se accede directamente a una posición específica.

El programa trabaja con un arreglo de números y obtiene el valor ubicado en una posición fija (índice 0).

Debido a que siempre se realiza una única operación, el tiempo de ejecución permanece constante.

## Funcionamiento del algoritmo

1. Se crea un arreglo con varios números.
2. Se muestra el contenido del arreglo.
3. Se accede directamente a una posición específica (posición 0).
4. Se imprime el valor almacenado en esa posición.

## ¿Por qué es O(1)?

- El algoritmo realiza una sola operación.
- No recorre el arreglo.
- No depende del tamaño de los datos.
- Siempre accede a la misma posición.
- El tiempo de ejecución es constante.

## Ejemplo

Arreglo:
```
10, 20, 30, 40, 50
```

Proceso:
```
Acceso directo a la posición 0
```

Resultado:
```
Elemento en posición 0: 10
```
# 3. Complejidad O(n²) – Cuadrática

La complejidad O(n²) (cuadrática) describe algoritmos cuyo tiempo de ejecución crece proporcionalmente al cuadrado del tamaño de los datos.

En este caso, se implementa un algoritmo que utiliza ciclos anidados para recorrer un arreglo. Esto significa que por cada elemento del arreglo, se vuelve a recorrer todo el arreglo nuevamente.

El programa trabaja con un arreglo de números y compara cada elemento con todos los demás, contando cuántas operaciones se realizan en total.

Debido a esta estructura, el número de operaciones aumenta rápidamente a medida que crece el tamaño del arreglo.

## Funcionamiento del algoritmo

1. Se crea un arreglo de números.
2. Se obtiene el tamaño del arreglo.
3. Se inicializa un contador de operaciones.
4. Se ejecuta un primer ciclo (externo) que recorre el arreglo.
5. Dentro de este, se ejecuta un segundo ciclo (interno):
   - Se compara cada posición con todas las demás.
   - Se incrementa el contador de operaciones.
6. Al final, se muestra el total de operaciones realizadas.

## ¿Por qué es O(n²)?

- El algoritmo tiene dos ciclos anidados.
- Por cada iteración del ciclo externo, el ciclo interno se ejecuta completamente.
- El número total de operaciones es n × n.
- A medida que crece el tamaño del arreglo, las operaciones aumentan de forma cuadrática.
- El tiempo de ejecución crece rápidamente.

## Ejemplo

Arreglo:
```
5, 10, 3
```

Proceso:
```
i = 0 → j = 0,1,2
i = 1 → j = 0,1,2
i = 2 → j = 0,1,2
```

Resultado:
```
Total de operaciones: 9
```
# 4. Complejidad O(log n) – Logarítmica

La complejidad O(log n) (logarítmica) describe algoritmos cuyo tiempo de ejecución crece de forma muy lenta a medida que aumenta el tamaño de los datos.

En este caso, se implementa una búsqueda binaria, un algoritmo eficiente para encontrar un elemento dentro de un arreglo ordenado. A diferencia de la búsqueda lineal, este método divide el problema en dos partes en cada iteración, descartando la mitad de los datos.

El programa trabaja con un arreglo ordenado de números y busca un valor específico (Persona 4), reduciendo progresivamente el rango de búsqueda.

Debido a esta estrategia, el número de operaciones disminuye considerablemente en comparación con otros algoritmos.

## Funcionamiento del algoritmo

1. Se crea un arreglo ordenado de números.
2. Se define el valor que se desea buscar.
3. Se establecen dos variables:
   - `inicio` (posición inicial)
   - `fin` (posición final)
4. Mientras exista un rango válido (`inicio <= fin`):
   - Se calcula la posición media.
   - Se compara el valor medio con el objetivo.
   - Si coincide:
     - Se muestra la posición.
     - El algoritmo termina.
   - Si es menor:
     - Se descarta la mitad izquierda.
   - Si es mayor:
     - Se descarta la mitad derecha.
5. Si no se encuentra, se muestra un mensaje indicando que no existe.

## ¿Por qué es O(log n)?

- En cada iteración se divide el arreglo en dos partes.
- Se elimina la mitad de los datos en cada paso.
- El número de operaciones crece de forma logarítmica.
- Es mucho más eficiente que recorrer todo el arreglo.
- El tiempo de ejecución aumenta muy lentamente.

## Ejemplo

Arreglo:
```
1, 2, 3, 4, 5, 6, 7
```

Elemento buscado:
```
4
```

Proceso:
```
Rango [0-6] → medio = 3 → valor = 4 (encontrado)
```

Resultado:
```
Persona encontrada en posición: 3
```


# 5.Complejidad O(n log n) 

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