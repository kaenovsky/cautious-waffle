/*

Un palíndromo es una palabra o frase que se lee igual al derecho que al revés. Hacer un método que
determine si un String es palíndromo tal cual está definido (no modificar espacios o mayúsculas). No
está permitido usar métodos que den vuelta el string como StringBuilder::reverse. Si necesita
un método que haga eso debe definirlo.

Ej:

esPalindromo("NEUQUEN") => TRUE
esPalindromo("SANTA FE") => FALSE

*/

public static boolean esPalindromo(String s) {
    
    for (int i = s.length(); i > 0; i--) {
        String reverseWord = reverseWord + i;
    }

    if (reverseWord == s) {
        return true;
    }
    
    else {
        return false;
    }
}