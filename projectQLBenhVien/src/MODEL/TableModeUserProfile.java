/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
import POJO.POJO_UserProfile;
import DAO.DAO_UserProfile;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author rongt
 */
public class TableModeUserProfile extends  AbstractTableModel {
        ArrayList<POJO_UserProfile> listUser;
    DAO_UserProfile userprofile=new DAO_UserProfile();
    
    public TableModeUserProfile() {
        listUser= userprofile.getlistUserProfile();
    }
        @Override
    public int getRowCount() {
        return listUser.size();
    }
    public void addElement(POJO_UserProfile tbl)
    {
        listUser.add(tbl);
        super.fireTableDataChanged();
    }

        @Override
    public int getColumnCount() {
        return 9;
    }

        @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        POJO_UserProfile userprofile=listUser.get(rowIndex);
        switch(columnIndex){
            case 0: return userprofile.getUsername();
            case 1: return userprofile.getStatus();
            case 2: return userprofile.getExpiry_date();
            case 3: return userprofile.getCreated();
            case 4: return userprofile.getProfile();
            case 5: return userprofile.getDefault_table();
            case 6: return userprofile.getTeporary_table();
            case 7: return userprofile.getLocal_temp_table();
            case 8: return userprofile.getLast_login();
            default :return null;
        }
    }
    
        public String getColumnName(int column) {
        switch(column){
            case 0: return "USERNAME";
            case 1: return "ACCOUNT_STATUS";
            case 2: return "EXPIRY_DATE";
            case 3: return "CREATED";
            case 4: return "PROFILE";
            case 5: return "DEFAULT_TABLESPACE";
            case 6: return "TEMPORARY_TABLESPACE";
            case 7: return "LOCAL_TEMP_TABLESPACE";
            case 8: return "LAST_LOGIN";
            default :return null;
        }
    }

    public POJO_UserProfile getByIndex(int rowIndex) {
        return listUser.get(rowIndex);
    }
}
