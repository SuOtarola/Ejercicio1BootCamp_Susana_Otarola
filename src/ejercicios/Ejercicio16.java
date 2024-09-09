package ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*16. Sumar dígitos de un número
        •	Descripción: Dado el número a = 5678, suma todos sus dígitos. El resultado sería 5 + 6 + 7 + 8 = 26.
        •	Variables: a = 5678.
         */
        int a = 5678;
        // Variable para almacenar la suma de los dígitos
        int suma = 0;

        // Variable temporal para almacenar el número mientras lo procesamos
        int numero = a;

        // Mientras el número sea mayor que 0
        while (numero > 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Sumar el dígito a la suma total
            suma += digito;

            // Eliminar el último dígito del número
            numero /= 10;
        }

        // Mostrar el resultado
        System.out.println("La suma de los dígitos de " + a + " es: " + suma);


    }
}

