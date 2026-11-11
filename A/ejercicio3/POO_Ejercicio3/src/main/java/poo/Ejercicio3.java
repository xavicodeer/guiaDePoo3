package poo;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 15; i++) {
            System.out.println("\n--- EMPLEADO " + i + " ---");

            Empleado empleado = new Empleado();
            empleado.solicitarDatos(entrada);

            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Nuevo sueldo: $" + empleado.calcularNuevoSueldo());
        }
    }
}