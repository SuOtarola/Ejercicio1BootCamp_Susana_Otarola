package ejercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*14. Conversión de decimal a binario
        •	Descripción: Dado el número decimal a = 45, conviértelo a binario.
        •	Variables: a = 45.
        */

        int a = 45;

        // Variable para almacenar el número binario
        String binario = "";

        // Convertir el número decimal a binario manualmente
        int numero = a;
        while (numero > 0) {
            // Obtener el residuo de la división por 2
            int residuo = numero % 2;
            // Prepend el residuo a la cadena binaria
            binario = residuo + binario;
            // Dividir el número entre 2
            numero = numero / 2;
        }

        // Si el número es 0, el binario es "0"
        if (binario.isEmpty()) {
            binario = "0";
        }

        // Imprimir el resultado
        System.out.println("El número decimal " + a + " en binario es " + binario + ".");

    }
}

