package pruebapracticaalvaro;

/*
Existen varias actividades de reparación que necesitan determinadas herramientas para
llevarse a cabo, a saber: un taladro, un destornillador y unos alicates.
    ● De estas herramientas solo hay una de cada tipo.
    ● La actividad A1 necesita un destornillador y un taladro.
    ● La actividad A2 necesita un destornillador y unos alicates.
    ● La actividad A3 necesita un taladro, un destornillador y unos alicates.
    ● Existen dos agentes que realizan la actividad A1, un agente que realiza la actividad
    A2 y un agente que realiza la actividad A3.
    ● Cada actividad tarda en realizarse un tiempo de entre 50 y 200 ms.
    ● Cada agente descansa después de realizar una actividad un tiempo de entre 100 y
    200 ms
*/

public class PruebaPracticaAlvaro {

    
    public static void main(String[] args) {
        
      
        // Crear las herramientas
        Herramienta herramientas[]= new Herramienta[3];
        herramientas[0] = new Herramienta("taladro");
        herramientas[1] = new Herramienta("destornillador");
        herramientas[2] = new Herramienta("alicates");

        
        final PrestadorHerramientas prestadorHerramientas = new PrestadorHerramientas(herramientas); 

        // Crear los agentes
        Thread agentes[] = new Thread[4];
        
        agentes[0] = new Thread(new Agente("1", herramientas, prestadorHerramientas, "A1"));
        agentes[1] = new Thread(new Agente("2", herramientas, prestadorHerramientas, "A1"));
        agentes[2] = new Thread(new Agente("3", herramientas, prestadorHerramientas, "A2"));
        agentes[3] = new Thread(new Agente("4", herramientas, prestadorHerramientas, "A3"));
       
        
        
        agentes[0].start();
        agentes[1].start();
        agentes[2].start();
        agentes[3].start();
        
        
        for (Thread agente : agentes) {
            try {
                agente.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        
    }
    
}
