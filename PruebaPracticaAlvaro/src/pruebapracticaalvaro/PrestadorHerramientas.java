package pruebapracticaalvaro;


public class PrestadorHerramientas {
    // variables
    private final Herramienta herramientas[];
    private final boolean hayAlicates = true;
    private final boolean hayDestornillador = true;
    private final boolean hayTaladro = true;

    public PrestadorHerramientas(Herramienta[] herramientas) {
        this.herramientas = herramientas;
    }
        
    // Método para obtener herramientas
    public synchronized Herramienta solicitarActividad(String actividad) {
        Herramienta[] herramientasPrestadas = new Herramienta[2];
        if ("A1".equals(actividad)) {
            if (hayDestornillador && hayTaladro){
                herramientasPrestadas[herramientas[0].nombreHerramienta, herramientas[1].nombreHerramienta];
                return herramientas[0];
                return herramientas[1];
            }
            else {
                
            }
        }
        
        return herramientasPrestadas;
    }

    // Método para devolver los libros después de usarlos
    public synchronized void devolverHerramientas(Herramienta[] librosPrestados) {
        for (Libro libro : librosPrestados) {
            if (libro != null) {
                libro.setPrestado(false);
            }
        }
    }
}
