/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_SGA;
import POJO.POJO_SGA;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trung
 */
public class TableModelSGA extends  AbstractTableModel {
    ArrayList<POJO_SGA> listS;
    DAO_SGA sga=new DAO_SGA();

    public TableModelSGA() {
        listS=sga.getlistSGA();
    }
    
    
   
    @Override
    public int getRowCount() {
        return listS.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_SGA sga=listS.get(rowIndex);
        switch(columnIndex){
            case 0: return sga.getName();
            case 1: return sga.getValue();
            case 2: return sga.getID();
            default :return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NAME";
            case 1: return "VALUE";
            case 2: return "CON_ID";
            default :return null;
        }
    }
    
    
}
