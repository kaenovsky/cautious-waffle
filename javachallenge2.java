/* 

Dado un arreglo de enteros, hacer un método que devuelva los rangos de números consecutivos que
sumados dan la cantidad que se le pasa como parámetro:

Ej: int a[] = {5, 8, 0, -10, 44, 89, 1, 3, 7, 77, 12, -3, 4};
subarregloConSuma(a, 13): {0,1} {2,5} {3,7} {9,10} {12,19} {13,19} {14,19} {18,22}

Cada elemento de la lista en el resultado es un arreglo de dos enteros con los índices de comienzo y fin
del subarreglo que suma lo pedido.

*/

public static List<int[]> subarregloConSuma(int array[], int target) {
    List<int[]> rangos = new ArrayList<int[]>();
    
    int indexFirstNum = 0;
    int indexFinalNum = 0;

    for (int i = 0; i < array[].size(); i++) {
        
        indexFirstNum = array[i];
        int resultSum = indexFirstNum;

        for (int j = 0; j < array[].size(); j++) {
            resultSum = resultSum + array[j];
            if (resultSum == target) {
                indexPair.add(indexFirstNum, indexFinalNum);
                rangos.add(indexPair);
            }
        }
    }

    return rangos;
} 

/* 

Creamos un for loop que recorre la lista de números. En la primera iteración del loop asignamos 
el elemento de la lista que estamos evaluando a la variable indexFirstNum. Seguidamente recorremos 
nuevamente la lista sumando a este número los siguientes valores del arreglo. Si la suma de los 
valores da como resultado el mismo valor del parámetro 'target', entonces agregamos los valores 
de 'indexFirstNum' e 'indexFinalNum' a un arreglo que luego agregamos a la lista 'rangos'.

*/