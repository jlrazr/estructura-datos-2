public class Proveedor {
    private static int counter = 0;
    private final int id;
    private String description;
    private Pelicula[] movieList;
    private int head;
    private int tail;

    public Proveedor(String description) {
        this.id = ++counter;
        this.description = description;
        this.movieList = new Pelicula[1];
        this.head = -1;
        this.tail = -1;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pelicula[] getMovieList() {
        return movieList;
    }

    public void setMovieList(Pelicula[] movieList) {
        this.movieList = movieList;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}