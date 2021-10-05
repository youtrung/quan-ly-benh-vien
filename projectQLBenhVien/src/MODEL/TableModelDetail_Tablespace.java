/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_Tablespace;
import POJO.POJO_Tablespace;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trung
 */
public class TableModelDetail_Tablespace extends AbstractTableModel {
    ArrayList<POJO_Tablespace> lsTbls;
    DAO_Tablespace tblS=new DAO_Tablespace();

    public TableModelDetail_Tablespace() {
        lsTbls=tblS.getlistDetailDatafile();
    }
      public TableModelDetail_Tablespace(String name) {
        lsTbls=tblS.searchTablespace(name);
    }
    public void addElement(POJO_Tablespace tbl)
    {
        lsTbls.add(tbl);
        super.fireTableDataChanged();
    }
    public void reloadTables()
    {
       super.fireTableDataChanged();
    }
    public void removeElement(POJO_Tablespace tbl){
           lsTbls.remove(tbl);
         super.fireTableDataChanged();
    }
    public POJO_Tablespace getByIndex(int rowIndex)
    {
        return lsTbls.get(rowIndex);
    }
    protected ListSelectionModel selectionModel;
      public int getSelectedRow() {
        return selectionModel.getMinSelectionIndex();
    }
    public void removeByIndex(int rowIndex){
        lsTbls.remove(rowIndex);
        super.fireTableDataChanged();
    }
    @Override
    public int getRowCount() {
        return lsTbls.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_Tablespace tblS=lsTbls.get(rowIndex);
        switch(columnIndex)
        {
            case 0:return tblS.getName();
            case 1:return tblS.getName_datafile();
            case 2:return tblS.getBytes();
            default :return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column)
        {
            case 0:return "TableSpace";
            case 1:return "Name";
            case 2:return "Kích thước";
            default :return null;
        }
    }
    
    
}
