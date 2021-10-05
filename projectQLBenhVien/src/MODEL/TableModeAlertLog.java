/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
import DAO.DAO_AlertLog;
import POJO.POJO_AlertLog;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author rongt
 */
public class TableModeAlertLog extends  AbstractTableModel {
    ArrayList<POJO_AlertLog> listAlert;
    DAO_AlertLog alertl=new DAO_AlertLog();
    
    public TableModeAlertLog() {
        listAlert= alertl.getlistAlertlog();
    }
    @Override
    public int getRowCount() {
        return listAlert.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_AlertLog alertl=listAlert.get(rowIndex);
        switch(columnIndex){
            case 0: return alertl.getInst();
            case 1: return alertl.getName();
            case 2: return alertl.getValue();
            case 3: return alertl.getCon();
            default :return null;
        }
    }
    
        public String getColumnName(int column) {
        switch(column){
            case 0: return "INST_ID";
            case 1: return "NAME";
            case 2: return "VALUE";
            case 3: return "CON_ID";
            default :return null;
        }
    }
    
}
