EJERCICIO 1:

A. Sacamos el orden de tiempo de ejecución por línea y luego demostramos por qué la línea del llamado a la recursión es O(N).
Esto lo demostramos recorriendo algunos casos iniciales y luego el caso N de la recursión, contando la cantidad de veces que se ejecuta

B. Los ordenes de las sentencias dentro del while son O(1) porque son asignaciones. El while se ejecutará n-1 veces, por lo que tendrá un tiempo de ejecución de O(n-1), que se simplifica a O(n).
Por la regla de la multiplicación, todo el bucle tendrá un tiempo de ejecución O(n), y esté será el tiempo de ejecución de todo el módulo.

EJERCICIO 2:

A. En el caso lineal, se llamará k-1 veces al método fibonacciLineal más la vez del caso base. De este modo, se concluye que el tiempo de ejecución del método es de O(k).
B. Observamos que por cada fibo binario, llamamos 2 veces más a fibo binario. Al plantearlo en un árbol, vimos que por cada ejecución del metodo se abrían 2 ramas, resultando en potencias de 2 acorde a el índice n de Fibonacci a calcular, tal que la cantidad de veces que se ejecuta es 2^k.
