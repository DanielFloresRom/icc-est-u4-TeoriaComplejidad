public class ComplejidadNlogN {

    public static void main(String[] args) {

        // Arreglo de datos de entrada
        int[] numeros = {5, 3, 8, 4, 2, 7, 1, 6};
        int n = numeros.length;

        System.out.println("Inicio del proceso:");

        // Ciclo externo: recorre todos los elementos del arreglo
        // Complejidad: O(n)
        for (int i = 0; i < n; i++) {

            int valor = numeros[i];

            // Ciclo interno: reduce el valor a la mitad en cada iteración
            // Complejidad: O(log n)
            while (valor > 1) {
                System.out.println("Procesando valor: " + valor);
                valor = valor / 2;
            }
        }

        System.out.println("Fin del proceso");
    }
}