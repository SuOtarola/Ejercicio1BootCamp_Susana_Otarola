package ejercicios;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*24. Sumar los múltiplos de un número en un rango
        •	Descripción: Suma todos los múltiplos de a = 3 dentro del rango de 1 a 50. Un múltiplo de un número es el resultado de multiplicarlo por un entero.
        •	Variables: a = 3, rango de 1 a 50.
        */

        int a = 3;

        // Definimos el rango
        int inicio = 1;
        int fin = 50;

        // Variable para almacenar la suma de los múltiplos
        int suma = 0;

        // Iteramos sobre el rango
        for (int i = inicio; i <= fin; i++) {
            // Comprobamos si el número es un múltiplo de a
            if (i % a == 0) {
                // Sumamos el múltiplo a la suma total
                suma += i;
            }
        }

        // Mostramos el resultado
        System.out.println("La suma de los múltiplos de " + a + " en el rango de " + inicio + " a " + fin + " es: " + suma);

    }
}

