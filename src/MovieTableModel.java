import javax.swing.table.AbstractTableModel;

public class MovieTableModel extends AbstractTableModel {
    private String[] columnNames = {"Proveedores", "Películas"};
    private ProviderStack providerStack;

    public MovieTableModel(ProviderStack providerStack) {
        this.providerStack = providerStack;
    }

    public void refreshTableData() {
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return providerStack.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Provider provider = providerStack.getProviderAt(rowIndex);

        switch (columnIndex) {
            case 0: // Columna de proveedores
                return provider.getDescription();
            case 1: // Columna de películas
                return provider.getAllMovies().toString();
            default:
                return null;
        }
    }
}