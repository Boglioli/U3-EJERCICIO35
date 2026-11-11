public class EscritorioModular extends Mueble {
    private double superficie;
    private int cajoneras;
    public EscritorioModular(String material, String color, double pesokg, double superficie, int cajoneras) {
        super(material, color, pesokg);
        this.superficie = superficie;
        this.cajoneras = cajoneras;
    }
    @Override
    public double calcularEnvio() {
        return super.calcularEnvio() + 1500;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("superficie: " + superficie + " m2");
        System.out.println("cajoneras: " + cajoneras);
    }
}
