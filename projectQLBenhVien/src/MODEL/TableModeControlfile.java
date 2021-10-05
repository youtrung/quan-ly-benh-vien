/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_Controlfile;
import POJO.POJO_Controlfile;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author rongt
 */
public class TableModeControlfile extends  AbstractTableModel {
    ArrayList<POJO_Controlfile> listCtrl;
    DAO_Controlfile ctrlf=new DAO_Controlfile();

    public TableModeControlfile() {
        listCtrl=ctrlf.getlistControlfile();
    }
    
    public int getRowCount() {
        return listCtrl.size();
    }

    public int getColumnCount() {
        return 1;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_Controlfile ctrlf=listCtrl.get(rowIndex);
        switch(columnIndex){
            case 0: return ctrlf.getName();
            default :return null;
        }
    }
        
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NAME";
            default :return null;
        }
    }
}
