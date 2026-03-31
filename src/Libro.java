public class Libro extends Material {

    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Páginas: " + paginas);
    }
}