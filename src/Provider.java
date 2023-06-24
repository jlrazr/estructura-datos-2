public class Provider {
    private static int count = 1;
    private int ID;
    private String description;
    private Movie[] movies;
    private int movieIndex; // índice para el orden de las películas que se añaden

    public Provider(String description) {
        this.ID = count++;
        this.description = description;
        this.movies = new Movie[10]; // Número arbitrario. Se puede extender si es necesario.
        this.movieIndex = 0;
    }

    public void addMovie(Movie movie) {
        //if (movieIndex >= movies.length) {
            // Cambia el tamaño del arreglo
        //    Movie[] newArray = new Movie[movies.length * 2];
         //   for (int i = 0; i < movies.length; i++) {
        //        newArray[i] = movies[i];
        //    }
         //   movies = newArray;
        //}
        if (movieIndex >= movies.length) {
            System.out.println("Ha llegado al límite de películas. No se pueden añadir más películas.");
        } else if (movieIndex == 0) {
            movies[0] = movie;
            movieIndex++;
        } else {
            movies[movieIndex++] = movie;
        }
    }

    public Movie removeMovie() {
        if (movieIndex == 0) {
            return null; // No hay películas para remover
        }
        Movie movie = movies[0];
        // Empuja todas las películas hacia abajo en una posición
        for (int i = 0; i < movieIndex - 1; i++) {
            movies[i] = movies[i + 1];
        }
        movies[--movieIndex] = null;
        return movie;
    }

    public boolean hasMovies() {
        return movieIndex > 0;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Movie[] getAllMovies() {
        return movies;
    }
    
    public Movie getMovie(int id) {
        Movie match;
        
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getID() == id) {
                match = movies[i];
                return match;
            }            
        }
        
        return null;
    }
    
    public int getID() {
        return ID;
    }
}