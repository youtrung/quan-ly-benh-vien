/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import javax.swing.table.AbstractTableModel;
import DAO.DAO_Logfile;
import POJO.POJO_Logfile;
import java.util.ArrayList;
/**
 *
 * @author rongt
 */
public class TableModelLogfile extends  AbstractTableModel {
    ArrayList<POJO_Logfile> listLog;
    DAO_Logfile log=new DAO_Logfile();
    
        public TableModelLogfile() {
        listLog=log.getlistLogfile();
    }
    
    @Override
    public int getRowCount() {
        return listLog.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       POJO_Logfile log=listLog.get(rowIndex);
        switch(columnIndex){
            case 0: return log.getGroup();
            case 1: return log.getStatus();
            case 2: return log.getType();
            case 3: return log.getMember();
            case 4: return log.getRecovery();
            case 5: return log.getId();
            default :return null;
        }
    }
    
    public String getColumnName(int column) {
        switch(column){
            case 0: return "GROUP#";
            case 1: return "STATUS";
            case 2: return "TYPE";
            case 3: return "MEMBER";
            case 4: return "IS_RECOVERY_DEST_FILE";
            case 5: return "CON_ID";
            default :return null;
        }
    }
}
