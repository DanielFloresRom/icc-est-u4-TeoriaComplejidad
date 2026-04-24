public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Complejidad Cuadratica");
        new ComplejidadCuadratica().ejemplo();
        System.out.println("");
        System.out.println("Complejidad Logaritmica");
        new ComplejidadLogaritmica().Ejemplo();
        System.out.println("");
        System.out.println("Complejidad Constante");
        new ComplejidadConstante().ejemplo();
        System.out.println("");
        System.out.println("Complejidad Lineal");
        new ComplejidadLineal().ejemplo();
        System.out.println("");
        System.out.println("Complejidad O(n log n)");
        ComplejidadNlogN obj = new ComplejidadNlogN();
        obj.ejecutar();
    }
}
