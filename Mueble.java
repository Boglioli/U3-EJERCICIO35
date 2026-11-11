public class Mueble {
    private String material;
    private String color;
    private double pesokg;
    public Mueble(String material, String color, double pesokg) {
        this.material = material;
        this.color = color;
        this.pesokg = pesokg;
    }
       public double calcularEnvio() {
        return pesokg * 500;
       }
       public void mostrarDatos() {
        System.out.println("material: " + material);
        System.out.println("color: " + color);
        System.out.println("peso kg: " + pesokg);
        System.out.println("costo de envío: " + calcularEnvio());
       }
}
