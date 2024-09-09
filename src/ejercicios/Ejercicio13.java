package ejercicios;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*13. Palíndromo de un número
        •	Descripción: Determina si el número a = 1221 es palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
        •	Variables: a = 1221.
        */
        int a = 1221;

        // Variable para almacenar el número invertido
        int numeroInvertido = 0;
        // Variable temporal para el número original
        int numeroOriginal = a;

        // Invertir el número
        while (numeroOriginal != 0) {
            // Obtener el último dígito
            int digito = numeroOriginal % 10;
            // Construir el número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            // Eliminar el último dígito del número original
            numeroOriginal /= 10;
        }

        // Verificar si el número es un palíndromo
        if (a == numeroInvertido) {
            System.out.println("El número " + a + " es un palíndromo.");
        } else {
            System.out.println("El número " + a + " no es un palíndromo.");
        }

    }
}

