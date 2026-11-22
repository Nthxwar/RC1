package ProyectoRC;

public class ComputadoraEscritorio extends Producto {
    private String tipoGabinete;
    private String tarjetaGrafica;

    public ComputadoraEscritorio(int id, String nombre, double precio, int stock,
                                 String tipoGabinete, String tarjetaGrafica) {
        super(id, nombre, precio, stock);
        this.tipoGabinete = tipoGabinete;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Tipo: PC de Escritorio]");
        super.mostrarInformacion();
        System.out.println("Tipo de Gabinete: " + tipoGabinete);
        System.out.println("Tarjeta Gráfica: " + tarjetaGrafica);
    }
}
