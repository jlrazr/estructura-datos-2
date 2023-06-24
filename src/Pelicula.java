public class Pelicula {
    private static int counter = 0;
    private final int id;
    private String name;
    private String category;
    private String audience;
    private String format;

    public Pelicula(String name, String category, String audience, String format) {
        this.id = ++counter;
        this.name = name;
        this.category = category;
        this.audience = audience;
        this.format = format;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", audience='" + audience + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}