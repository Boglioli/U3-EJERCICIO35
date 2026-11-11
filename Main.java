public class Main {
    public static void main(String[] args) {
        SillaErgonomica silla = new SillaErgonomica("Madera", "Negro", 10, true, true);
        ArchivoRodante archivo = new ArchivoRodante("Metal", "Gris", 20, 4, true);
        EscritorioModular escritorio = new EscritorioModular("Madera", "Blanco", 30, 2.5, 3);

        System.out.println("Datos de la silla ergonómica:");
        silla.mostrarDatos();
        System.out.println();

        System.out.println("Datos del archivo rodante:");
        archivo.mostrarDatos();
        System.out.println();

        System.out.println("Datos del escritorio modular:");
        escritorio.mostrarDatos();
    }
}
