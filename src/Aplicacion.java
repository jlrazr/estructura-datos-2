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

    public int removerProveedor() {
        // Revisa si la pila está vacía
        if(top < 0) {
            return 0;
        }

        // Revisa si el proveedor tiene películas en su lista
        if(proveedores[top].getCabeza() != -1) {
            return 2;
        }

        proveedores[top--] = null; // Remueve el proveedor en el top de la pila
        return 1;
    }

    public int anadirPelicula(int IdProveedor, Pelicula pelicula) {
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
                return 1;
            }
        }

        // Proveedor no encontrado
        return 0;
    }

    public int removerPelicula(int idProveedor) {
        for(int i = 0; i <= top; i++) {
            if(proveedores[i].getId() == idProveedor) {
                // Revisa si la cola está vacía
                if(proveedores[i].getCabeza() == -1) {
                    System.out.println("No hay películas para remover");
                    return 0;
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

                return 1;
            }
        }

        // Proveedor no encontrado
        return 2;
    }
   
    public Proveedor[] getProveedores() {
        return proveedores;
    }
}
