/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAO_Session;
import POJO.POJO_Session;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class TableModelSession extends AbstractTableModel {
ArrayList<POJO_Session> lsTbls;
    DAO_Session tblS=new DAO_Session();

    public TableModelSession() {
        lsTbls=tblS.getlistSession();
    }
    
    public void addElement(POJO_Session tbl)
    {
        lsTbls.add(tbl);
        super.fireTableDataChanged();
    }
    public void reloadTables()
    {
       super.fireTableDataChanged();
    }
    public void removeElement(POJO_Session tbl){
           lsTbls.remove(tbl);
         super.fireTableDataChanged();
    }
    public POJO_Session getByIndex(int rowIndex)
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
     return lsTbls.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_Session ses=lsTbls.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return ses.getSpid();
            case 1: return ses.getSid();
            case 2: return ses.getSerial();
            case 3: return ses.getUsername();
            case 4: return ses.getProgram();
            default :return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column)
        {
            case 0: return "Spid";
            case 1: return "Sid";
            case 2: return "Serial";
            case 3: return "User Name";
            case 4: return "Program";
            default: return null;
        }//To change body of generated methods, choose Tools | Templates.
        
    }
    
}
