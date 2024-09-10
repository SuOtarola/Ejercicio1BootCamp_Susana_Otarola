package ejercicios;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*27. Intercambio de valores
        •	Descripción: Intercambia los valores de a = 5 y b = 10 sin usar una tercera variable auxiliar.
        •	Variables: a = 5, b = 10.
        */
        int a = 5;  // Valor inicial de a
        int b = 10; // Valor inicial de b

        // Mostrar valores iniciales
        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Intercambio usando operaciones matemáticas
        a = a + b;  // a ahora es 15
        b = a - b;  // b ahora es 5
        a = a - b;  // a ahora es 10

        // Mostrar valores después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


}

