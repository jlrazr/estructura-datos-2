public class Provider {
    private static int count = 1;
    private int ID;
    private String description;
    private Movie[] movies;
    private int movieIndex; // keep track of where to add the next movie

    public Provider(String description) {
        this.ID = count++;
        this.description = description;
        this.movies = new Movie[10]; // start with a small size and expand as necessary
        this.movieIndex = 0;
    }

    public void addMovie(Movie movie) {
        if (movieIndex >= movies.length) {
            // resize the array
            Movie[] newArray = new Movie[movies.length * 2];
            for (int i = 0; i < movies.length; i++) {
                newArray[i] = movies[i];
            }
            movies = newArray;
        }
        movies[movieIndex++] = movie;
    }

    public Movie removeMovie() {
        if (movieIndex == 0) {
            return null; // no movies to remove
        }
        Movie movie = movies[0];
        // shift all movies down by one
        for (int i = 0; i < movieIndex - 1; i++) {
            movies[i] = movies[i + 1];
        }
        movies[--movieIndex] = null;
        return movie;
    }

    // getters and setters omitted for brevity
    public boolean hasMovies() {
        return movieIndex > 0;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Movie[] getAllMovies() {
        return movies;
    }
    
    public int getID() {
        return ID;
    }
}