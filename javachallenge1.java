/* 

Explique cómo encontrar el mayor elemento de una lista de enteros. Para este ejercicio la lista es un
tipo propio que solo expone los métodos elemento(i) y largo()

public class ListaPobre {
    ...
    public int elemento(int i);
    public int largo();
}

Ej: para la siguiente lista {5, 8, 0, -10, 44, 89, 1, 3, 7, 77, 12, -3, 4} el método debería devolver: 89

*/

public static int obtenerMaximo(ListaPobre lista) {
    
    int maxNum = 0;

    for (int i = 0; i < ListaPobre.largo(); i++) {
        if (maxNum < ListaPobre.elemento(i)) {
            maxNum = ListaPobre.elemento(i);
        }
    }

    return maxNum;
} 

/* 

Explicación: declaramos una variable maxNum para ir guardando el valor más grande, esta variable empieza en 0
y se compara con cada uno de los elementos de la lista usando un for loop (línea 20 a 24).

Dentro del loop comparamos maxNum con cada elemento de la lista, si el elemento es mayor que el número máximo que
tenemos hasta el momento, se asignará este nuevo valor como número máximo. Así recorremos toda la lista, el último
número máximo que quede almacenado en en maxNum será el más grande de la lista.

Utilizamos el largo de la lista para recorrer todos los elementos del array (línea 21) desde 0 hasta el largo total.

*/