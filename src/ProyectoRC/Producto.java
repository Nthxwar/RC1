package ProyectoRC;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta registrada en TechBuild Solutions.");
            return true;
        } else {
            System.out.println("Stock insuficiente o cantidad inválida.");
            return false;
        }
    }

    public double calcularValorTotal() {
        return precio * stock;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre/Modelo: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Stock disponible: " + stock);
        System.out.println("Valor en inventario: $" + calcularValorTotal());
    }
}
