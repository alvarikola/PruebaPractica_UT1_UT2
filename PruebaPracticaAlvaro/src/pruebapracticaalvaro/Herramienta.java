package pruebapracticaalvaro;


public class Herramienta {
    String nombreHerramienta;
    boolean prestado;

    public Herramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }


    synchronized public boolean isPrestado() {
        return prestado;
    }
    
    public synchronized void setPrestado(boolean prestado) {
        this.prestado = prestado;
        
    }
}
