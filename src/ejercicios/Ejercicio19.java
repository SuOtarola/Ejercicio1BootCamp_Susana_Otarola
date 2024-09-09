package ejercicios;

public class Ejercicio19 {
    public static void main(String[] args) {
        /*19. Números perfectos
        •	Descripción: Determina si el número a = 28 es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores (excluyendo el número mismo) es igual al número.
        •	Variables: a = 28.
        */

        int a = 28;

        // Variable para almacenar la suma de los divisores propios
        int sumaDivisores = 0;

        // Encontramos los divisores propios del número
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificamos si la suma de los divisores es igual al número
        if (sumaDivisores == a) {
            System.out.println(a + " es un número perfecto.");
        } else {
            System.out.println(a + " no es un número perfecto.");
        }

    }
}

