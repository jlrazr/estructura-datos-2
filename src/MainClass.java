import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Aplicacion application = new Aplicacion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------- Menu Principal ----------------");
            System.out.println("1. Register Provider");
            System.out.println("2. Register a Movie for a Provider");
            System.out.println("3. Delete a Provider");
            System.out.println("4. Delete a Movie from a Provider");
            System.out.println("5. See All Providers Registered");
            System.out.println("6. See Movies by Provider");
            System.out.println("7. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Provider description: ");
                    String providerDescription = scanner.next();
                    Proveedor provider = new Proveedor(providerDescription);
                    application.addProvider(provider);
                    System.out.println("Provider Registered Successfully.");
                    break;
                case 2:
                    System.out.println("Enter Provider id: ");
                    int providerId = scanner.nextInt();
                    System.out.println("Enter Movie name: ");
                    String movieName = scanner.next();
                    System.out.println("Enter Movie category: ");
                    String movieCategory = scanner.next();
                    System.out.println("Enter Movie audience: ");
                    String movieAudience = scanner.next();
                    System.out.println("Enter Movie format: ");
                    String movieFormat = scanner.next();
                    Pelicula movie = new Pelicula(movieName, movieCategory, movieAudience, movieFormat);
                    application.addMovieToProvider(providerId, movie);
                    System.out.println("Movie Registered Successfully.");
                    break;
                case 3:
                    application.removeProvider();
                    System.out.println("Provider Deleted Successfully.");
                    break;
                case 4:
                    System.out.println("Enter Provider id: ");
                    int providerIdToDeleteMovie = scanner.nextInt();
                    application.removeMovieFromProvider(providerIdToDeleteMovie);
                    System.out.println("Movie Deleted Successfully.");
                    break;
                case 5:
                    application.printAllProviders();
                    break;
                case 6:
                    System.out.println("Enter Provider id: ");
                    int providerIdToPrintMovies = scanner.nextInt();
                    application.printMoviesByProvider(providerIdToPrintMovies);
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }
    }
}
