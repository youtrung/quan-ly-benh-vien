/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_Roles;
import POJO.POJO_Roles;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class TableModelRoles extends AbstractTableModel {
        ArrayList<POJO_Roles> list;
        DAO_Roles ro= new DAO_Roles();

    public TableModelRoles() {
        list=ro.getlistRoles();
    }
    public TableModelRoles(String name) {
       // list=ro.searchProfile(name);
    }
    public void addElement(POJO_Roles a)
    {
        list.add(a);
        super.fireTableDataChanged();
    }
    public void removeElement(POJO_Roles a)
    {
        list.remove(a);
        super.fireTableDataChanged();
    }
    public POJO_Roles getByIndex(int rowIndex)
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
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_Roles ro=list.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return ro.getRoles();
            case 1: return ro.getAuthenticationtype();
            default :return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column)
        {
            case 0: return "ROLES";
            case 1: return "AUTHENTICATION_TYPE";
            default :return null;
        }
    }
    
    
}
