/*

Dada una lista doblemente enlazada, obtener la cantidad de elementos totales a partir de un nodo
cualquiera. Los únicos métodos que expone la lista son los siguientes:

public class ListaDobleEnlace {
    ...
    public int getNumero();
    public ListaDobleEnlace getIzquierda();
    public ListaDobleEnlace getDerecha();
}

Ej:

Arbol <-> Casa <-> Ruta                 // Resultado: 3
Pedro <-> Juan <-> Jose <-> Marcos      // Resultado: 4 

*/

public static int largoListaDobleEnlace(ListaDobleEnlace nodoX) {
    
    int start = nodoX.getNumero();
    
    while (start != 0) {
        nodoX.getIzquierda();
        start = nodoX.getNumero();
    }

    int i = 0;

    while (nodoX != null) {
        i++;
        nodoX.getDerecha();
    }

    return i;

}

/*

En la linea 22 obtenemos el número del nodo y lo asignamos a la variable 'start'. En la linea 24
buscamos con un while loop el primer nodo, para eso vamos moviendo el índice hacia la izquierda
con el método getIzquierda() hasta que 'start' es igual a 0.

Una vez que sabemos donde empieza, recorremos una vez más los nodos en la línea 31 buscando hasta que
el valor sea null (o sea que no hay más nodos para recorrer) y asignamos el número de veces que se 
recorrió el loop a un contador (i).

*/