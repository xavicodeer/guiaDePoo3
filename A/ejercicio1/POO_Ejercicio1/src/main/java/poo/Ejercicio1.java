package poo;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = entrada.nextInt();

        Operaciones operacion1 = new Operaciones(numero1, numero2);
        operacion1.mostrarResultados();
    }
}
