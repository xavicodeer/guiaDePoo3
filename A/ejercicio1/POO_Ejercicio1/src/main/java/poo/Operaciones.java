package poo;

/**
 *
 * @author xavicodeer
 */
public class Operaciones {
    
    private int numero1;
    private int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar() {
        if (numero1 > 0 && numero2 > 0) {
            return numero1 + numero2;
        }
        return 0;
    }

    public int restar() {
        if (numero1 >= numero2) {
            return numero1 - numero2;
        }
        return numero2 - numero1;
    }

    public int multiplicar() {
        return sumar() * restar();
    }

    public double dividir() {
        if (restar() != 0) {
            return (double) sumar() / restar();
        }
        return 0;
    }

    public void mostrarResultados() {
        System.out.println("Suma: " + sumar());
        System.out.println("Resta positiva: " + restar());
        System.out.println("Producto: " + multiplicar());

        if (restar() != 0) {
            System.out.println("Division: " + dividir());
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}
