public class Pelicula {
    private static int contador = 0;
    private final int id;
    private String nombre;
    private String categoria;
    private String audiencia;
    private String formato;

    // Método Constructor
    public Pelicula(String nombre, String categoria, String audiencia, String formato) {
        this.id = ++contador;
        this.nombre = nombre;
        this.categoria = categoria;
        this.audiencia = audiencia;
        this.formato = formato;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAudiencia() {
        return audiencia;
    }

    public String getFormato() {
        return formato;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String  categoria) {
        this.categoria = categoria;
    }

    public void setAudiencia(String audiencia) {
        this.audiencia = audiencia;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
