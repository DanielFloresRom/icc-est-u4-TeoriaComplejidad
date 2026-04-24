public class ComplejidadCuadratica {
    // Este tipo de complejidad ve como aumenta el tiempo de ejecucion proportionalmente al cuadrado del tamaño de la entrada.
    // Esto significa que si el tamaño de la entrada se duplica, el tiempo de ejecución se cuadruplica por eso es la notacion O(n²).

    // Un ejemplo claro es un algoritmo que compara los elemntos de una lista, como el algoritmo de ordenamiento de burbuja.

    public void ejemplo() {
    int[] n = {5, 10, 3};  //n es el tamaño de la entrada
    int tam = n.length;
    int operaciones=0;
    for (int i = 0; i < tam; i++) {
        for (int j = 0; j < tam; j++) {
            operaciones++;
        }
    }
    System.out.println("Operaciones: " + (operaciones)); // Esto muestra el número de operaciones realizadas, que es proporcional a n²

    //En este caso, el numero de operaciones no es fijo ya que depende del tamaño de la entrada la cual se elevaria al cuadrado (n²).
    //Se repetiran siempre las mismas lineas de codigo pero el numero de veces que se ejecutaran dependera del tamaño de la entrada.

    }
}

