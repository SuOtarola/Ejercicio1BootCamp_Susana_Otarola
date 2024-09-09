package ejercicios;

public class Ejercicio18 {
    public static void main(String[] args) {
        /*18. Calcular potencia
        •	Descripción: Dado el número a = 2 y la potencia b = 8, calcula , es decir, 2 elevado a la potencia de 8.
        •	Variables: a = 2, b = 8.
        */
        int a = 2;
        int b = 8;

        // Variable para almacenar el resultado
        int resultado = 1;

        // Calculamos la potencia usando un bucle
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }

        // Mostramos el resultado
        System.out.println(a + " elevado a la potencia de " + b + " es: " + resultado);
    }


}

