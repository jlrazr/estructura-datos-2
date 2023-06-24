import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------- Menu Principal ----------------");
            System.out.println("1. Registrar Proveedor");
            System.out.println("2. Registrar Película para un Proveedor");
            System.out.println("3. Eliminar Proveedor");
            System.out.println("4. Eliminar Película de un Proveedor");
            System.out.println("5. Ver todos los Proveedores");
            System.out.println("6. Ver Películas de un Proveedor");
            System.out.println("7. Salir");

            int seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Ingrese la descripcióm del proveedor: ");
                    String descripcion = scanner.next();
                    Proveedor proveedor = new Proveedor(descripcion);
                    aplicacion.anadirProveedor(proveedor);
                    System.out.println("Proveedor registrado con éxito");
                    break;
                case 2:
                    System.out.println("Ingrese el ID del proveedor: ");
                    int idProveedor = scanner.nextInt();
                    System.out.println("Ingrese el nombre de la película: ");
                    String nombre = scanner.next();
                    System.out.println("Ingrese la categoría: ");
                    String categoria = scanner.next();
                    System.out.println("Ingrese la audiencia: ");
                    String audiencia = scanner.next();
                    System.out.println("Ingrese el formato: ");
                    String formato = scanner.next();
                    Pelicula movie = new Pelicula(nombre, categoria, audiencia, formato);
                    aplicacion.anadirPelicula(idProveedor, movie);
                    System.out.println("Película registrada con éxito.");
                    break;
                case 3:
                    aplicacion.removerProveedor();
                    System.out.println("Proveedor borrado con éxito.");
                    break;
                case 4:
                    System.out.println("Ingrese el ID del Proveedor: ");
                    int id = scanner.nextInt();
                    aplicacion.removerPelicula(id);
                    System.out.println("Película eliminada con éxito.");
                    break;
                case 5:
                    aplicacion.imprimirProveedores();
                    break;
                case 6:
                    System.out.println("Enter Provider id: ");
                    int providerIdToPrintMovies = scanner.nextInt();
                    aplicacion.imprimirPeliculasDelProveedor(providerIdToPrintMovies);
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Selección inválida. Elija una opción válida.");
                    break;
            }
        }
    }
}
