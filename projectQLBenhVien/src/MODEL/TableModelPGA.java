/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_PGA;
import POJO.POJO_PGA;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trung
 */
public class TableModelPGA extends  AbstractTableModel {
    ArrayList<POJO_PGA> listS;
    DAO_PGA pga=new DAO_PGA();

    public TableModelPGA()  {
        listS=pga.getlistPGA();
    }
    public POJO_PGA getByIndex(int rowIndex)
    {
        return listS.get(rowIndex);
    }
    protected ListSelectionModel selectionModel;
    public int getSelectedRow() {
        return selectionModel.getMinSelectionIndex();
    }
    @Override
    public int getRowCount() {
        return listS.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         POJO_PGA pga=listS.get(rowIndex);
         switch(columnIndex){
            case 0: return pga.getName();
            case 1: return pga.getValue();
            default :return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NAME";
            case 1: return "Value";
         
            default :return null;
        }
    }
    
    
}
