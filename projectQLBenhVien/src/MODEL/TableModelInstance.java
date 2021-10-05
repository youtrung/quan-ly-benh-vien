/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_Instance;
import POJO.POJO_Instance;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trung
 */
public class TableModelInstance extends  AbstractTableModel {
    ArrayList<POJO_Instance> listS;
    DAO_Instance Ins=new DAO_Instance();

    public TableModelInstance() {
        listS=Ins.getlistIntance();
    }
    
    
    
    @Override
    public int getRowCount() {
         return listS.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_Instance Ins=listS.get(rowIndex);
        switch(columnIndex){
            case 0: return Ins.getVersion();
            case 1: return Ins.getHostname();
            case 2: return Ins.getStartuptime();
            case 3: return Ins.getInstancename();
            default :return null;
        }
    }

    @Override
    public String getColumnName(int column) {
         switch(column){
            case 0: return "Version";
            case 1: return "Hostname";
            case 2: return "Startuptime";
            case 3: return "Instancename(SID)";
            default :return null;
        }
    }
    
    
}
