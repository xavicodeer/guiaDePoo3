package poo;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- AUTO 1 ---");
        System.out.print("Ingrese distancia recorrida: ");
        double distancia1 = entrada.nextDouble();

        System.out.print("Ingrese tiempo empleado: ");
        double tiempo1 = entrada.nextDouble();

        Auto auto1 = new Auto(distancia1, tiempo1);

        System.out.println("\n--- AUTO 2 ---");
        System.out.print("Ingrese distancia recorrida: ");
        double distancia2 = entrada.nextDouble();

        System.out.print("Ingrese tiempo empleado: ");
        double tiempo2 = entrada.nextDouble();

        Auto auto2 = new Auto(distancia2, tiempo2);

        System.out.println("\nVelocidad del auto 1: "
                + auto1.calcularVelocidad());

        System.out.println("Velocidad del auto 2: "
                + auto2.calcularVelocidad());
    }
}