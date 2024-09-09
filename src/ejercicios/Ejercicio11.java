package ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        11. Fibonacci
        •	Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci, donde cada número es la suma de los dos anteriores. La secuencia comienza con 0 y 1.
        •	Variables: N = 10.

         */
        int N = 10;

        // Inicializar los primeros dos términos de la secuencia
        int num1 = 0, num2 = 1;

        // Imprimir los primeros dos términos
        System.out.print("Los primeros " + N + " números de la secuencia de Fibonacci son: ");

        // Imprimir el primer término
        System.out.print(num1 + " ");

        // Imprimir el segundo término
        if (N > 1) {
            System.out.print(num2 + " ");
        }

        // Calcular e imprimir los siguientes términos
        for (int i = 2; i < N; i++) {
            int siguiente = num1 + num2;
            System.out.print(siguiente + " ");
            num1 = num2;
            num2 = siguiente;
        }

        // Salto de línea al final de la salida
        System.out.println();


    }
}

