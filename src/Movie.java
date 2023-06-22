public class Movie {
    private static int count = 0;
    private int ID;
    private String name;
    private String category;
    private String audience;
    private String format;

    public Movie(String name, String category, String audience, String format) {
        this.ID = count++;
        this.name = name;
        this.category = category;
        this.audience = audience;
        this.format = format;
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
}