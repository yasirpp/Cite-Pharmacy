
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yaser
 */
public class MyTableModel extends AbstractTableModel {

    public List<String> columnNames = new ArrayList();
    public List<List> data = new ArrayList();

    {
        columnNames.add("Sl No");
        columnNames.add("Product");
        columnNames.add("Batch no");
        columnNames.add("Expiry");
        columnNames.add("Quantity");
        columnNames.add("Price");
        columnNames.add("Offer");
        columnNames.add("Tax");
        columnNames.add("Total");
    }
    
    

    public void addRow(List rowData) {
        data.add(rowData);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    public int getColumnCount() {
        return columnNames.size();
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        try {
            return columnNames.get(col);
        } catch (Exception e) {
            return null;
        }
    }

    public Object getValueAt(int row, int col) {
        return data.get(row).get(col);
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
