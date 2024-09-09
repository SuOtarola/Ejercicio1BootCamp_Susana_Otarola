package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*12. Inversión de un número
        •	Descripción: Dado el número a = 54321, invierte el orden de sus dígitos. El resultado sería 12345.
        •	Variables: a = 54321.

        */
        int a = 54321;

        // Convertir el número a una cadena
        String numeroStr = Integer.toString(a);

        // Inicializar una cadena para el resultado invertido
        String numeroInvertidoStr = "";

        // Recorrer la cadena desde el final hacia el principio
        for (int i = numeroStr.length() - 1; i >= 0; i--) {
            numeroInvertidoStr += numeroStr.charAt(i);
        }

        // Convertir la cadena invertida a un número entero (opcional)
        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);

        // Imprimir el resultado
        System.out.println("El número " + a + " invertido es " + numeroInvertido + ".");


    }
}

