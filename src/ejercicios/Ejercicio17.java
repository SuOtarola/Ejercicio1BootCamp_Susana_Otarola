package ejercicios;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*17. Suma de números pares en un rango
        •	Descripción: Suma todos los números pares entre a = 1 y b = 100. Un número es par si es divisible por 2.
        •	Variables: a = 1, b = 100.
        */
        int a = 1;
        int b = 100;

        // Variable para almacenar la suma de los números pares
        int suma = 0;

        // Iteramos sobre el rango de números
        for (int i = a; i <= b; i++) {
            // Comprobamos si el número es par
            if (i % 2 == 0) {
                // Sumamos el número par a la suma total
                suma += i;
            }
        }

        // Mostramos el resultado
        System.out.println("La suma de los números pares entre " + a + " y " + b + " es: " + suma);


    }
}

