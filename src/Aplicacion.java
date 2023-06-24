public class Aplicacion {
    private Proveedor[] proveedores;
    private int top;

    public Aplicacion() {
        this.proveedores = new Proveedor[1];  // tamaño inicial de 1
        this.top = -1;
    }

    public void anadirProveedor(Proveedor proveedor) {
        // Si la cola está llena, incrementa su tamaño máximo
        if(top == proveedores.length - 1) {
            Proveedor[] nuevoArray = new Proveedor[proveedores.length * 2];
            System.arraycopy(proveedores, 0, nuevoArray, 0, proveedores.length);
            proveedores = nuevoArray;
        }
        proveedores[++top] = proveedor; // Añade el nuevo proveedor
    }

    public void removerProveedor() {
        // Revisa si la pila está vacía
        if(top < 0) {
            System.out.println("No hay proveedores para remover");
            return;
        }

        // Revisa si el proveedor tiene películas en su lista
        if(proveedores[top].getCabeza() != -1) {
            System.out.println("Debe remover todas las películas del proveedor antes de eliminarlo");
            return;
        }

        proveedores[top--] = null; // Remueve el proveedor en el top de la pila
    }

    public void anadirPelicula(int IdProveedor, Pelicula pelicula) {
        for(int i = 0; i <= top; i++) {
            if(proveedores[i].getId() == IdProveedor) {
                // Revisa si la cola está llena e incrementa su tamaño de ser el caso
                if(proveedores[i].getCola() == proveedores[i].getListaPeliculas().length - 1) {
                    Pelicula[] nuevoArray = new Pelicula[proveedores[i].getListaPeliculas().length * 2];
                    System.arraycopy(proveedores[i].getListaPeliculas(), 0, nuevoArray, 0, proveedores[i].getListaPeliculas().length);
                    proveedores[i].setListaPeliculas(nuevoArray);
                }

                // Incrementa la cola
                proveedores[i].setCola(proveedores[i].getCola() + 1);

                // Añade la película
                proveedores[i].getListaPeliculas()[proveedores[i].getCola()] = pelicula;

                // Actualiza la cabeza si fue el primer elemento que se añadió
                if(proveedores[i].getCabeza() == -1) {
                    proveedores[i].setCabeza(0);
                }
                return;
            }
        }

        System.out.println("Proveedor no encontrado");
    }

    public void removerPelicula(int idProveedor) {
        for(int i = 0; i <= top; i++) {
            if(proveedores[i].getId() == idProveedor) {
                // Revisa si la cola está vacía
                if(proveedores[i].getCabeza() == -1) {
                    System.out.println("No hay películas para remover");
                    return;
                }

                proveedores[i].getListaPeliculas()[proveedores[i].getCabeza()] = null; // Remueve la película en la posición "cabeza" o top

                // Actualiza la posición "cabeza"
                if(proveedores[i].getCabeza() == proveedores[i].getCola()) {
                    // Si fue el último elemento, reinicia la cabeza y la cola
                    proveedores[i].setCabeza(-1);
                    proveedores[i].setCola(-1);
                } else {
                    proveedores[i].setCabeza(proveedores[i].getCabeza() + 1);
                }
                return;
            }
        }

        System.out.println("Proveedor no encontrado");
    }
    
    public void imprimirProveedores() {
        if(top < 0) {
            System.out.println("No hay proveedores registrados");
            return;
        }
        for(int i = 0; i <= top; i++) {
            System.out.println(proveedores[i]);
        }
    }

    public void imprimirPeliculasDelProveedor(int idProveedor) {
        for(int i = 0; i <= top; i++) {
            if(proveedores[i].getId() == idProveedor) {
                if(proveedores[i].getCabeza() == -1) {
                    System.out.println("El proveedor no tiene películas registradas");
                    return;
                }
                for(int j = proveedores[i].getCabeza(); j <= proveedores[i].getCola(); j++) {
                    System.out.println(proveedores[i].getListaPeliculas()[j]);
                }
                return;
            }
        }
        System.out.println("Proveedor no encontrado");
    }
}