package ejercicios;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*21. Raíz cuadrada sin usar librerías
        •	Descripción: Calcula la raíz cuadrada del número a = 49 sin usar funciones predefinidas. La raíz cuadrada de 49 es 7.
        •  	Variables: a = 49.

        */

        double a = 49;

        // Estimación inicial para la raíz cuadrada
        double estimacion = a;

        // Tolerancia para la precisión
        double tolerancia = 0.00001;

        // Variable para almacenar la diferencia entre estimaciones
        double diferencia;

        // Iteramos hasta que la estimación converja a la raíz cuadrada
        do {
            // Calculamos una nueva estimación
            double nuevaEstimacion = 0.5 * (estimacion + a / estimacion);

            // Calculamos la diferencia entre la nueva y la antigua estimación
            diferencia = Math.abs(nuevaEstimacion - estimacion);

            // Actualizamos la estimación
            estimacion = nuevaEstimacion;
        } while (diferencia > tolerancia);

        // Mostramos el resultado
        System.out.printf("La raíz cuadrada de %.2f es aproximadamente: %.5f%n", a, estimacion);


    }
}

