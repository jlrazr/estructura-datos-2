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
                return provider.getAllMoviesNames();
            default:
                return null;
        }
    }
}



/*
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class MovieTableModel extends AbstractTableModel {
    private String[] columnNames = {"Providers", "Movies"};
    private List<Object[]> data;

    public MovieTableModel(ProviderStack providerStack) {
        populateData(providerStack);
    }

    private void populateData(ProviderStack providerStack) {
        data = new ArrayList<>();
        for (int i = 0; i < providerStack.size(); i++) {
            Provider provider = providerStack.getProviderAt(i);
            Movie[] movies = provider.getAllMovies();
            for (int j = 0; j < provider.getNumberOfMovies(); j++) {
                Object[] row = new Object[2];
                row[0] = j == 0 ? provider.getDescription() : "";
                row[1] = movies[j].getName();
                System.out.println(row[0]);
                System.out.println(row[1]);
                data.add(row);
            }
        }
    }

    public void refreshTableData(ProviderStack providerStack) {
        populateData(providerStack);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }
}
*/