package ejercicios;

public class Ejercicio22 {
    public static void main(String[] args) {
        /*22. Conteo de dígitos de un número
        •	Descripción: Cuenta cuántos dígitos tiene el número a = 987654. El resultado sería 6 dígitos.
        •	Variables: a = 987654.
        */

        int a = 987654;

        // Variable para contar los dígitos
        int conteo = 0;

        // Copia del número original para procesar
        int numero = a;

        // Contamos los dígitos
        while (numero > 0) {
            numero /= 10;
            conteo++;
        }

        // Mostramos el resultado
        System.out.println("El número " + a + " tiene " + conteo + " dígitos.");

    }
}

