public class SillaErgonomica extends Mueble {
    private boolean ajusteAltura;
    private boolean soporteLumbar;
    public SillaErgonomica(String material, String color, double pesokg, boolean ajusteAltura, boolean soporteLumbar) {
        super(material, color, pesokg);
        this.ajusteAltura = ajusteAltura;
        this.soporteLumbar = soporteLumbar;
    }
    @Override
    public double calcularEnvio() {
        return super.calcularEnvio() + 2000;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ajuste de altura: " + ajusteAltura);
        System.out.println("soporte lumbar: " + soporteLumbar);
    }
}
