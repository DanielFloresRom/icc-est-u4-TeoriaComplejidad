# La Teoria de la Complejidad

## 1. Importancia de los algoritmos
Los algoritmos son una parte esencial de la informática y la programación porque permiten desarrollar soluciones estructuradas y eficientes para distintos problemas.

Principales razones de su importancia
1. Resolución de problemas
Permiten transformar problemas complejos en procesos organizados y fáciles de ejecutar.
2. Base de la programación
Todo programa informático funciona gracias a algoritmos implementados mediante código.
3. Optimización de recursos
Un buen algoritmo reduce el tiempo de ejecución y el consumo de memoria.
4. Automatización
Ayudan a automatizar tareas repetitivas, mejorando la productividad y disminuyendo errores humanos.
5. Escalabilidad
Los algoritmos eficientes permiten que las aplicaciones funcionen correctamente incluso con grandes cantidades de datos.

### 2. Conceptos de Eficiencia en Algoritmos
¿Qué es un algoritmo eficiente?

Un algoritmo eficiente es aquel que resuelve un problema correctamente utilizando la menor cantidad posible de tiempo y memoria.

Su objetivo es optimizar recursos, evitando operaciones innecesarias y mejorando el rendimiento.

Coste temporal

El coste temporal mide el tiempo que tarda un algoritmo en ejecutarse según el tamaño de la entrada (n).

Se expresa generalmente con notación Big O para analizar cómo crece el tiempo al aumentar los datos.

Coste espacial

El coste espacial representa la cantidad de memoria que utiliza un algoritmo durante su ejecución.

Incluye variables, estructuras de datos y espacio adicional requerido para resolver el problema.

Ejemplo (O(n))

Este ejemplo muestra una búsqueda lineal en un arreglo de objetos Persona.

En el peor caso, se recorre toda la lista, por lo que su complejidad es O(n).

#### 3. Factores de tiempo de ejecucion

 Factores propios: Son principalmente los que dependen del programa, como la estructura y la calidad del codigo e incluso el lenguaje de programación.

Factores circunstanciales: Son más externos y no dependen del programa en si, incluyen el sistema operativo, el hardware o carga del sistema.

Análisis Teórico: Es el análisis sin ejecutar el código, se puede analizar cuantas veces se repite un bucle con matemáticas, no dependiendo de la computadora.

Análisis Experimental: Es el que mas lo comprueba lo que pasa cuando se ejecuta el código, midiendo el tiempo real con ayuda de la computadora.

##### 4. Notación Big O
1. ¿Qué es?
La notación Big O es una herramienta utilizada en la teoría de la complejidad para describir el comportamiento del tiempo de ejecución de un algoritmo en función del tamaño de la entrada, representado como n.

Su objetivo principal es analizar cómo crece el tiempo o el número de operaciones cuando aumenta la cantidad de datos.

No mide el tiempo exacto en segundos, sino el orden de crecimiento, ignorando constantes y detalles menores.
2. Mejor caso
El mejor caso representa la situación en la que el algoritmo se ejecuta bajo las condiciones más favorables posibles.

En este caso, el algoritmo realiza la menor cantidad de operaciones.
3. Peor caso
El peor caso describe el escenario en el que el algoritmo necesita realizar la mayor cantidad de operaciones posibles.

Es el análisis más importante, ya que garantiza el rendimiento máximo que puede llegar a tomar.
4. Caso promedio
El caso promedio representa el comportamiento esperado del algoritmo bajo condiciones normales.

Se calcula considerando una distribución promedio de los datos de entrada.
# Big O, Ω, Θ
# Big O (O) — Cota superior
La notación Big O describe el límite superior del tiempo de ejecución de un algoritmo.

Es decir, indica el máximo número de operaciones que un algoritmo puede realizar en el peor de los casos.
# Omega (Ω) — Cota inferior
La notación Ω (Omega) describe el límite inferior del tiempo de ejecución.

