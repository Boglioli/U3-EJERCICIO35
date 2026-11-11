public class ArchivoRodante extends Mueble {
    private int gavetas;
    private boolean sistemaSeguridad;
    public ArchivoRodante(String material, String color, double pesokg, int gavetas, boolean sistemaSeguridad) {
        super(material, color, pesokg);
        this.gavetas = gavetas;
        this.sistemaSeguridad = sistemaSeguridad;
    }
    @Override
    public double calcularEnvio() {
        return super.calcularEnvio() + 1000;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("gavetas: " + gavetas);
        System.out.println("sistema de seguridad: " + sistemaSeguridad);
    }
}
