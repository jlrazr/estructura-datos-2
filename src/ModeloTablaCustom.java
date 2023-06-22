import javax.swing.table.AbstractTableModel;

public class ModeloTablaCustom extends AbstractTableModel {
    private final String[] columnNames = {"Proveedor", "Pelicula"};
    private Object[] datos;

    public void setData(Proveedor[] datos) {
        this.datos = datos;
    }

     @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
     @Override
    public int getRowCount() {
        if (datos.length > 0) {
            return datos.length;
        } else {
            return 0;
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

     @Override
    public Object getValueAt(int fila, int col) {
        return datos[fila];
    }
}
