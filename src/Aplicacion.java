public class Aplicacion {
    private Proveedor[] proveedores;
    private int top;

    public Aplicacion() {
        this.proveedores = new Proveedor[1];  // initially size 1
        this.top = -1;
    }

    public void addProvider(Proveedor provider) {
        // Check if the stack is full. If full, increase the size.
        if(top == proveedores.length - 1) {
            Proveedor[] newArray = new Proveedor[proveedores.length * 2];
            System.arraycopy(proveedores, 0, newArray, 0, proveedores.length);
            proveedores = newArray;
        }
        proveedores[++top] = provider; // Add the new provider
    }

    public void removeProvider() {
        // Check if the stack is empty
        if(top < 0) {
            System.out.println("No providers available to remove");
            return;
        }

        // Check if the provider has any movies
        if(proveedores[top].getHead() != -1) {
            System.out.println("All movies must be removed from this provider before removing the provider");
            return;
        }

        proveedores[top--] = null; // Remove the top provider
    }

    public void addMovieToProvider(int providerId, Pelicula movie) {
        for(int i = 0; i <= top; i++) {
            if(proveedores[i].getId() == providerId) {
                // Check if the queue is full. If full, increase the size.
                if(proveedores[i].getTail() == proveedores[i].getMovieList().length - 1) {
                    Pelicula[] newArray = new Pelicula[proveedores[i].getMovieList().length * 2];
                    System.arraycopy(proveedores[i].getMovieList(), 0, newArray, 0, proveedores[i].getMovieList().length);
                    proveedores[i].setMovieList(newArray);
                }

                // Increment the tail
                proveedores[i].setTail(proveedores[i].getTail() + 1);

                // Add the new movie
                proveedores[i].getMovieList()[proveedores[i].getTail()] = movie;

                // If it was the first element added, update the head.
                if(proveedores[i].getHead() == -1) {
                    proveedores[i].setHead(0);
                }
                return;
            }
        }

        System.out.println("Provider not found");
    }

    public void removeMovieFromProvider(int providerId) {
        for(int i = 0; i <= top; i++) {
            if(proveedores[i].getId() == providerId) {
                // Check if the queue is empty
                if(proveedores[i].getHead() == -1) {
                    System.out.println("No movies available to remove");
                    return;
                }

                proveedores[i].getMovieList()[proveedores[i].getHead()] = null; // Remove the head movie

                // Update the head
                if(proveedores[i].getHead() == proveedores[i].getTail()) {
                    // If it was the last element, reset the head and tail
                    proveedores[i].setHead(-1);
                    proveedores[i].setTail(-1);
                } else {
                    proveedores[i].setHead(proveedores[i].getHead() + 1);
                }
                return;
            }
        }

        System.out.println("Provider not found");
    }
    
    public void printAllProviders() {
        if(top < 0) {
            System.out.println("No providers registered yet.");
            return;
        }
        for(int i = 0; i <= top; i++) {
            System.out.println(proveedores[i]);
        }
    }

    public void printMoviesByProvider(int providerId) {
        for(int i = 0; i <= top; i++) {
            if(proveedores[i].getId() == providerId) {
                if(proveedores[i].getHead() == -1) {
                    System.out.println("No movies registered for this provider.");
                    return;
                }
                for(int j = proveedores[i].getHead(); j <= proveedores[i].getTail(); j++) {
                    System.out.println(proveedores[i].getMovieList()[j]);
                }
                return;
            }
        }
        System.out.println("Provider not found");
    }
}
