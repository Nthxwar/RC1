package ProyectoRC.Interfaz;

import ProyectoRC.ComputadoraEscritorio;
import ProyectoRC.Laptop;
import ProyectoRC.Producto;
import ProyectoRC.negocio.Inventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("\n=== TECHBUILD SOLUTIONS - GESTIÓN DE INVENTARIO ===");
            System.out.println("1. Registrar Laptop");
            System.out.println("2. Registrar Computadora de Escritorio");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Buscar producto por ID");
            System.out.println("5. Vender producto");
            System.out.println("6. Ver valor total del inventario");
            System.out.println("7. Salir");

            opcion = Valida.leerEntero("Seleccione una opción");

            switch (opcion) {
                case 1:
                    int idLaptop = Valida.leerEntero("Ingrese ID");
                    String nombreLaptop = Valida.leerString("Ingrese nombre/modelo");
                    double precioLaptop = Valida.leerDouble("Ingrese precio");
                    int stockLaptop = Valida.leerEntero("Ingrese stock inicial");
                    double peso = Valida.leerDouble("Ingrese peso en kg");
                    String procLaptop = Valida.leerString("Ingrese procesador");

                    Producto laptop = new Laptop(idLaptop, nombreLaptop, precioLaptop, stockLaptop, peso, procLaptop);
                    inventario.agregarProducto(laptop);
                    break;

                case 2:
                    int idPc = Valida.leerEntero("Ingrese ID");
                    String nombrePc = Valida.leerString("Ingrese nombre/modelo");
                    double precioPc = Valida.leerDouble("Ingrese precio");
                    int stockPc = Valida.leerEntero("Ingrese stock inicial");
                    String gabinete = Valida.leerString("Ingrese tipo de gabinete");
                    String gpu = Valida.leerString("Ingrese tarjeta gráfica");

                    Producto pc = new ComputadoraEscritorio(idPc, nombrePc, precioPc, stockPc, gabinete, gpu);
                    inventario.agregarProducto(pc);
                    break;

                case 3:
                    System.out.println("\n--- INVENTARIO ACTUAL ---");
                    inventario.mostrarProductos();
                    break;

                case 4:
                    int idBuscar = Valida.leerEntero("Ingrese el ID a buscar");
                    Producto encontrado = inventario.buscarProducto(idBuscar);
                    if (encontrado != null) {
                        System.out.println("\n--- PRODUCTO ENCONTRADO ---");
                        encontrado.mostrarInformacion();
                    } else {
                        System.out.println("No se encontró un producto con ese ID.");
                    }
                    break;

                case 5:
                    int idVenta = Valida.leerEntero("Ingrese el ID del producto a vender");
                    Producto prodVenta = inventario.buscarProducto(idVenta);
                    if (prodVenta != null) {
                        int cantidad = Valida.leerEntero("Ingrese cantidad a vender");
                        prodVenta.vender(cantidad);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 6:
                    System.out.printf("Valor total del inventario: $%.2f%n", inventario.calcularValorTotalInventario());
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }
}
