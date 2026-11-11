package poo;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private double sueldo;
    private char categoria;

    public void solicitarDatos(Scanner entrada) {
        System.out.print("Nombre del empleado: ");
        nombre = entrada.nextLine();

        System.out.print("Sueldo actual: $");
        sueldo = entrada.nextDouble();

        System.out.print("Categoria (A, B o C): ");
        categoria = entrada.next().toUpperCase().charAt(0);

        entrada.nextLine();
    }

    public double calcularNuevoSueldo() {
        double nuevoSueldo;

        switch (categoria) {
            case 'A':
                nuevoSueldo = sueldo + sueldo * 0.10;
                break;
            case 'B':
                nuevoSueldo = sueldo + sueldo * 0.20;
                break;
            case 'C':
                nuevoSueldo = sueldo + sueldo * 0.30;
                break;
            default:
                nuevoSueldo = sueldo;
                break;
        }

        return nuevoSueldo;
    }

    public String getNombre() {
        return nombre;
    }
}
