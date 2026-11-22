package ProyectoRC;

public class Laptop extends Producto{
    private double pesoKg;
    private String procesador;

    public Laptop(int id, String nombre, double precio, int stock, double pesoKg, String procesador) {
        super(id, nombre, precio, stock);
        this.pesoKg = pesoKg;
        this.procesador = procesador;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getProcesador() {
        return procesador;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Tipo: Laptop Ensamblada]");
        super.mostrarInformacion();
        System.out.println("Procesador: " + procesador);
        System.out.println("Peso: " + pesoKg + " kg");
    }
}
