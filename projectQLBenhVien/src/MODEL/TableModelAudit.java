/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_AUDIT;
import POJO.POJO_AUDIT;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trung
 */
public class TableModelAudit extends  AbstractTableModel {
    ArrayList<POJO_AUDIT> list;
    DAO_AUDIT dao=new DAO_AUDIT();
    public TableModelAudit()
    {
        list=dao.getlist();
    }
    public void addElement(POJO_AUDIT pojo)
    {
        list.add(pojo);
        super.fireTableDataChanged();
    }
    public void reloadTables()
    {
       super.fireTableDataChanged();
    }
     public void removeElement(POJO_AUDIT pojo){
           list.remove(pojo);
         super.fireTableDataChanged();
    }
      public POJO_AUDIT getByIndex(int rowIndex)
    {
        return list.get(rowIndex);
    }
      protected ListSelectionModel selectionModel;
      public int getSelectedRow() {
        return selectionModel.getMinSelectionIndex();
    }
      public void removeByIndex(int rowIndex){
        list.remove(rowIndex);
        super.fireTableDataChanged();
    }
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          POJO_AUDIT pojo=list.get(rowIndex);
          switch(columnIndex)
        {
            case 0:return pojo.getOBJECT_SCHEMA();
            case 1:return pojo.getOBJECT_NAME();
            case 2:return pojo.getPOLICY_OWNER();
            case 3:return pojo.getPOLICY_NAME();
            case 4:return pojo.getENABLED();
            case 5:return pojo.getPOLICY_TEXT();
            case 6:return pojo.getPOLICY_COLUMN();
            case 7:return pojo.getAUDIT_TRAIL();
            case 8:return pojo.getPOLICY_COLUMN_OPTIONS();
            
            default :return null;
        }
          
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:return "OBJECT_SCHEMA";
            case 1:return "OBJECT_NAME";
            case 2:return "POLICY_OWNER";
            case 3:return "POLICY_NAME";
            case 4:return "ENABLED";
            case 5:return "POLICY_TEXT";
            case 6:return "POLICY_COLUMN";
            case 7:return "AUDIT_TRAIL";
            case 8:return "POLICY_COLUMN_OPTIONS";
            default :return null;
        }
    }
    
    
}
