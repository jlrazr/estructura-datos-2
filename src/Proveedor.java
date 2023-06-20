public class Proveedor {
    private static int contador = 0;
    private final int id;
    private String descripcion;
    private Pelicula[] peliculas;
    private int numeroPeliculas;

    //Método constructor
    public Proveedor(String descripcion, int maxPeliculas) {
        this.id = ++contador;
        this.descripcion = descripcion;
        this.peliculas = new Pelicula[maxPeliculas];
        this.numeroPeliculas = 0;
    }

    public void anadirPelicula(Pelicula pelicula) {
        if(numeroPeliculas < peliculas.length) {
            peliculas[numeroPeliculas++] = pelicula;
        } else {
            System.out.println("La cola de películas está llena!");
        }
    }

    public Pelicula removerPelicula() {
        if(numeroPeliculas > 0) {
            Pelicula primeraPelicula = peliculas[0];
            System.arraycopy(peliculas, 1, peliculas, 0, --numeroPeliculas);
            return primeraPelicula;
        } else {
            System.out.println("No hay películas para remover");
            return null;
        }
    }

    // getters
    // setters
}