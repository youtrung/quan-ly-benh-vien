/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_Profiles;
import POJO.POJO_Profiles;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class TableModelProfiles extends  AbstractTableModel {
    ArrayList<POJO_Profiles> list;
    DAO_Profiles p=new DAO_Profiles();

    public TableModelProfiles() {
        list=p.getListProfiles();
    }
    public TableModelProfiles(String name) {
        list=p.searchProfile(name);
    }
    public void addElement(POJO_Profiles a)
    {
        list.add(a);
        super.fireTableDataChanged();
    }
    public void removeElement(POJO_Profiles a)
    {
        list.remove(a);
        super.fireTableDataChanged();
    }
    public POJO_Profiles getByIndex(int rowIndex)
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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     POJO_Profiles p=list.get(rowIndex);
         switch(columnIndex){
            case 0: return p.getProfiles();
            case 1: return p.getResources_name();
            case 2: return p.getLimit();
            default :return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Profiles";
            case 1: return "Resources_name";
            case 2: return "Limit";
            default :return null;
        }
    }
    
    
}
