/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import javax.swing.table.AbstractTableModel;
import DAO.DAO_Datafile;
import POJO.POJO_Datafile;
import java.util.ArrayList;
/**
 *
 * @author rongt
 */
public class TableModelDatafile extends  AbstractTableModel  {
    ArrayList<POJO_Datafile> listData;
    DAO_Datafile data=new DAO_Datafile();
    
        public TableModelDatafile() {
        listData=data.getlistDatafile();
    }
    
    @Override
    public int getRowCount() {
        return listData.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       POJO_Datafile data=listData.get(rowIndex);
        switch(columnIndex){
            case 0: return data.getName();
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
