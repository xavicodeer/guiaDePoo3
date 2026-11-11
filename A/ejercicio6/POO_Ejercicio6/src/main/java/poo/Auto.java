package poo;

/**
 *
 * @author xavicodeer
 */

public class Auto {

    private double distancia;
    private double tiempo;

    public Auto(double distancia, double tiempo) {
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public double calcularVelocidad() {
        if (tiempo != 0) {
            return distancia / tiempo;
        }
        return 0;
    }
}