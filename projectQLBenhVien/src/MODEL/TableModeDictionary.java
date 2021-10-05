/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
import DAO.DAO_Dictionary;
import POJO.POJO_Dictionary;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author rongt
 */
public class TableModeDictionary extends  AbstractTableModel {
    ArrayList<POJO_Dictionary> listDictionary;
    DAO_Dictionary dictionary=new DAO_Dictionary();

    public TableModeDictionary()
    {
        listDictionary=dictionary.getlistDictionary();
    }
    @Override
    public int getRowCount() {
        return listDictionary.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_Dictionary dictionary=listDictionary.get(rowIndex);
        switch(columnIndex){
            case 0: return dictionary.getName();
            case 1: return dictionary.getComment();
            default :return null;
        }
    }
    
        public String getColumnName(int column) {
        switch(column){
            case 0: return "NAME";
            case 1: return "COMMENTS";
            default :return null;
        }
    }
}
