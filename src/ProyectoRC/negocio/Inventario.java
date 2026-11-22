package ProyectoRC.negocio;

import java.util.ArrayList;
import ProyectoRC.Producto;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public boolean agregarProducto(Producto producto) {
        if (producto == null) {
            System.out.println("Error: el producto no puede ser nulo.");
            return false;
        }
        if (buscarProducto(producto.getId()) != null) {
            System.out.println("Error: ya existe un producto con el ID " + producto.getId());
            return false;
        }
        productos.add(producto);
        System.out.println("Producto agregado correctamente al inventario.");
        return true;
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No existen productos registrados en TechBuild Solutions.");
            return;
        }

        for (Producto p : productos) {
            p.mostrarInformacion();
            System.out.println("------------------------------------");
        }
    }

    public Producto buscarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public double calcularValorTotalInventario() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularValorTotal();
        }
        return total;
    }
}
