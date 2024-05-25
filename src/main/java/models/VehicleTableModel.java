package models;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class VehicleTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Referencia", "Marca", "Código", "Código homologación", "Clase", "Precio", "Cilindraje", "Nacionalidad"};
    private final ArrayList<Vehicle> vehicleList;

    public VehicleTableModel(ArrayList<Vehicle> vehicles) {
        this.vehicleList = vehicles;
    }

    public Vehicle getVehicule(int row){
        Vehicle vehiculo = vehicleList.get(row);
        return vehiculo;
    }
    
    @Override
    public int getRowCount() {
        return vehicleList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vehicle vehicle = vehicleList.get(rowIndex);
        switch (columnIndex) {
            case 0: return vehicle.getReference();
            case 1: return vehicle.getBrand();
            case 2: return vehicle.getCode();
            case 3: return vehicle.getHomologationCode();
            case 4: return vehicle.getVehicleClass();
            case 5: return vehicle.getPrice();
            case 6: return vehicle.getCylinderCapacity();
            case 7: return vehicle.getNationality();
            default: return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 5:
            case 6:
                return Integer.class;
            default:
                return String.class;
        }
    }
}