Indica el mínimo número de operaciones que un algoritmo puede realizar en el mejor de los casos.
# Theta (Θ) — Cota exacta
La notación Θ (Theta) describe el comportamiento exacto del algoritmo cuando el crecimiento del tiempo está acotado tanto por arriba como por abajo.

Es decir, cuando el algoritmo tiene el mismo comportamiento en el mejor, peor y caso promedio (o muy similar).

## 5. Tipos de Complejidad

### O(1) — Constante
El algoritmo siempre tarda lo mismo, sin importar cuántos datos haya.

Abrir tu mochila y sacar un cuaderno específico
(No importa si tienes 5 o 50 cosas, lo sacas igual)

Acceder a una posición de un arreglo array[0]

No depende del tamaño de entrada
Es la más rápida
Revisa cada elemento

### O(n) — Lineal
El tiempo crece según la cantidad de datos.

Buscar una persona en una fila
(Revisas uno por uno hasta encontrarla)

Recorrer un arreglo con un for

Si hay más datos → tarda más
Va uno por uno
Revisa cada elemento

### O(n²) — Cuadrática
El tiempo crece muy rápido porque se repiten procesos dentro de otros.

Comparar a todos los estudiantes entre sí
(Cada uno con todos los demás)

Un for dentro de otro for

Suele tener dos ciclos (for)
Muy ineficiente con muchos datos
Por cada elemento, revisa todos otra vez

### O(log n) — Logarítmica
Reduce el problema a la mitad en cada paso.

Adivinar un número del 1 al 100
Dices: 50
Si es mayor → vas a 75
Si es menor → vas a 25

No revisa todo
Divide y conquista
Cada paso elimina la mitad de los datos

### O(n log n)

Combina recorrer todos los datos (n) con dividir el problema (log n).

Ordenar una lista de números separándola en grupos y luego organizándolos
(Como organizar cartas dividiéndolas y luego juntándolas ordenadas)

Un for + algo que divide entre 2 

Mezcla recorrer + dividir
Muy usado en algoritmos de ordenamiento
Divide el problema y luego recorre

## 6. Conclusiones

### ¿Qué complejidad es más costosa y por qué?
De las complejidades analizadas, la más costosa fue O(n²) o complejidad cuadrática. Esto se debe a que utiliza ciclos anidados, provocando que el número de operaciones aumente rápidamente conforme crece la cantidad de datos. Por ejemplo, si un algoritmo O(n²) trabaja con 10 datos realiza muchas menos operaciones que cuando trabaja con 1000 datos, ya que el crecimiento no es proporcional, sino cuadrático. Esto hace que el tiempo de ejecución aumente considerablemente y el rendimiento disminuya en grandes volúmenes de información.

### ¿Qué aprendieron del análisis?
Durante el desarrollo del proyecto aprendimos que no basta con que un programa funcione correctamente, sino que también es importante analizar su eficiencia. También aprendimos a relacionar la teoría de la complejidad con código real en Java, identificando cómo crece el número de operaciones según el tamaño de los datos de entrada. Además, entendimos la importancia de optimizar algoritmos para mejorar el rendimiento de los programas y reducir el consumo de recursos.

### ¿Qué les sorprendió más al ver el código?
Lo que más nos sorprendió fue observar cómo pequeños cambios en la estructura del código pueden generar diferencias muy grandes en el rendimiento. Por ejemplo, vimos que un algoritmo O(log n) puede ser mucho más rápido que uno O(n), incluso cuando ambos resuelven el mismo problema. También llamó la atención cómo los ciclos anidados aumentan rápidamente la cantidad de operaciones realizadas.

### Reflexión adicional
Este proyecto permitió fortalecer tanto el pensamiento lógico como la capacidad de análisis en programación. A través del estudio de las complejidades se logró comprender que el desarrollo de software requiere no solo escribir código, sino también evaluar su comportamiento y rendimiento. Concluimos que el análisis de complejidad es una herramienta fundamental en la informática, ya que permite desarrollar soluciones más eficientes, escalables y optimizadas para problemas reales.

