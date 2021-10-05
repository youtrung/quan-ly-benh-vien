/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_Database;
import POJO.POJO_Database;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trung
 */
public class TableModelDatabase extends AbstractTableModel {
    ArrayList<POJO_Database> list;
    DAO_Database data=new DAO_Database();

    public TableModelDatabase() {
        list=data.getlistDatabase();
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_Database Data=list.get(rowIndex);
        switch(columnIndex)
        {
            case 0:return Data.getName();
            case 1:return Data.getDatabaserole();
            case 2:return Data.getControlfiletime();
            case 3:return Data.getCreated();
            default :return null;
        }
        
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Name";
            case 1: return "Role";
            case 2: return "Controlfiletime";
            case 3: return "Created";
            default :return null;
        }
    }
    
    
    
}
