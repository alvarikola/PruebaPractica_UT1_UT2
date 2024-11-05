package pruebapracticaalvaro;


public class Agente implements Runnable{
    private final String idAgente;
    private final Herramienta herramientas[];
    private final PrestadorHerramientas prestadorHerramientas;
    private final String actividad;

    public Agente(String idAgente, Herramienta[] herramientas, PrestadorHerramientas prestadorHerramientas, String actividad) {
        this.idAgente = idAgente;
        this.herramientas = herramientas;
        this.prestadorHerramientas = prestadorHerramientas;
        this.actividad = actividad;
    }

    public String getIdAgente() {
        return idAgente;
    }

    public Herramienta[] getHerramientas() {
        return herramientas;
    }

    public PrestadorHerramientas getPrestadorHerramientas() {
        return prestadorHerramientas;
    }

    public String getActividad() {
        return actividad;
    }

    
    
    // Método run
    @Override
    public void run() {
        
       // Solicitar herramientas
       System.out.printf("EL Agente %s realiza la actividad %s. Necesita %s y %s .\n",
                idAgente, actividad, herramientas);
       
        // Usar herramienta
        prestadorHerramientas.solicitarActividad(actividad);
        System.out.printf(">>> Agente %s inicia actividad %s. Utiliza %s.\n",
                idAgente, actividad, herramientas);
        
        // Devolover herramientas
        prestadorHerramientas.devolverHerramientas(herramientas);
        System.out.printf("<<< Agente %s finaliza actividad %s. Devuelve %s.\n",
            idAgente, actividad, herramientas);
        
   }
}
