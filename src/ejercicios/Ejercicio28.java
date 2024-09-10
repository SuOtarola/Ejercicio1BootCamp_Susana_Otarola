package ejercicios;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*28. Calcular el máximo común divisor (MCD)
        •	Descripción: Dados los números a = 48 y b = 18, calcula su MCD (máximo común divisor). El MCD es el número más grande que divide exactamente a ambos números.
        •	Variables: a = 48, b = 18.
        */
        int a = 48; // Primer número
        int b = 18; // Segundo número

        // Llamada al método que calcula el MCD
        int mcd = calcularMCD(a, b);

        // Mostrar el resultado
        System.out.println("El MCD de " + a + " y " + b + " es " + mcd);
    }

    // Método para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        // Mientras el residuo no sea 0
        while (b != 0) {
            int residuo = a % b;
            a = b;
            b = residuo;
        }
        // El valor final de 'a' es el MCD
        return a;


    }
}

