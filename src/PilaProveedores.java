public class PilaProveedores {
    private Proveedor[] proveedores;
    private int cuentaProveedores;

    
    public PilaProveedores(int maxProveedores) {
        this.proveedores = new Proveedor[maxProveedores];
        this.cuentaProveedores = 0;
    }

    public void anadirProveedor(Proveedor proveedor) {
        if(cuentaProveedores < proveedores.length) {
            proveedores[cuentaProveedores++] = proveedor;
        } else {
            System.out.println("La pila de proveedores está llena.");
        }
    }

    public Proveedor removerProveedor() {
        if(cuentaProveedores > 0) {
            Proveedor primerProveedor = proveedores[--cuentaProveedores];
            if(primerProveedor.getNumeroPeliculas() > 0) {
                System.out.println("No se puede remover un proveedor con películas asociadas.");
                cuentaProveedores++;
                return null;
            }
            return primerProveedor;
        } else {
            System.out.println("No hay más proveedores para remover.");
            return null;
        }
    }
    
    public Proveedor[] getProveedores() {
        return proveedores;
    }
}