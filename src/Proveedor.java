public class Proveedor {
    private static int contador = 0;
    private final int id;
    private String descripcion;
    private Pelicula[] listaPeliculas;
    private int cabeza;
    private int cola;

    public Proveedor(String descripcion) {
        this.id = ++contador;
        this.descripcion = descripcion;
        this.listaPeliculas = new Pelicula[1];
        this.cabeza = -1;
        this.cola = -1;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String description) {
        this.descripcion = description;
    }

    public Pelicula[] getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(Pelicula[] movieList) {
        this.listaPeliculas = movieList;
    }

    public int getCabeza() {
        return cabeza;
    }

    public void setCabeza(int cabeza) {
        this.cabeza = cabeza;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}