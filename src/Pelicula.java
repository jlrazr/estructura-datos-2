public class Pelicula {
    private static int contador = 0;
    private final int id;
    private String nombre;
    private String categoria;
    private String audiencia;
    private String formato;

    public Pelicula(String nombre, String categoria, String audiencia, String formato) {
        this.id = ++contador;
        this.nombre = nombre;
        this.categoria = categoria;
        this.audiencia = audiencia;
        this.formato = formato;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(String audiencia) {
        this.audiencia = audiencia;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", audiencia='" + audiencia + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}