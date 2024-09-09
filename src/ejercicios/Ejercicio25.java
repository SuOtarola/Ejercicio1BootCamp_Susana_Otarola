package ejercicios;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*25. Generar tabla de multiplicar
        •	Descripción: Genera la tabla de multiplicar del número a = 7.
        •	Variables: a = 7.
        */
        int a = 7;

        // Generamos la tabla de multiplicar
        System.out.println("Tabla de multiplicar de " + a + ":");
        for (int i = 1; i <= 10; i++) {
            // Calculamos el resultado de la multiplicación
            int resultado = a * i;

            // Imprimimos la multiplicación
            System.out.println(a + " x " + i + " = " + resultado);

        }

    }
}

