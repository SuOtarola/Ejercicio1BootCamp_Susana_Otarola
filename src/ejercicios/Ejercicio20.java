package ejercicios;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*20. Número Armstrong
        •	Descripción: Determina si el número a = 153 es un número Armstrong. Un número Armstrong es igual a la suma de sus dígitos elevados a la potencia del número de dígitos. Para 153, sería
        •	Variables: a = 153.
        */

        int a = 153;

        // Guardamos el número original para comparar al final
        int numeroOriginal = a;

        // Contamos el número de dígitos
        int numDigitos = String.valueOf(a).length();

        // Variable para almacenar la suma de los dígitos elevados a la potencia del número de dígitos
        int suma = 0;

        // Calculamos la suma de los dígitos elevados a la potencia de numDigitos
        while (a > 0) {
            // Extraemos el último dígito
            int digito = a % 10;

            // Calculamos el dígito elevado a la potencia numDigitos y lo añadimos a la suma
            suma += Math.pow(digito, numDigitos);

            // Eliminamos el último dígito
            a /= 10;
        }

        // Verificamos si la suma es igual al número original
        if (suma == numeroOriginal) {
            System.out.println(numeroOriginal + " es un número Armstrong.");
        } else {
            System.out.println(numeroOriginal + " no es un número Armstrong.");
        }

    }
}

