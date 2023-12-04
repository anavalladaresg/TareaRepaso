import java.util.Scanner;

/**
 * Funciones utilizadas en la clase Main
 *
 * @author Ana Valladares
 * @version v1.0
 */
public class Garaxe {

    Scanner sc = new Scanner(System.in);
    Coche c = new Coche();

    private static int numeroCoches = 0;

    public static int getNumeroCoches() {
        return numeroCoches;
    }

    public static void setNumeroCoches(int numeroCoches) {
        Garaxe.numeroCoches = numeroCoches;
    }

    /**
     * Comprueba si hay plazas de garaje disponibles
     */
    public void comprobarPlazas() {
        if (numeroCoches >= 0 && numeroCoches < 5) {
            System.out.println("Plazas disponibles");
            numeroCoches++;
        } else {
            System.out.println("Completo");
        }
    }

    /**
     * Calcula la factura y el número de horas de los coches y los muestra
     */
    public void calcularPrezo() {
        System.out.print("Introduce la matrícula del coche: ");
        c.setMatricula(sc.nextLine());
        System.out.print("Introduce el tiempo (en horas) de estancia en el garaje: ");
        int hora = sc.nextInt();
        float precio;
        float total;
        if (hora < 3) {
            precio = 1.5F;
            total = precio * hora;
        } else {
            precio = 0.20F;
            total = 1.5F + (precio * (hora - 3));
        }

        System.out.println("Factura: " + total + "\nMatrícula: " + c.getMatricula()
                + "\nTempo: " + hora + "\nPrecio/h: " + precio);
        System.out.print("Introduce el dinero a pagar: ");
        float dinero = sc.nextFloat();
        float vuelta = dinero - total;
        System.out.println("Dinero recibido: " + dinero + "\nVuelta: " + vuelta +
                "\nGRACIAS POR USAR NUESTRO GARAJE");
    }
}
