package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*5. Máximo de tres números
        •	Descripción: Dados los números a = 5, b = 12 y c = 9, encuentra cuál de ellos es el mayor.
        •	Variables: a = 5, b = 12, c = 9.

        */
        int a = 5;
        int b = 12;
        int c = 9;

        int mayor = a; // Suponemos inicialmente que 'a' es el mayor

        // Comparar 'mayor' con 'b'
        if (b > mayor) {
            mayor = b;
        }

        // Comparar 'mayor' con 'c'
        if (c > mayor) {
            mayor = c;
        }

        // Imprimir el resultado
        System.out.println("El número máximo entre " + a + ", " + b + " y " + c + " es " + mayor + ".");

    }
}

